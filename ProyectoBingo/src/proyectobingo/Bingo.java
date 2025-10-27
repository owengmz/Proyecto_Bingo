package proyectobingo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Heber Gomez
 */
public class Bingo {

    private int numero;
    private ArrayList<Integer> numeroSalido;
    private Random random;

    public Bingo () {
        this.numero = 0;
        this.numeroSalido = new ArrayList<>();
        this.random = new Random();
    }

    public int getNumero () {
        return numero;
    }

    public void setNumero (int numero) {
        this.numero = numero;
    }

    public ArrayList<Integer> getNumeroSalido () {
        return numeroSalido;
    }

    public void setNumeroSalido (ArrayList<Integer> numeroSalido) {
        this.numeroSalido = numeroSalido;
    }

    public Random getRandom () {
        return random;
    }

    public void setRandom (Random random) {
        this.random = random;
    }

    public int generadorDeNumero () {
        if (numeroSalido.size() == 90) {
            System.out.println("numeros salidos");
            return -1;
        }
        do {
            numero = random.nextInt(90) + 1;
        }
        while (numeroSalido.contains(numero));
        numeroSalido.add(numero);
        return numero;
    }
}
