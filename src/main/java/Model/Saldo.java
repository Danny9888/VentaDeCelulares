package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "saldo")
public class Saldo extends Recarga{

    @Id
    @Column(name = "ID_SALDO")
    private int id;

    public Saldo(String plan, String descripcion, double precio, int id) {
        super(plan, descripcion, precio);
        this.id = id;
    }

    public Saldo(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
