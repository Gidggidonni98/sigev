package utez.edu.mx.sigev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "comite")
public class ComiteController {

    @GetMapping(value = "/id")
    public String comiteById(){
        return "enlace/comite";
    }

    @GetMapping(value = "/listar")
    public String comites(){
        return "enlace/comites";
    }
}
