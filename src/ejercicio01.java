public class ejercicio01 {
    public static void main(String[] args) {

        double d = 858.48;
        String s = String.valueOf(d);
        int dot = s.indexOf('.');
        System.out.println(dot+" digits before decimal point");
        System.out.println((s.length()-dot-1)+" digits after decimal point");

        // Aparece
        // 3 digits before decimal point
        // 2 digits after decimal point

        // Se utiliza Sting.valueOf() e indexOf()
        // El primero es estatico y el segundo de instancia

        // La primera sirve para convertir el double a string y el segundo
        // te da la posicion del elemento que tiene en ()

        // El primero devuelve "858.48", mientras que el segundo
        // devuelve 3

        // El primero tiene como parametro el double d, mientras que el segundo
        // tiene como parametro "."
    }
}
