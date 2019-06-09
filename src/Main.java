import Animais.*;
import Animais.Interfaces.Animal;
import Enums.Alimento;
import Enums.Localizacao;
import Enums.Sexo;
import Instalacao.Animais.FabricaInstalacao;
import Instalacao.Instalacao;
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
        animais.add(elefante);
        animais.add(baleia);
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
    public static void main(String[] args)
    {
        System.out.println("teste");

        Elefante elef = new Elefante(Sexo.FEMININO);
        Elefante elef2 = new Elefante(Sexo.FEMININO);
        Elefante elef3 = new Elefante(Sexo.FEMININO);


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

        Zoologico zoo = new Zoologico();

        boolean foi = zoo.adicionarInstalacao(FabricaInstalacao.criaInstalacaoElefante(Localizacao.CENTROESTE));
        System.out.print(foi);
        foi = zoo.adicionarInstalacao(FabricaInstalacao.criaInstalacaoElefante(Localizacao.CENTROESTE));
        System.out.print(foi);

        Instalacao ints = FabricaInstalacao.criaInstalacaoElefante(Localizacao.CENTROESTE);

        if(ints.adicionarAnimais(elef)){
            System.out.println(elef.getClass().getSimpleName() + "add");
        }
        if(ints.adicionarAnimais(elef2)){
            System.out.println(elef.getClass().getSimpleName() + "add");
        }
        if(ints.adicionarAnimais(elef3)){
            System.out.println(elef.getClass().getSimpleName() + "add");
        }

        TestaAnimais();

    }
}
