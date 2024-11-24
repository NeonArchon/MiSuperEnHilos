import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<String> carrito;

    public Cliente(String nombre, ArrayList<String> carrito) {
        this.nombre = nombre;
        this.carrito = carrito;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getCarrito() {
        return carrito;
    }
}