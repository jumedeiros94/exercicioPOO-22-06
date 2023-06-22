package Animais;

import java.util.ArrayList;
import java.util.List;

public class MainAnimal {

    public static void main(String[] args) {


        List<Animal> animais = new ArrayList<>();

        animais.add(new Animal("Camelo", 2.0, "Amarelo", "Terra", 2.0));
        animais.add(new Peixe("Tubarão", 3.0, "Cinzenta", 1.5));
        animais.add(new Urso("Urso-do-Canadá", 1.8));
        animais.add(new Animal("Iguana", 0.5, "Verde", "Terra", 0.2));
        animais.add(new Animal("Leão", 1.2, "Amarelo", "Terra", 3.0));
        animais.add(new Mamifero("Mico-leão-dourado", 0.3, "Dourado", 0.4));

        for (Animal animal : animais) {
            System.out.println("Nome: " + animal.nome + ", " + "Comprimento: " + animal.comprimento + ", " + "Número de patas: "+ animal.numPatas + ", " + "Cor: " + animal.cor + ", " + "Ambiente: "+ animal.ambiente + ", " + "Velocidade: " + animal.velocidade);
            if (animal instanceof Peixe) {
                System.out.println(((Peixe) animal).caracteristicas);
            } else if (animal instanceof Urso) {
                System.out.println(((Urso) animal).alimento);
            }
            System.out.println();
        }
    }
}