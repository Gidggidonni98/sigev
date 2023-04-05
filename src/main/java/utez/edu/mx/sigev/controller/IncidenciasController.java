package utez.edu.mx.sigev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "incidencia")
public class IncidenciasController {

    @GetMapping(value = "/id")
    public String incidenciaById(){
        return "enlace/incidencia";
    }

    @GetMapping(value = "/listar")
    public String incidencias(){
        return "enlace/incidencias";
    }

    @GetMapping(value = "/presidente")
    public String incidenciaPresidente(){
        return "presidente/misIncidencias";
    }

    @GetMapping(value = "/presidente/id")
    public String incidenciaPresidenteById(){
        return "presidente/miIncidencia";
    }
}
