     Archivo arch=new Archivo();
        //arch.escribirPersona(new Personas("EDGAR","FELIPE","LOPEZ","LEMUS","12345678","mail@correo.com"));        
        //arch.mostrararchivo();
        
int exit = 0;
        int opcion = 0;
        
        Scanner entrada = new Scanner(System.in);
        Scanner lecturaCadena = new Scanner(System.in);
        while (exit!=1){
            menue();
            try {
                opcion = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("Opcion no valida.");
                entrada = new Scanner(System.in);
            }           
            switch(opcion){
                case 1:
                    System.out.println("Escriba el primer nombre: ");
                    String nombre1=lecturaCadena.nextLine();
                    System.out.println("Escriba el segundo nombre: ");
                    String nombre2=lecturaCadena.nextLine();
                    System.out.println("Escriba el primer apellido: ");
                    String apellido1=lecturaCadena.nextLine();
                    System.out.println("Escriba el segundo apellido: ");
                    String apellido2=lecturaCadena.nextLine();
                    System.out.println("Escriba el telefono: ");
                    String telefono=lecturaCadena.nextLine();                    
                    System.out.println("Escriba el correo: ");
                    String correo=lecturaCadena.nextLine();
                    Personas p = new Personas(nombre1,nombre2,apellido1,apellido2,telefono,correo);
                    arch.escribirPersona(p);                    
                    break;
                    case 2:
                    arch.mostrararchivo();
                    break;
                    case 3:
                    System.out.println("Ingres el nombre a buscar: ");
                    String nombreBuscar = lecturaCadena.nextLine();
                    arch.buscar(nombreBuscar);
                    break;
                    case 4:
                    System.out.println("Ingrese el nombre a buscar: ");
                    String nombreEliminar = lecturaCadena.nextLine();
                    arch.eliminar(nombreEliminar);
                    break;                   
                    case 10:
                    exit = 1;
                    break;
                    default:
                        System.out.println("");
                    
                
            }
            
        }
    }
    
    private static void menue(){
        System.out.println(" Menu:");
	System.out.println(" 1. Ingresar nueva registro de persona. ");
	System.out.println(" 2. Mostrar datos de personas. ");
	System.out.println(" 3. Buscar persona: ");
	System.out.println(" 4. Eliminacion de persona.");
	System.out.println("10. Salir");
        System.out.println("Ingrese opcion:");
    }
    