import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String text = sc.nextLine();

        if(text.isEmpty()){
            System.out.println("El programa termino.");
        } else {
            System.out.print("Ingrese una palabra para encontrar en el texto: ");
            String word = sc.nextLine();

            if(text.contains(word)){
                System.out.println("Se encontro la palabra");
            } else{
                System.out.println("No se encontro la palabra");
            }
        }
    }
}
