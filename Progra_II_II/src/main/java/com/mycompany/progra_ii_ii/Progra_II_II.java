import com.mycompany.progra_ii_ii.Entrenador;
import com.mycompany.progra_ii_ii.Futbolista;
import com.mycompany.progra_ii_ii.Masajista;
import com.mycompany.progra_ii_ii.SeleccionFutbol;
import java.util.ArrayList;

public class Progra_II_II {
    public static void main(String[] args) {
        ArrayList<SeleccionFutbol> equipo = new ArrayList<>();

        Futbolista futbolista = new Futbolista(1, "Lionel", "Messi", 34, 10, "Delantero");
        Entrenador entrenador = new Entrenador(2, "Pep", "Guardiola", 50, "UEFA-123");
        Masajista masajista = new Masajista(3, "Maria", "Gonzalez", 40, "Licenciada en Fisioterapia", 15);

        
        
    }
}
