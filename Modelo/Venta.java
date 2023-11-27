
package Modelo;

public class Venta {
    private int id;
    private String cliente;
    private String vendedor;
    private double Total;
    
    public Venta(){
    
    }

    public Venta(int id, String cliente, String vendedor, double Total) {
        this.id = id;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.Total = Total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

        
}
