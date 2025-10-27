package proyectobingo;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Voz {

    private static final String VOICE_NAME = "kevin16";
    private static final String[] numerosTexto = {
        "", // índice 0 no se usa
        "uno el niño", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve",
        "diez", "once", "doce", "trece", "catorce", "quince",
        "dieciséis", "diecisiete", "dieciocho", "diecinueve",
        "veinte", "veintiuno", "veintidós los dos patitos", "veintitrés", "veinticuatro", "veinticinco",
        "veintiséis", "veintisiete", "veintiocho", "veintinueve",
        "treinta", "treinta y uno", "treinta y dos", "treinta y tres", "treinta y cuatro",
        "treinta y cinco", "treinta y seis", "treinta y siete", "treinta y ocho", "treinta y nueve",
        "cuarenta", "cuarenta y uno", "cuarenta y dos", "cuarenta y tres", "cuarenta y cuatro",
        "cuarenta y cinco", "cuarenta y seis", "cuarenta y siete", "cuarenta y ocho", "cuarenta y nueve",
        "cincuenta", "cincuenta y uno", "cincuenta y dos", "cincuenta y tres", "cincuenta y cuatro",
        "cincuenta y cinco", "cincuenta y seis", "cincuenta y siete", "cincuenta y ocho", "cincuenta y nueve",
        "sesenta", "sesenta y uno", "sesenta y dos", "sesenta y tres", "sesenta y cuatro",
        "sesenta y cinco", "sesenta y seis", "sesenta y siete", "sesenta y ocho", "sesenta y nueve",
        "setenta", "setenta y uno", "setenta y dos", "setenta y tres", "setenta y cuatro",
        "setenta y cinco", "setenta y seis", "setenta y siete", "setenta y ocho", "setenta y nueve",
        "ochenta", "ochenta y uno", "ochenta y dos", "ochenta y tres", "ochenta y cuatro",
        "ochenta y cinco", "ochenta y seis", "ochenta y siete", "ochenta y ocho", "ochenta y nueve",
        "noventa"
    };

    public static void decirNumero (int numero) {
        // Inicializa la voz
        System.setProperty("freetts.voices",
            "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice = VoiceManager.getInstance().
            getVoice(VOICE_NAME);
        if (voice != null) {
            voice.allocate();
            String texto = numerosTexto[numero]; // <--- CORRECCIÓN
            voice.speak(texto);
            voice.deallocate();
        }
        else {
            System.out.println("No se encontró la voz.");
        }
    }
}
