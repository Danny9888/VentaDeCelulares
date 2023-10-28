package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "Mensajes")
public class Mensajes extends Recarga{

    @Id
    @Column(name = "ID_MENSAJES")
    private Long id;

    public Mensajes(String plan, String descripcion, double precio, Long id) {
        super(plan, descripcion, precio);
        this.id = id;
    }

    public Mensajes(){

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
