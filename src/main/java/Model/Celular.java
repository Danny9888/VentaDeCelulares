package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "celulares")
public class Celular {
    @Id
    private String IMEI;

    @Column(name = "CODIGO_BARRA")
    private String codigoBarra;
    @Column(name = "MARCA")
    private String marca;
    @Column(name = "MODELO")
    private String modelo;
    @Column(name = "COLOR")
    private String color;
    @Column(name = "NO_CELULAR")
    private String noCelular;
    @Column(name = "PRECIO_COSTO")
    private double precioCosto;
    @Column(name = "PRECIO_VENTA")
    private double precioVenta;

    @Column(name = "ESTADO_VENTA")
    private boolean disponible;

    @ManyToOne
    @JoinColumn(name = "ID_PLAN")
    private Plan plan;

    public Celular() {
    }

    public Celular(String codigoBarra, String modelo, String marca, String color, String noCelular,
                   double precioCosto, double precioVenta, String IMEI, boolean estadoVenta) {
        this.codigoBarra = codigoBarra;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.noCelular = noCelular;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.IMEI = IMEI;
        this.disponible = estadoVenta;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNoCelular() {
        return noCelular;
    }

    public void setNoCelular(String noCelular) {
        this.noCelular = noCelular;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
}
