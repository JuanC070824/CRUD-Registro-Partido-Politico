package com.registroCRUD.CRUD.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.registroCRUD.CRUD.model.Persona;
import com.registroCRUD.CRUD.service.PersonaService;


@Controller
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping
    public String listarPersonas(Model model){
        model.addAttribute("personas", personaService.listarPersonas());
        return "personas-lista";
    }

    /*@GetMapping
    public String listarPersonas(Model model){
        model.addAttribute("personas",personaService.listarPersonas());
        return "personas-lista";
    }*/
    @GetMapping("/nuevo")
    public String formularioNuevoPersona(Model model){
        model.addAttribute("persona",new Persona());
        return "personas-formulario";
    }
    @PostMapping
    public String guardarPersona(@ModelAttribute Persona persona){
        personaService.guardarPersona(persona);
        return "redirect:/personas";
    }    

    @GetMapping("/editar/{id}")
    public String editarPersona(@PathVariable int id,Model model){
        model.addAttribute("persona",personaService.obtenerPersona(id));
        return "personas-formulario";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminarPersona(@PathVariable int id){
        personaService.eliminarPersona(id);
        return "redirect:/personas";
    }

}
