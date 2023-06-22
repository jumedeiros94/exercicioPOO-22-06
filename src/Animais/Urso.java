package Animais;

class Urso extends Mamifero {

    public Urso(String nome, double comprimento) {
        super(nome, comprimento, "castanho", 1.5);
        this.alimento = "mel";
    }
}