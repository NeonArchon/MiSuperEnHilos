public class Caja {
    private String nombre;

    public Caja(String nombre) {
        this.nombre = nombre;
    }

    public void procesarCliente(Cliente cliente, long initialTime) {
        System.out.println(nombre + " está atendiendo a " + cliente.getNombre());
        for (String producto : cliente.getCarrito()) {
            try {
                Thread.sleep(1000); // Simula el tiempo de procesar un producto
                long tiempoProcesado = System.currentTimeMillis() - initialTime;
                System.out.println("Producto: " + producto + " procesado para " + cliente.getNombre() + " en " + tiempoProcesado + " ms.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long tiempoTotal = System.currentTimeMillis() - initialTime;
        System.out.println(nombre + " ha terminado con " + cliente.getNombre() + " en " + tiempoTotal + " ms.");
    }
}
