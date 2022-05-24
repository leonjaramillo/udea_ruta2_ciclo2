package co.edu.udea.udea_ruta2_ciclo2.hibernate;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vendedores")
public class Vendedor implements Serializable {
    @Id
    private int documento;
    @Column(nullable=false)
    private String nombres;
    @Column(nullable=false)
    private String apellidos;
    private String ciudad;

    public Vendedor() {
    }

    public Vendedor(int documento, String nombres, String apellidos, String ciudad) {
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ciudad = ciudad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "documento=" + documento + ", nombres=" + nombres + ", apellidos=" + apellidos + ", ciudad=" + ciudad + '}';
    }
}
