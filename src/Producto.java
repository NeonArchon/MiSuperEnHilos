public class Producto {

    //atributos
    private String Nombre;
    private double precio;

    //Constructor
    public Producto(String nombre, double precio) {
        Nombre = nombre;
        this.precio = precio;
    }

    //Getters y Setters (Setters no van a ser utilizados de momento

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
