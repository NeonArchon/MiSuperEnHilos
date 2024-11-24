import java.util.ArrayList;

//atributos de la clase
public class Cliente {
    private String nombre;
    private ArrayList<String> carrito;

// constructor
    public Cliente(String nombre, ArrayList<String> carrito) {
        this.nombre = nombre;
        this.carrito = carrito;
    }
//getters (setters no hacen falta)
    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getCarrito() {
        return carrito;
    }
}