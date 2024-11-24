import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        // Crear las cajas
        Caja caja1 = new Caja("Caja 1");
        Caja caja2 = new Caja("Caja 2");

        // Generar clientes con carritos aleatorios
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Cliente 1", GeneradorCarritos.generarCarrito()));
        clientes.add(new Cliente("Cliente 2", GeneradorCarritos.generarCarrito()));
        clientes.add(new Cliente("Cliente 3", GeneradorCarritos.generarCarrito()));
        clientes.add(new Cliente("Cliente 4", GeneradorCarritos.generarCarrito()));
        clientes.add(new Cliente("Cliente 5", GeneradorCarritos.generarCarrito()));

        // Crear un semáforo con 2 permisos (una para cada caja)
        Semaphore semaphore = new Semaphore(2);
        long initialTime = System.currentTimeMillis();

        for (Cliente cliente : clientes) {
            new Thread(() -> {
                try {
                    // Adquirir un permiso del semáforo
                    semaphore.acquire();

                    // Determinar qué caja está libre
                    synchronized (System.out) {
                        if (semaphore.availablePermits() == 1) {
                            caja1.procesarCliente(cliente, initialTime);
                        } else {
                            caja2.procesarCliente(cliente, initialTime);
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // Liberar el permiso
                    semaphore.release();
                }
            }).start();
        }
    }
}
