package Animais;

public class Mamifero extends Animal {

    String alimento;

    public Mamifero(String nome, double comprimento, String cor, double velocidade) {
        super(nome, comprimento, cor, "terra", velocidade);
    }

}
