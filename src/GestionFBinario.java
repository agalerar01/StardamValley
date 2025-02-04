import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GestionFBinario {

    private static String RUTA_FICHERO_BINARIO = "resources/stardam_valley.bin";

    public void crearFicheroBinario(){
        Path rutaFichero = Paths.get(RUTA_FICHERO_BINARIO);

        if(!Files.exists(rutaFichero)){
            try {
                Files.createFile(rutaFichero);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void eliminarPartidaGuardada(){
        Path rutaFichero = Paths.get(RUTA_FICHERO_BINARIO);

        if(Files.exists(rutaFichero)){
            try {
                Files.delete(rutaFichero);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public boolean existeFicheroBinario(){
        Path rutaFichero = Paths.get(RUTA_FICHERO_BINARIO);
        boolean existe;

        existe = Files.exists(rutaFichero);
        return existe;
    }

    public Granja cargarPartidaGuardada(){
        Path rutaFichero = Paths.get(RUTA_FICHERO_BINARIO);
        Granja granja=new Granja();

        if(Files.exists(rutaFichero)){

        }else{
            System.out.println("No existe una partida guardada");
        }

        return granja;
    }

    public void guardarPartida(Granja granja){
        crearFicheroBinario();
    }
}
