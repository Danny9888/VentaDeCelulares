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
    private int id;

    public Mensajes(String plan, String descripcion, double precio, int id) {
        super(plan, descripcion, precio);
        this.id = id;
    }

    public Mensajes(){

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
