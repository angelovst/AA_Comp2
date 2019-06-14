package Instalacao;

import Animais.Interfaces.Animal;
import Enums.Localizacao;

import java.util.ArrayList;
import java.util.List;

public abstract class Instalacao {
    private int capacidadeMaxima;
    private Localizacao localizacao;
    private double temperatura;
    private List<Animal> animaisInstalados;
    private List<ElementoInstalacao> elementosInstalacao;

    protected Instalacao(int capacidadeMaxima, Localizacao localizacao, double temperatura, List<ElementoInstalacao> elementosInstalacao) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.localizacao = localizacao;
        this.temperatura = temperatura;
        this.animaisInstalados = new ArrayList<>(capacidadeMaxima);
        this.elementosInstalacao = elementosInstalacao;
    }

    public void adicionarAnimais(Animal animal){
        if(animaisInstalados.size() < capacidadeMaxima &&
                animal.getClass().getSimpleName().equals(this.getClass().getSimpleName().replace("Instalacao", ""))){
            animaisInstalados.add(animal);
            System.out.println(animal.getClass().getSimpleName() + " inserido com sucesso em " + this.getClass().getSimpleName());
        }
        else{
            System.out.println(animal.getClass().getSimpleName() + " não pode ser inserido em " + this.getClass().getSimpleName());
        }
        System.out.println();
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public List<ElementoInstalacao> getElementosInstalacao() {
        return elementosInstalacao;
    }

    public List<Animal> getAnimaisInstalados() {
        return animaisInstalados;
    }
}
