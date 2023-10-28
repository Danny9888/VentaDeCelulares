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
    private Long id;

    public Internet(){

    }

    public Internet(String plan, String descripcion, double precio, Long id) {
        super(plan, descripcion, precio);
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
