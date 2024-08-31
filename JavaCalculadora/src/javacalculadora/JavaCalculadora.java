package javacalculadora;

import java.util.Scanner;

public class JavaCalculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Este programa acepta los siguientes simbolos: * / + -");
            System.out.println("Recuerda utilizar el formato correcto, ejemplo: 23+17. Escribe 'salir' para terminar la ejecucion de la calculadora");
            System.out.println(" ");
            System.out.println("Ingresa tu operacion:");
            String opcion = entrada.nextLine();

            // Salir del programa si el usuario ingresa "salir"
            if (opcion.equalsIgnoreCase("salir")) {
                break;
            }

            char[] operadores = {'+', '-', '*', '/'};
            boolean formatoCorrecto = false;

            for (char signo : operadores) {
                if (opcion.contains(String.valueOf(signo))) {
                    formatoCorrecto = true;
                    try {
                        String resultado = realizarOperacion(opcion, signo);
                        System.out.println("Resultado: " + resultado);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Formato de número inválido.");
                    }
                    break;
                }
            }

            if (!formatoCorrecto) {
                System.out.println("Opción inválida. Utilice uno de los operadores permitidos y recuerde utilizar el formato correcto: +, -, *, /");
            }
        }

        entrada.close();
    }

    public static int sumar(String[] partes) {
        int resultado = 0;
        for (String parte : partes) {
            resultado += Integer.parseInt(parte.trim());
        }
        return resultado;
    }

    public static int restar(String[] partes) {
        int resultado = Integer.parseInt(partes[0].trim());
        for (int i = 1; i < partes.length; i++) {
            resultado -= Integer.parseInt(partes[i].trim());
        }
        return resultado;
    }

    public static int multiplicar(String[] partes) {
        int resultado = 1;
        for (String parte : partes) {
            resultado *= Integer.parseInt(parte.trim());
        }
        return resultado;
    }

    public static int dividir(String[] partes) {
        int resultado = Integer.parseInt(partes[0].trim());
        for (int i = 1; i < partes.length; i++) {
            int divisor = Integer.parseInt(partes[i].trim());
            if (divisor == 0) {
                throw new ArithmeticException("División por cero no permitida.");
            }
            resultado /= divisor;
        }
        return resultado;
    }

    public static String realizarOperacion(String expresion, char operador) {
        String[] partes = expresion.split("\\" + operador);
        int resultado = 0;

        if (operador == '+') {
            resultado = sumar(partes);
        } else if (operador == '-') {
            resultado = restar(partes);
        } else if (operador == '*') {
            resultado = multiplicar(partes);
        } else if (operador == '/') {
            resultado = dividir(partes);
        } else {
            throw new IllegalArgumentException("Operador no reconocido.");
        }

        return expresion + "=" + resultado;
    }
}
