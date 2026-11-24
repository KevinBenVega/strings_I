public class ejercicio02 {
    public static void main(String[] args) {
        String path = "home/user/index.html";

        int indexDot = path.indexOf(".");
        int indexSep = path.lastIndexOf("/");

        String extensionFichero = path.substring(indexDot + 1);
        String nombreFichero = path.substring(indexSep + 1, indexDot);

        System.out.println(extensionFichero);
        System.out.println(nombreFichero);
    }
}
