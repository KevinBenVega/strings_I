import java.util.Scanner;

public class ejercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String text = sc.nextLine();

        String textInverted = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            textInverted += text.charAt(i);
        }

        System.out.println(textInverted);

    }
}
