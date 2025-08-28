package com.registroCRUD.CRUD.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registroCRUD.CRUD.model.Persona;
import com.registroCRUD.CRUD.repository.PersonaRepository;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    //Lista de personas partidarias
    //el metodo findAll() es propio de SpringBoot para poder listar
    public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }
    //Para realizar UPDATE
    public Persona guardarPersona(Persona persona){
        if (persona.getFecha_registro() == null) {
        persona.setFecha_registro(LocalDateTime.now());
        }
        return personaRepository.save(persona);
    }
    //Para realizar la búsqueda
    public Persona obtenerPersona(int id){
        return personaRepository.findById(id).orElse(null);
    }
    //Para eliminar
    public void eliminarPersona(int id){
        personaRepository.deleteById(id);
    }
}
