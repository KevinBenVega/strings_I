import java.util.Scanner;

public class ejercicio08_2_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String peliculaAdivinar = "Godzilla Minus Zero";
        String peliculaOculta = "";
        int intentos = 3;


        System.out.println("Bienvenido al Mini juego del ahorcado");
        System.out.println("Intenta adivinar la película");

        for (int i = 0; i < peliculaAdivinar.length(); i++) {
            if (i == 0){
                peliculaOculta += peliculaAdivinar.charAt(i);
            } else if (peliculaAdivinar.charAt(i) == ' ') {
                peliculaOculta += " ";
            } else {
                peliculaOculta += "*";
            }
        }

        char[] caracteresOcultos = peliculaOculta.toCharArray();

        while (peliculaOculta.contains("*") && (intentos > 0 && intentos < 4)){
            boolean acierto = false;
            System.out.println(peliculaOculta);
            System.out.println("Introduce una letra:");

            char letraIntoducida = sc.next().charAt(0);

            for (int i = 1; i < peliculaAdivinar.length(); i++) {
                if(Character.toLowerCase(peliculaAdivinar.charAt(i)) == Character.toLowerCase(letraIntoducida)){
                    caracteresOcultos[i] = peliculaAdivinar.charAt(i);
                    acierto = true;
                }

            }

            if (!acierto) {
                intentos--;
                System.out.println("Letra incorrecta. Te quedan: " + intentos + " intento(s)");
            }

            System.out.println("");

            peliculaOculta = new String(caracteresOcultos);
        }

        System.out.println("Terminaste el juego");

        if (!peliculaOculta.contains("*")) {
            System.out.println("¡Felicidades! Adivinaste la película: " + peliculaAdivinar);
        } else {
            System.out.println("Te quedaste sin intentos.");
        }

    }
}
