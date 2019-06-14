import Animais.Interfaces.Animal;
import Enums.Alimento;
import Enums.Localizacao;
import Enums.Sexo;
import Instalacao.Animais.FabricaInstalacao;
import Instalacao.ElementoInstalacao;
import Instalacao.Instalacao;
import Zoo.Zoologico;
import Animais.*;
import java.util.ArrayList;

public class Main {

    public static ArrayList<Animal> criaAnimais(){
        Elefante elefante = new Elefante(Sexo.MASCULINO);
        Baleia baleia = new Baleia(Sexo.FEMININO);
        Foca foca = new Foca(Sexo.FEMININO);
        Leao leao = new Leao(Sexo.MASCULINO);
        Macaco macaco = new Macaco(Sexo.MASCULINO);
        PeixeBoi peixeBoi = new PeixeBoi(Sexo.MASCULINO);
        Pinguim pinguim = new Pinguim(Sexo.FEMININO);
        Tartaruga tartaruga = new Tartaruga(Sexo.FEMININO);
        Tubarao tubarao = new Tubarao(Sexo.MASCULINO);
        Zebra zebra = new Zebra(Sexo.FEMININO);

        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(baleia);
        animais.add(elefante);
        animais.add(foca);
        animais.add(leao);
        animais.add(macaco);
        animais.add(peixeBoi);
        animais.add(pinguim);
        animais.add(tartaruga);
        animais.add(tubarao);
        animais.add(zebra);

        return animais;
    }

    public static void printaAnimais(Animal animal){
        String acao;
        System.out.println(animal.getClass().getSimpleName());
        System.out.println("Sexo: " + animal.getSexo());
        System.out.println("Porte: " + animal.getPorte());

        for(Alimento alimento : Alimento.values()){
            if (animal.Alimentar(alimento)) {
                acao = " comeu ";
            }
            else{
                acao = " não come ";
            }
            System.out.println(animal.getClass().getSimpleName() + acao + alimento);
        }
        System.out.println(animal.getClass().getSimpleName() + " diz:");
        animal.locomover();
        System.out.println();
    }


    public static void TestaAnimais(){
        ArrayList<Animal> animais = criaAnimais();


        for(Animal animal : animais){
            printaAnimais(animal);
        }
    }

    public static ArrayList<Instalacao> criaInstalacoes()
    {
        ArrayList<Instalacao> instalacoes = new ArrayList<Instalacao>();

        instalacoes.add(FabricaInstalacao.criaInstalacaoBaleia(Localizacao.CENTROESTE));
        instalacoes.add(FabricaInstalacao.criaInstalacaoElefante(Localizacao.LESTE));
        instalacoes.add(FabricaInstalacao.criaInstalacaoFoca(Localizacao.NORDESTE));
        instalacoes.add(FabricaInstalacao.criaInstalacaoLeao(Localizacao.NOROESTE));
        instalacoes.add(FabricaInstalacao.criaInstalacaoMacaco(Localizacao.NORTE));
        instalacoes.add(FabricaInstalacao.criaInstalacaoPeixeBoi(Localizacao.OESTE));
        instalacoes.add(FabricaInstalacao.criaInstalacaoPinguim(Localizacao.SUL));
        instalacoes.add(FabricaInstalacao.criaInstalacaoTartaruga(Localizacao.SULDESTE));
        instalacoes.add(FabricaInstalacao.criaInstalacaoTubarao(Localizacao.SULDOESTE));
        instalacoes.add(FabricaInstalacao.criaInstalacaoZebra(Localizacao.CENTROESTE));

        return instalacoes;
    }

    public static void printaInstalacao(Instalacao instalacao){
        System.out.println(instalacao.getClass().getSimpleName());
        System.out.println("Localizacao: " + instalacao.getLocalizacao());
        System.out.println("Capacidade max: " + instalacao.getCapacidadeMaxima());
        System.out.println("Temperatura: " + instalacao.getTemperatura());
        for(ElementoInstalacao elemento: instalacao.getElementosInstalacao()) {
            System.out.println(elemento.getClass().getSimpleName());
        }
        System.out.println("Animais:");
        for(Animal animal : instalacao.getAnimaisInstalados()){
            printaAnimais(animal);
        }
    }

    public static ArrayList<Instalacao> TestaInstalacoes()
    {
        ArrayList<Instalacao> instalacoes = criaInstalacoes();
        ArrayList<Animal> animais = criaAnimais();


        for(Instalacao instalacao : instalacoes) {
            printaInstalacao(instalacao);
            for(Animal animal : animais){
                instalacao.adicionarAnimais(animal);
            }
            System.out.println();
        }
        return instalacoes;
    }


    public static void main(String[] args)
    {
        TestaAnimais();
        ArrayList<Instalacao> instalacoes = TestaInstalacoes();
        Zoologico zoo = new Zoologico();

        for(Instalacao instalacao : instalacoes){
            if(zoo.adicionarInstalacao(instalacao)){
                System.out.println(instalacao.getClass().getSimpleName() + " adicionada com sucesso");
            }
            else{
                System.out.println(instalacao.getClass().getSimpleName() + " nao pode ser adicionada");
            }
            printaInstalacao(instalacao);
            System.out.println();
        }

        printaInstalacao(zoo.getInstalacao(Localizacao.SULDOESTE));
        zoo.getInstalacao(Localizacao.SULDOESTE).adicionarAnimais(new Tubarao(Sexo.FEMININO));
        zoo.getInstalacao(Localizacao.SULDOESTE).adicionarAnimais(new Tubarao(Sexo.MASCULINO));
        printaInstalacao(zoo.getInstalacao(Localizacao.SULDOESTE));
    }
}
