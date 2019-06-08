package Animais.Interfaces;

public interface Aquatico extends Animal {
    default void nadar() {
        System.out.println("Estou nadando!");
    }
}
