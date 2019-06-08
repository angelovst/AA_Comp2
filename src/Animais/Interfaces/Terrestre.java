package Animais.Interfaces;

public interface Terrestre extends Animal {
    default void andar() {
        System.out.println("Estou andando!");
    }
}
