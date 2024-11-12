import java.util.List;

public class Cliente {

    //atributos
    private String Nombre;
    private List<Producto> Carrito; //aqui se guardan los productos del carrito

    //Costructor
    public Cliente(String nombre, List<Producto> carrito) {
        Nombre = nombre;
        Carrito = carrito;
    }

    //Getters y Setters (los Setters no hacen falta de momento)


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public List<Producto> getCarrito() {
        return Carrito;
    }

    public void setCarrito(List<Producto> carrito) {
        Carrito = carrito;
    }
}
