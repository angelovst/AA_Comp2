import Animais.*;
import Animais.Interfaces.Animal;
import Enums.Alimento;
import Enums.Localizacao;
import Enums.Sexo;
import Instalacao.Animais.FabricaInstalacao;
import Instalacao.Instalacao;
import Instalacao.ElementoInstalacao;
import Zoo.Zoologico;

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
    public static void TestaAnimais(){
        ArrayList<Animal> animais = criaAnimais();
        String acao;

        for(Animal animal : animais){
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
    }

    public static ArrayList<Instalacao> TestaInstalacoes()
    {
        ArrayList<Instalacao> instalacoes = criaInstalacoes();
        ArrayList<Animal> animais = criaAnimais();


        for(Instalacao instalacao : instalacoes) {
            printaInstalacao(instalacao);
            for(Animal animal : animais){
                if(instalacao.adicionarAnimais(animal)){
                    System.out.println(animal.getClass().getSimpleName() + " inserido com sucesso");
                }
                else{
                    System.out.println(animal.getClass().getSimpleName() + " não pode ser inserido em " + instalacao.getClass().getSimpleName());
                }
            }
            System.out.println();
        }
        return instalacoes;
    }

    public static void main(String[] args)
    {/*
        Elefante elef = new Elefante(Sexo.FEMININO);
        Baleia bal = new Baleia(Sexo.FEMININO);


        for (Alimento comida : Alimento.values()) {
            String comeu;
            if(elef.Alimentar(comida)){
                comeu = " comeu ";
            }
            else{
                comeu = " não come ";
            }
            System.out.println(elef.getClass().getSimpleName() + comeu + comida);
        }

        boolean foi = zoo.adicionarInstalacao(FabricaInstalacao.criaInstalacaoElefante(Localizacao.CENTROESTE));
        System.out.println(foi);
        foi = zoo.adicionarInstalacao(FabricaInstalacao.criaInstalacaoElefante(Localizacao.CENTROESTE));
        System.out.println(foi);

        Instalacao ints = FabricaInstalacao.criaInstalacaoElefante(Localizacao.CENTROESTE);

        if(ints.adicionarAnimais(elef)){
            System.out.println(elef.getClass().getSimpleName() + "add");
        }
        if(ints.adicionarAnimais(bal)){
            System.out.println(bal.getClass().getSimpleName() + "add");
        }
        */
        TestaAnimais();
        TestaInstalacoes();
        Zoologico zoo = new Zoologico();

    }
}
