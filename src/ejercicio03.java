import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String text = sc.nextLine();

        String textUpperCase = text.toUpperCase();
        String textLowerCase = text.toLowerCase();

        System.out.println(textUpperCase);
        System.out.println(textLowerCase);

    }
}
