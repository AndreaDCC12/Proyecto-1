import com.mycompany.progra_ii_ii.Entrenador;
import com.mycompany.progra_ii_ii.Futbolista;
import com.mycompany.progra_ii_ii.Masajista;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Progra_II_II {
    public static void main(String[] args) {
        List<Futbolista> futbolistas = new ArrayList<>();
        List<Entrenador> entrenadores = new ArrayList<>();
        List<Masajista> masajistas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menú Principal:");
            System.out.println("1. Registrar Futbolista");
            System.out.println("2. Registrar Entrenador");
            System.out.println("3. Registrar Masajista");
            System.out.println("4. Listar Futbolistas");
            System.out.println("5. Listar Entrenadores");
            System.out.println("6. Listar Masajistas");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea después de leer un entero

            switch (opcion) {
                case 1:
                    System.out.println("Registrando Futbolista:");
                    System.out.print("Ingrese el nombre: ");
                    String nombreFutbolista = scanner.nextLine();
                    System.out.print("Ingrese los apellidos: ");
                    String apellidosFutbolista = scanner.nextLine();
                    System.out.print("Ingrese la edad: ");
                    int edadFutbolista = scanner.nextInt();
                    scanner.nextLine();  // Consumir la nueva línea después de leer un entero
                    System.out.print("Ingrese el dorsal: ");
                    int dorsal = scanner.nextInt();
                    scanner.nextLine();  // Consumir la nueva línea después de leer un entero
                    System.out.print("Ingrese la demarcación: ");
                    String demarcacion = scanner.nextLine();

                    Futbolista futbolista = new Futbolista(0, nombreFutbolista, apellidosFutbolista, edadFutbolista, dorsal, demarcacion);
                    futbolistas.add(futbolista);
                    System.out.println("Futbolista registrado exitosamente.");
                    break;

                case 2:
                    System.out.println("Registrando Entrenador:");
                    System.out.print("Ingrese el nombre: ");
                    String nombreEntrenador = scanner.nextLine();
                    System.out.print("Ingrese los apellidos: ");
                    String apellidosEntrenador = scanner.nextLine();
                    System.out.print("Ingrese la edad: ");
                    int edadEntrenador = scanner.nextInt();
                    scanner.nextLine();  // Consumir la nueva línea después de leer un entero
                    System.out.print("Ingrese la ID de Federación: ");
                    String idFederacion = scanner.nextLine();

                    Entrenador entrenador = new Entrenador(0, nombreEntrenador, apellidosEntrenador, edadEntrenador, idFederacion);
                    entrenadores.add(entrenador);
                    System.out.println("Entrenador registrado exitosamente.");
                    break;

                case 3:
                    System.out.println("Registrando Masajista:");
                    System.out.print("Ingrese el nombre: ");
                    String nombreMasajista = scanner.nextLine();
                    System.out.print("Ingrese los apellidos: ");
                    String apellidosMasajista = scanner.nextLine();
                    System.out.print("Ingrese la edad: ");
                    int edadMasajista = scanner.nextInt();
                    scanner.nextLine();  // Consumir la nueva línea después de leer un entero
                    System.out.print("Ingrese la titulación: ");
                    String titulacion = scanner.nextLine();
                    System.out.print("Ingrese los años de experiencia: ");
                    int aniosExperiencia = scanner.nextInt();
                    scanner.nextLine();  // Consumir la nueva línea después de leer un entero

                    Masajista masajista = new Masajista(0, nombreMasajista, apellidosMasajista, edadMasajista, titulacion, aniosExperiencia);
                    masajistas.add(masajista);
                    System.out.println("Masajista registrado exitosamente.");
                    break;

                
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 7);

        scanner.close();
    }
}

