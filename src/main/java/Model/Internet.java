package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "internet")
public class Internet extends Recarga{

    @Id
    @Column(name = "ID_INTERNET")
    private int id;

    public Internet(){

    }

    public Internet(String plan, String descripcion, double precio, int id) {
        super(plan, descripcion, precio);
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
