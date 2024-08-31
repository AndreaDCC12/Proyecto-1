
class SeleccionFutbol {
    private int id;
    String Nombre;
    private String Apellidos;
    private int Edad;

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        Nombre = nombre;
        Apellidos = apellidos;
        Edad = edad;
    }

    public void concentrarse() {
        System.out.println(Nombre + " está concentrándose.");
    }

    public void viajar() {
        System.out.println(Nombre + " está viajando.");
    }
}

class Futbolista extends SeleccionFutbol implements Deportista {
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void entrenar() {
        System.out.println(Nombre + " está entrenando.");
    }

    public void jugarPartido() {
        System.out.println(Nombre + " está jugando un partido.");
    }
}

class Entrenador extends SeleccionFutbol implements Deportista {
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void entrenar() {
        System.out.println(Nombre + " está entrenando al equipo.");
    }

    public void jugarPartido() {
        System.out.println(Nombre + " no juega, es el entrenador.");
    }
}

class Masajista extends SeleccionFutbol implements Integrante {
    private final String titulacion;
    private final int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void concentrarse() {
        System.out.println(Nombre + " está concentrándose con los jugadores.");
    }

    public void viajar() {
        System.out.println(Nombre + " está viajando con el equipo.");
    }
}
