import Animais.*;
import Enums.Alimento;
import Enums.Localizacao;
import Enums.Sexo;
import Instalacao.Animais.FabricaInstalacao;
import Instalacao.Instalacao;
import Zoo.Zoologico;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("teste");
        Zoologico zoo = new Zoologico();

        Elefante elef = new Elefante(Sexo.FEMININO);
        Elefante elef2 = new Elefante(Sexo.FEMININO);
        Elefante elef3 = new Elefante(Sexo.FEMININO);


        for (Alimento comida : Alimento.values()) {
            String comeu;
            if(elef.Alimentar(comida)){
                comeu = " comeu ";
            }
            else{
                comeu = " não comeu ";
            }
            System.out.println(elef.getClass().getSimpleName() + comeu + comida);
        }

        zoo.adicionarInstalacao(FabricaInstalacao.criaInstalacaoElefante(Localizacao.CENTROESTE));

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

    }
}
