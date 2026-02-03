/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectobingo;

/**
 *
 * @author OwenLaptop
 */
public class ProyectoBingo {

    public static void main (String[] args) {
        System.out.println("Reproduciendo...");
        ReproductorAudio.reproducir(1);
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
        }
//        Bingo bg = new Bingo();
//        for (int i = 0; i < 3; i ++) { // solo para probar
//            int num = bg.generadorDeNumero();
//            System.out.println("Numero actual: " + num);
//        }
//        System.out.println("\nHistorial: " + bg.getNumeroSalido());
//    
//    Bingo bingo = new Bingo();
//    // Simulamos que presionás "Play" varias veces
//    for (int i = 0; i< 90; i ++) {
//            int num = bingo.generadorDeNumero();
//        if (num == -1) {
//            System.out.println("Ya salieron todos los números");
//            break;
//        }
//        System.out.println("Número actual: " + num);
//        // 🔊 Aquí se activa la voz
//        Voz.decirNumero(num);
//        // Pequeña pausa para que la voz no se superponga
//        try {
//            Thread.sleep(1500); // 1,5 segundos
//        }
//        catch (InterruptedException e) {
//        }
//    }
//
//    System.out.println  ("\nHistorial: " + bingo.getNumeroSalido());
//    }    
    }
}
