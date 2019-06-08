import Animais.Baleia;
import Enums.Alimento;
import Enums.Sexo;
import Zoo.Zoologico;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("teste");
        Zoologico zoo = new Zoologico();

        Baleia baleia = new Baleia(Sexo.FEMININO);

        for (Alimento comida : Alimento.values()) {
            String comeu;
            if(baleia.Alimentar(comida)){
                comeu = " comeu ";
            }
            else{
                comeu = " não comeu ";
            }
            System.out.println(baleia.getClass().getSimpleName() + comeu + comida);
        }


    }
}
