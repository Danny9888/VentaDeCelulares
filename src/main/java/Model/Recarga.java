package Model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Recarga {

    @Column(name = "Plan")
    protected String plan;

    @Column(name = "DESCRIPCION")
    protected String descripcion;
    @Column(name = "PRECIO")
    protected double precio;

    public Recarga(String plan, String descripcion, double precio) {
        this.plan = plan;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Recarga(){

    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Recarga{" +
                "plan='" + plan + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
