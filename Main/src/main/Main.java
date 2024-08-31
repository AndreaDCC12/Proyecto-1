import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SeleccionFutbol> equipo = new ArrayList<>();

        while (true) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Registrar Futbolista");
            System.out.println("2. Registrar Entrenador");
            System.out.println("3. Registrar Masajista");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            if (opcion == 4) {
                break; // Salir del bucle si el usuario selecciona la opción 4.
            }

            scanner.nextLine(); // Limpia el salto de línea después de leer el número.

            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese los apellidos: ");
            String apellidos = scanner.nextLine();
            System.out.print("Ingrese la edad: ");
            int edad = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dorsal: ");
                    int dorsal = scanner.nextInt();
                    scanner.nextLine(); // Limpia el salto de línea después de leer el número.
                    System.out.print("Ingrese la demarcación: ");
                    String demarcacion = scanner.nextLine();
                    Futbolista futbolista = new Futbolista(equipo.size() + 1, nombre, apellidos, edad, dorsal, demarcacion);
                    equipo.add(futbolista);
                    break;
                case 2:
                    System.out.print("Ingrese la ID de federación: ");
                    String idFederacion = scanner.next();
                    Entrenador entrenador = new Entrenador(equipo.size() + 1, nombre, apellidos, edad, idFederacion);
                    equipo.add(entrenador);
                    break;
                case 3:
                    scanner.nextLine(); // Limpia el salto de línea después de leer el número.
                    System.out.print("Ingrese la titulación: ");
                    String titulacion = scanner.nextLine();
                    System.out.print("Ingrese los años de experiencia: ");
                    int aniosExperiencia = scanner.nextInt();
                    Masajista masajista = new Masajista(equipo.size() + 1, nombre, apellidos, edad, titulacion, aniosExperiencia);
                    equipo.add(masajista);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        // Mostrar los datos de los integrantes del equipo
        for (SeleccionFutbol integrante : equipo) {
            integrante.concentrarse();
            integrante.viajar();

            if (integrante instanceof Deportista) {
                Deportista deportista = (Deportista) integrante;
                deportista.entrenar();
                deportista.jugarPartido();
            }

            System.out.println("----------");
        }

        // Cerrar el scanner al finalizar.
        scanner.close();
    }
}

