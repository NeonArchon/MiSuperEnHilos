import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GeneradorCarritos {
    //ArrayList con las lista de posibles onjetos
    private static final List<String> PRODUCTOS_DISPONIBLES = Arrays.asList(
            "Manzanas", "Leche", "Pan", "Huevos", "Café",
            "Cereal", "Jugo", "Queso", "Mantequilla", "Pasta",
            "Salsa", "Pollo", "Carne", "Arroz", "Frijoles",
            "Atún", "Galletas", "Chocolate", "Helado", "Tomates"
    );

    public static ArrayList<String> generarCarrito() {
        Random random = new Random(); //inicio de fincion random
        int numProductos = random.nextInt(5) + 1; // Mínimo 1, máximo 5 productos en el carro
        ArrayList<String> carrito = new ArrayList<>();

        //generacion de los productos de los carritos de compra
        for (int i = 0; i < numProductos; i++) {
            String producto = PRODUCTOS_DISPONIBLES.get(random.nextInt(PRODUCTOS_DISPONIBLES.size()));
            carrito.add(producto);
        }

        return carrito;
    }
}
