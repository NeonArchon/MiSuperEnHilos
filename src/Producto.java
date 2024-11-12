public class Producto {

    //atributos
    private int Nombre;
    private double precio;

    //Constructor
    public Producto(int nombre, double precio) {
        Nombre = nombre;
        this.precio = precio;
    }

    //Getters y Setters (Setters no van a ser utilizados de momento

    public int getNombre() {
        return Nombre;
    }

    public void setNombre(int nombre) {
        Nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
