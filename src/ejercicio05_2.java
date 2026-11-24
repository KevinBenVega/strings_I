import java.util.Scanner;

public class ejercicio05_2 {
    public static void main(String[] args) {
        String[] catalogo = {"Los muertos vivientes",
                "Brevísima historia del tiempo",
                "La clave secreta del universo",
                "Mi universo", "Patria",
                "De mayor quiero ser feliz",
                "Empieza por los zapatos"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a nuestra biblioteca");
        System.out.print("Escribe el titulo del libro que quieres buscar: ");
        String book = sc.nextLine();
        Boolean bookFounded = false;

        for (int i = 0; (i < catalogo.length); i++) {
            if(catalogo[i].contains(book)){
                System.out.println(catalogo[i]);
                bookFounded = true;
            }
        }

        if(!bookFounded) {
            System.out.println("Libro no localizado");
        }
    }
}
