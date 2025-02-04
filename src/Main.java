import java.util.Scanner;

public class Main {

    public static int inicio(){
        int opc;
        Scanner es = new Scanner(System.in);

        System.out.println("1. NUEVA PARTIDA");
        System.out.println("2. CARGAR PARTIDA");
        opc = es.nextInt();
        System.out.println("");

        return opc;
    }

    public static int mostrarMenu(){
        int opc;
        Scanner es = new Scanner(System.in);

        System.out.println("1. INICIAR NUEVO DIA");
        System.out.println("2. ATENDER CULTIVOS");
        System.out.println("3. PLANTAR CULTIVO EN COLUMNA");
        System.out.println("4. VENDER COSECHA");
        System.out.println("5. MONSTRAR INFORMACION DE LA GRANJA");
        System.out.println("6. SALIR");
        opc = es.nextInt();
        System.out.println("");

        return opc;
    }

    public static void main(String[] args) {

        switch (inicio()){
            case 1:

                break;
            case 2:

                break;
        }

        switch (mostrarMenu()){
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                System.out.println("Saliendo...");
                break;
        }
    }
}