import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        List<Producto> Lista1 = new ArrayList<>();
        Lista1.add(new Producto("Pan",1.0));
        Lista1.add(new Producto("Arroz",1.50));
        Lista1.add(new Producto("Leche",0.95));
        Lista1.add(new Producto("Pan",1.0));
        Lista1.add(new Producto("Picas",1.10));

        Cliente cliente1 = new Cliente("Pedro", Lista1);

        List<Producto> Lista2 = new ArrayList<>();
        Lista2.add(new Producto("Coca-Cola",1.90));
        Lista2.add(new Producto("Pizza de Atun y Bacon",3.50));
        Lista2.add(new Producto("Hielo",0.95));
        Lista2.add(new Producto("Helado Vainilla",2.35));
        Lista2.add(new Producto("Pan",1.0));

        Cliente cliente2 = new Cliente("Alberro", Lista1);
    }
}