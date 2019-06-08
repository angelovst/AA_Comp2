package Animais;

import Animais.Interfaces.Anfibio;
import Enums.Alimento;
import Enums.Porte;
import Enums.Sexo;

public class Foca implements Anfibio {
    private Sexo sexo;
    private Porte porte;

    public Foca(Sexo sexo){
        this.sexo = sexo;
        this.porte = Porte.MEDIO;
    }

    @Override
    public boolean Alimentar(Alimento alimento) {
        return alimento.equals(Alimento.PEIXES);
    }

    @Override
    public void locomover() {

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
