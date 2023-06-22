package Animais;

public class Peixe extends Animal{

    String caracteristicas;

    public Peixe(String nome, double comprimento, String cor, double velocidade) {
        super(nome, comprimento, cor, "mar", velocidade);
        this.numPatas = 0;
        this.caracteristicas = "barbatanas e cauda";
    }

}



