import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class GestionFHuerto {

    static String RUTA_FICHERO = "resources/huerto.dat";
    static int TAMANIO_ID_SEMILLA;
    static int TAMANIO_REGADA;
    static int TAMANIO_NUM_DIAS_CRECIMIENTO;
    static int TAMANIO_REGISTRO;
    static int VALOR_DEFECTO_ENTERO;
    static boolean VALOR_DEFECTO_BOOLEAN;

    public void inicializarHuerto(){

    }

    public void moverPunteroPosicionRelativa(int posicion){

    }

    public Map cuidarHuerto(Map<Integer,Semilla> mapaSemillasPorClave){


        return mapaSemillasPorClave;
    }

    public void actualizarHuertoNuevoDia(){

    }

    public void mostrarHuerto(){

    }

    public boolean isColumnaVacia(int col){
        boolean vacia=true;

        return vacia;
    }

    public void plantarSemillaColumna(Semilla semilla,int columna){

    }

    public void crearFicheroHuerto(){
        Path rutaFichero = Paths.get(RUTA_FICHERO);

        if(!Files.exists(rutaFichero)){
            try {
                Files.createFile(rutaFichero);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void eliminarFicheroHuerto(){
        Path rutaFichero = Paths.get(RUTA_FICHERO);

        if(Files.exists(rutaFichero)){
            try {
                Files.delete(rutaFichero);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void cerrarConexion(){

    }
}
