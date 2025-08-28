package com.registroCRUD.CRUD.repository;

import com.registroCRUD.CRUD.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
