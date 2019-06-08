package Animais;

import Animais.Interfaces.Aquatico;
import Enums.Alimento;
import Enums.Porte;
import Enums.Sexo;

public class Baleia implements Aquatico {
    private Sexo sexo;
    private Porte porte;

    public Baleia(Sexo sexo){
        this.sexo = sexo;
        this.porte = Porte.GRANDE;
    }

    @Override
    public boolean Alimentar(Alimento alimento) {
        return alimento.equals(Alimento.PEIXES);
    }

    @Override
    public void locomover() {
        nadar();
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
