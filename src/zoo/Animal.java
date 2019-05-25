package zoo;

public interface Animal {
    boolean Alimentar(Alimento alimento);

    void locomover();

    Sexo getSexo();

    void setSexo(Sexo sexo);

    Porte getPorte();

    void setPorte(Porte porte);
}