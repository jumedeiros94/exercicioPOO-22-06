package Animais;

public class Animal{

    String nome;
    double comprimento;
    int numPatas = 4;
    String cor;
    String ambiente;
    double velocidade;

    public Animal(String nome, double comprimento, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;

    }

}
