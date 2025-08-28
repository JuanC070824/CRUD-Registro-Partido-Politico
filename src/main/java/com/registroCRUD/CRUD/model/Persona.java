package com.registroCRUD.CRUD.model;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "partidario")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_partidario")
    private int id;
    @Column(name="nombre_partidario")
    private String nombre;
    @Column(name="apat")
    private String apat;
    @Column(name="amat")
    private String amat;
    @Column(name="edad")
    private int edad;
    @Column(name="telefono")
    private String telefono;
    @Column(name="dni")
    private String dni;
    @Column(name="correo")
    private String correo;
    @Column(name="fecha_registro")
    private LocalDateTime fecha_registro=LocalDateTime.now();

    //Constructor vacío

    public Persona(){
        //VACIO
    }
    public Persona(int id, String nombre, String apat, String amat, int edad, String telefono, String dni, String correo,
                   LocalDateTime fecha_registro) {
        this.id = id;
        this.nombre = nombre;
        this.apat = apat;
        this.amat = amat;
        this.edad = edad;
        this.telefono = telefono;
        this.dni = dni;
        this.correo = correo;
        this.fecha_registro = fecha_registro;
    }
    //GETTERS
    public int getId() {
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApat(){
        return apat;
    }
    public String getAmat(){
        return amat;
    }
    public int getEdad(){
        return edad;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getDni(){
        return dni;
    }
    public String getCorreo(){
        return correo;
    }
    public LocalDateTime getFecha_registro(){
        return fecha_registro;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApat(String apat) {
        this.apat = apat;
    }

    public void setAmat(String amat) {
        this.amat = amat;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFecha_registro(LocalDateTime fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
