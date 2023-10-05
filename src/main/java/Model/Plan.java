package Model;

import jakarta.persistence.*;

@Entity
@Table(name = "planes")
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PLAN")
    private Integer id;
    @Column(name = "TIPO_PLAN")
    private String tipoPlan;

    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "COSTO")
    private Double costo;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", tipoPlan='" + tipoPlan + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", costo=" + costo;
    }
}
