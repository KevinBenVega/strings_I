import java.util.Scanner;

public class ejercicio07 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] preguntas = {
                "¿Cuál de las siguientes opciones no es un tipo primitivo en Java?",
                "¿Qué palabra reservada se utiliza para declarar una constante en Java?",
                "¿Cuál es el tipo de dato que permite almacenar números enteros de mayor capacidad que int?",
                "¿Qué operador se utiliza para obtener el resto de una división?",
                "¿Cuál es el resultado de la siguiente operación? int resultado = 10 / 3;",
                "¿Qué método permite mostrar información en la consola?",
                "¿Qué clase se utiliza habitualmente para capturar datos introducidos por el usuario?",
                "¿Qué método de Scanner permite leer una línea completa de texto?",
                "¿Cuál de los siguientes es un operador de comparación?",
                "¿Qué valor almacena una variable de tipo boolean?",
                "¿Cuál es el resultado de la expresión System.out.println(5 + 3 * 2)?",
                "¿Qué estructura permite ejecutar un bloque de código cuando se cumple una condición?",
                "¿Qué operador lógico representa la condición Y?",
                "¿Qué operador lógico representa la condición O?",
                "¿Qué ocurre si ninguna condición de un if o else if se cumple y existe un else?",
                "¿Qué instrucción permite seleccionar entre diferentes casos según el valor de una variable?",
                "¿Qué instrucción permite finalizar un caso de un switch tradicional?",
                "¿Cuál es el resultado de la expresión int edad = 18; System.out.println(edad >= 18)?",
                "¿Qué operador se utiliza para incrementar una variable en una unidad?",
                "¿Qué significa el operador !=?",
                "¿Qué bucle se utiliza habitualmente cuando conocemos de antemano el número de repeticiones?",
                "¿Qué bucle garantiza que el bloque de código se ejecute al menos una vez?",
                "¿Qué instrucción permite saltar a la siguiente iteración de un bucle?",
                "¿Cuántas veces se ejecutará un bucle for con la condición i < 5, comenzando i en 0?",
                "¿Qué sucede si la condición de un while siempre es verdadera y no existe ninguna instrucción para salir?",
                "¿Qué muestra el siguiente código? int i = 1; while (i <= 3) { System.out.print(i); i++; }",
                "¿Cómo se declara un array de enteros en Java?",
                "¿Cuál es el índice del primer elemento de un array en Java?",
                "¿Qué propiedad permite conocer el número de elementos de un array?",
                "¿Qué método permite conocer la cantidad de caracteres de un String?",
                "¿Qué método permite comparar el contenido de dos cadenas de texto?",
                "¿Qué método permite convertir una cadena de texto a letras mayúsculas?",
                "¿Qué sucede si intentamos acceder a una posición que no existe en un array?",
                "¿Qué muestra el código int[] numeros = {10, 20, 30, 40}; System.out.println(numeros[2])?",
                "¿Qué palabra reservada se utiliza para devolver un valor desde un método?",
                "¿Qué significa que un método tenga el tipo de retorno void?",
                "¿Qué es una clase en Java?",
                "¿Qué es un objeto en programación orientada a objetos?",
                "¿Qué palabra reservada se utiliza para crear una instancia de una clase?",
                "¿Qué método es el punto de entrada de un programa Java?",
                "¿Qué tipo de dato se utiliza para almacenar números decimales de mayor precisión que float?",
                "¿Qué operador se utiliza para asignar un valor a una variable?",
                "¿Qué palabra reservada permite declarar una clase?",
                "¿Qué significa la palabra reservada static en un método?",
                "¿Qué método convierte un String en un número entero?",
                "¿Qué valor tiene una variable int de una instancia si no se inicializa explícitamente?",
                "¿Qué palabra reservada se utiliza para heredar de otra clase?",
                "¿Qué palabra reservada se utiliza para acceder al objeto actual?",
                "¿Qué excepción puede producirse al intentar dividir un entero entre cero?",
                "¿Qué método permite obtener un carácter de una posición determinada de un String?"
        };

        String[] opcionesA = {
                "int",
                "static",
                "float",
                "/",
                "3.33",
                "System.in.println()",
                "Input",
                "next()",
                "=",
                "Cualquier número",
                "16",
                "for",
                "||",
                "&&",
                "El programa se detiene",
                "if",
                "stop",
                "false",
                "--",
                "Igual a",
                "if",
                "for",
                "break",
                "4 veces",
                "Se ejecuta una sola vez",
                "012",
                "int array;",
                "1",
                "size()",
                "length",
                "==",
                "uppercase()",
                "Devuelve null siempre",
                "10",
                "break",
                "Devuelve un número entero",
                "Una variable especial",
                "Una variable primitiva",
                "class",
                "main()",
                "float",
                "==",
                "new",
                "Es un método que pertenece a la clase y no necesita una instancia",
                "Integer.parseInt()",
                "0",
                "implements",
                "super",
                "NullPointerException",
                "charAt()"
        };

        String[] opcionesB = {
                "char",
                "final",
                "short",
                "%",
                "3",
                "Console.print()",
                "Scanner",
                "nextInt()",
                "==",
                "Una cadena de texto",
                "13",
                "while",
                "&&",
                "||",
                "Se ejecuta el bloque else",
                "switch",
                "exit",
                "true",
                "++",
                "Mayor que",
                "for",
                "while",
                "continue",
                "5 veces",
                "Se produce un error de compilación necesariamente",
                "123",
                "int[] array;",
                "-1",
                "length",
                "length()",
                "equals()",
                "toUpperCase()",
                "Devuelve 0",
                "20",
                "return",
                "No devuelve ningún valor",
                "Una estructura que sirve como plantilla para crear objetos",
                "Una instancia de una clase",
                "this",
                "start()",
                "double",
                "=",
                "class",
                "Es un método que puede ejecutarse sin crear un objeto de la clase",
                "Integer.toString()",
                "null",
                "extends",
                "this",
                "ArithmeticException",
                "substring()"
        };

        String[] opcionesC = {
                "String",
                "const",
                "long",
                "%",
                "3.0",
                "System.out.println()",
                "BufferedReader",
                "nextLine()",
                ">",
                "true o false",
                "11",
                "if",
                "!",
                "!",
                "Se ejecuta el bloque if",
                "case",
                "continue",
                "18",
                "+=",
                "Diferente de",
                "do-while",
                "do-while",
                "return",
                "Depende del valor inicial",
                "Se produce un bucle infinito",
                "1234",
                "int array[];",
                "0",
                "length()",
                "size()",
                "compareTo()",
                "toLowerCase()",
                "Se produce un error de compilación",
                "30",
                "void",
                "El método no puede devolver ningún valor",
                "Una función",
                "Una clase",
                "new",
                "public static void main(String[] args)",
                "BigDecimal",
                "+",
                "interface",
                "Es un método que solo puede utilizarse dentro de la clase",
                "Integer.toString()",
                "-1",
                "implements",
                "super",
                "NumberFormatException",
                "substring()"
        };

        String[] opcionesD = {
                "boolean",
                "constante",
                "byte",
                "/",
                "3.33",
                "print()",
                "String",
                "next()",
                "!=",
                "0 o 1",
                "13",
                "switch",
                "!=",
                "^",
                "Se ejecutan ambos bloques",
                "if",
                "return",
                "Mayor o igual que 18",
                "+=",
                "Igual a",
                "while",
                "for-each",
                "break",
                "10 veces",
                "Se ejecuta una sola vez",
                "321",
                "int[ ] array;",
                "1",
                "size",
                "charAt()",
                "==",
                "toString()",
                "ArrayIndexOutOfBoundsException",
                "40",
                "break",
                "Debe devolver un String",
                "Una variable",
                "Un método",
                "this",
                "start()",
                "float",
                "==",
                "extends",
                "Es una variable que pertenece a un objeto",
                "parseDouble()",
                "null",
                "super",
                "static",
                "NullPointerException",
                "toUpperCase()"
        };

        String[] respuestasCorrectas = {
                "C",
                "B",
                "C",
                "B",
                "B",
                "C",
                "B",
                "C",
                "B",
                "C",
                "C",
                "C",
                "B",
                "B",
                "B",
                "B",
                "D",
                "B",
                "B",
                "C",
                "B",
                "C",
                "B",
                "B",
                "C",
                "B",
                "B",
                "C",
                "B",
                "B",
                "B",
                "B",
                "D",
                "C",
                "B",
                "B",
                "B",
                "B",
                "C",
                "C",
                "B",
                "B",
                "B",
                "B",
                "A",
                "A",
                "B",
                "B",
                "B",
                "A"
        };

        int correctas = 0;

        for (int i = 0; i < preguntas.length; i++) {

            System.out.println("\n" + preguntas[i]);

            System.out.println("a. " + opcionesA[i]);
            System.out.println("b. " + opcionesB[i]);
            System.out.println("c. " + opcionesC[i]);
            System.out.println("d. " + opcionesD[i]);

            String respuesta;

            do {
                System.out.print("Tu respuesta: ");
                respuesta = sc.nextLine().trim().toLowerCase();

                if (!respuesta.equals("a") &&
                        !respuesta.equals("b") &&
                        !respuesta.equals("c") &&
                        !respuesta.equals("d")) {

                    System.out.println("Respuesta no válida: a, b, c, d");
                }

            } while (!respuesta.equals("a") &&
                    !respuesta.equals("b") &&
                    !respuesta.equals("c") &&
                    !respuesta.equals("d"));

            if (respuesta.equals(respuestasCorrectas[i])) {

                System.out.println("¡Respuesta correcta!");
                correctas++;

            } else {

                System.out.println("Respuesta incorrecta, la respuesta correcta es: " + respuestasCorrectas[i]);
            }
        }

        System.out.println("\nRespuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: "
                + (preguntas.length - correctas));
    }
}
