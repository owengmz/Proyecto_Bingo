package proyectobingo;
import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

/**
 *
 * @author Heber Gomez
 */
public class ReproductorAudio {

    public static void reproducir (int numero) {
        try {
            URL sonido = ReproductorAudio.class
                .getResource("/sonido/" + numero + ".wav");
            if (sonido == null) {
                System.out.println("Audio no encontrado: " + numero);
                return;
            }
            AudioInputStream audio = AudioSystem.getAudioInputStream(sonido);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        }
        catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
