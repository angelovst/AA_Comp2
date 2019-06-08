package Animais;

import Animais.Interfaces.Terrestre;
import Enums.Alimento;
import Enums.Porte;
import Enums.Sexo;

public class Macaco implements Terrestre {
    private Sexo sexo;
    private Porte porte;

    public Macaco(Sexo sexo){
        this.sexo = sexo;
        this.porte = Porte.PEQUENO;
    }

    @Override
    public boolean Alimentar(Alimento alimento) {
        return alimento.equals(Alimento.FRUTAS);
    }

    @Override
    public void locomover() {
        andar();
    }

    @Override
    public Sexo getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public Porte getPorte() {
        return porte;
    }

    @Override
    public void setPorte(Porte porte) {
        this.porte = porte;
    }
}
