public class Caja {
    //atributo de la clase
    private String nombre;

    //constructor
    public Caja(String nombre) {
        this.nombre = nombre;
    }

    //metodo para procesas lo carritos de los clientes
    public void procesarCliente(Cliente cliente, long initialTime) {
        System.out.println(nombre + " está atendiendo a " + cliente.getNombre());
        //bucle para recorrer el carrito
        for (String producto : cliente.getCarrito()) {
            try {
                Thread.sleep(1000); // Simula el tiempo de procesar un producto
                long tiempoProcesado = System.currentTimeMillis() - initialTime;
                System.out.println("Producto: " + producto + " procesado para " + cliente.getNombre() + " en " + tiempoProcesado + " ms.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //Calculo del tiempo que toma en procesar el cliente
        long tiempoTotal = System.currentTimeMillis() - initialTime;
        System.out.println(nombre + " ha terminado con " + cliente.getNombre() + " en " + tiempoTotal + " ms.");
    }
}
