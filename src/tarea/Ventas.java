package tarea;

public class Ventas {
    private int id;
    private String articulo;
    private double precio;

    public Ventas() {

    }

    public Ventas(int id, String articulo, double precio) {
        this.id = id;
        this.articulo = articulo;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulo: "+articulo+", Precio: $"+precio;
    }
}