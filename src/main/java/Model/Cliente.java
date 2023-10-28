package Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @Column(name = "DPI")
    private String dpi;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "NIT")
    private String nit;

    @Column(name = "TELEFONO")
    private String telefono;

    @Column(name = "DIRECCION")
    private String direccion;



    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String nit, String telefono, String direccion, String dpi) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nit = nit;
        this.telefono = telefono;
        this.direccion = direccion;
        this.dpi = dpi;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }
}