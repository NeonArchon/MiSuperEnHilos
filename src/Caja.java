public class Caja {

    //atributos
    private String NombreCajero;
    private Cliente cliente;
    private long initialtime; //esta variable guarda tiempe en milisegundos

    //constructor


    public Caja(String nombreCajero, Cliente cliente, long initialtime) {
        NombreCajero = nombreCajero;
        this.cliente = cliente;
        this.initialtime = System.currentTimeMillis();
    }

    //metodo run
    public void run(){
        System.out.println("Cajero" + NombreCajero + "atiende al cliente" + cliente.getNombre());

        for (Producto producto : cliente.getCarrito()){
            Procesar(producto);
        }

        long tiempo = System.currentTimeMillis() - initialtime;
        System.out.println("El cajero" + NombreCajero + "ha terminado con el cliente" + cliente.getNombre() + "en un tiempo de" + tiempo + "ms");

    }

    //metodo procesar
    private void Procesar(Producto producto) {
        System.out.println("Procesando" + producto.getNombre() + "Con el cajero" + getNombreCajero());
        try{
             Thread.sleep(1000);//simulacion del proceso de productos
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    //getters y setters (setters no van ser utilizados por ahora

    public String getNombreCajero() {
        return NombreCajero;
    }

    public void setNombreCajero(String nombreCajero) {
        NombreCajero = nombreCajero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getInitialtime() {
        return initialtime;
    }

    public void setInitialtime(long initialtime) {
        this.initialtime = initialtime;
    }
}
