import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Scanner;

public class GestionFPropiedades {

    private static String RUTA_FICHERO_CONF = "resources/default_config.properties";
    private static String RUTA_FICHERO_CONF_PERS = "resources/personalized_config.properties";

    public void setPropiedades(String clave,String valor){
        Properties ficheroP = new Properties();

        try {
            crearFicheroPropiedades();
            ficheroP.load(new FileInputStream(RUTA_FICHERO_CONF_PERS));

            ficheroP.setProperty(clave,valor);
            ficheroP.store(new FileOutputStream(RUTA_FICHERO_CONF_PERS),"Nueva Configuracion");
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }

    public void guardarCambios(){
        crearFicheroPropiedades();

        System.out.println("Numero de filas del huerto");
        setPropiedades("Número_de_filas_del_huerto",pedirString());

        System.out.println("Numero de columnas del huerto");
        setPropiedades("Número_de_columnas_del_huerto",pedirString());

        System.out.println("Presupuesto inicial");
        setPropiedades("Presupuesto_inicial",pedirString());

        System.out.println("Estacion inicial");
        setPropiedades("Estación_inicial",pedirString());

        System.out.println("Dias de duracion por estacion");
        setPropiedades("Días_de_duración_de_cada_estación",pedirString());
    }

    public String getPropiedad(String clave){
        Properties ficheroP = new Properties();
        Path rutaFicheroPers = Paths.get(RUTA_FICHERO_CONF_PERS);
        String linea;

        if(Files.exists(rutaFicheroPers)){
            try {
                ficheroP.load(new FileInputStream(RUTA_FICHERO_CONF_PERS));

                linea=ficheroP.getProperty(clave);
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }else{
            try {
                ficheroP.load(new FileInputStream(RUTA_FICHERO_CONF));

                linea=ficheroP.getProperty(clave);
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }

        return linea;
    }

    public void crearFicheroPropiedades(){
        Path rutaFichero = Paths.get(RUTA_FICHERO_CONF_PERS);
        try {
            if(Files.exists(rutaFichero)){
                eliminarFicheroPropiedades();
                Files.createFile(rutaFichero);
            }else{
                Files.createFile(rutaFichero);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void eliminarFicheroPropiedades(){
        Path rutaFichero = Paths.get(RUTA_FICHERO_CONF_PERS);
        try {
            Files.delete(rutaFichero);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String pedirString(){
        Scanner es = new Scanner(System.in);
        String propiedad = es.nextLine();

        return propiedad;
    }
}
