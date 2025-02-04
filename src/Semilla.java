import java.util.List;

public class Semilla {

    private int id;
    private String nombre;
    private List<Estacion> estaciones;
    private int diasCrecimiento;
    private int precioSemilla;
    private int precioVentaFruto;
    private int maxFrutos;

    public Semilla() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDiasCrecimiento() {
        return diasCrecimiento;
    }

    public void setDiasCrecimiento(int diasCrecimiento) {
        this.diasCrecimiento = diasCrecimiento;
    }

    public int getPrecioSemilla() {
        return precioSemilla;
    }

    public void setPrecioSemilla(int precioSemilla) {
        this.precioSemilla = precioSemilla;
    }

    public int getPrecioVentaFruto() {
        return precioVentaFruto;
    }

    public void setPrecioVentaFruto(int precioVentaFruto) {
        this.precioVentaFruto = precioVentaFruto;
    }

    public int getMaxFrutos() {
        return maxFrutos;
    }

    public void setMaxFrutos(int maxFrutos) {
        this.maxFrutos = maxFrutos;
    }
}
