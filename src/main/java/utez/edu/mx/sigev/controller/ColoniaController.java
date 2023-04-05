package utez.edu.mx.sigev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("colonias")
public class ColoniaController {

    @GetMapping(value = "/listar")
    public String colonias(){
        return "enlace/colonias";
    }
}
