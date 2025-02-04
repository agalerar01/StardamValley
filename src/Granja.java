import java.util.List;
import java.util.Map;

public class Granja {

    private int diaActual;
    private Estacion estacion;
    private int presupuesto;
    private Tienda tienda;
    private Almacen almacen;
    private List<Semilla> semillasDisponibles;
    private Map<Estacion,Semilla> semillasPorEstacion;
    private Map<Integer,Semilla> semillasPorId;

    public Granja() {
        this.diaActual=1;
    }

    public void IniciarNuevoDia(){
        this.diaActual++;
    }

    public void cuidarHuerto(){

    }

    public void plantarCultivosPorColumnas(int col){

    }

    public void venderFrutos(){

    }

    public void mostrarGranjaInfo(){

    }
}
