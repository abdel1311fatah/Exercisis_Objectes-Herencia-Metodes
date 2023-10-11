
package aplicacion2a_objetos;


public class facturar {
    
    private double cantidad;
    private double precio;

    public facturar(double cantidad, double precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double calcularVenta(double cantidad, double precio){
        
        double subtotal = cantidad*precio;
        double iva = 0.21 * subtotal;
        double total = iva + subtotal;
        
        return total;
        
    }
    
    
}
