package utez.edu.mx.sigev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "municipio")
public class MunicipioController {

    @GetMapping(value = "listar")
    public String municipios(){
        return "admin/municipios";
    }
}
