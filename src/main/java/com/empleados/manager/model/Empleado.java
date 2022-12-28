package com.empleados.manager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Empleado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String puestoTrabajo;
    private String telefono;
    private String imageURL;
    @Column(nullable = false, updatable = false)
    private String codigoEmpleado;

    public Empleado() {
    }

    public Empleado(String nombre,
                    String apellido,
                    String email,
                    String puestoTrabajo,
                    String telefono,
                    String imageURL,
                    String codigoEmpleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.puestoTrabajo = puestoTrabajo;
        this.telefono = telefono;
        this.imageURL = imageURL;
        this.codigoEmpleado = codigoEmpleado;
    }

    public Long getId() {
        return id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", puestoTrabajo='" + puestoTrabajo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", codigoEmpleado='" + codigoEmpleado + '\'' +
                '}';
    }
}
