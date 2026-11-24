import java.util.Scanner;

public class ejercicio08_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String peliculaAdivinar = "Godzilla Minus Zero";
        String palabraOculta = "";

        System.out.println("Bienvenido al Mini juego del ahorcado");
        System.out.println("Intenta adivinar la película");

        for (int i = 0; i < peliculaAdivinar.length(); i++) {
            if (i == 0){
                palabraOculta += peliculaAdivinar.charAt(i);
            } else if (peliculaAdivinar.charAt(i) == ' ') {
                palabraOculta += " ";
            } else {
                palabraOculta += "*";
            }
        }

        System.out.println(palabraOculta);

    }
}
