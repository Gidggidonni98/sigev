package utez.edu.mx.sigev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/enlace")
public class EnlaceController {

    @GetMapping(value = "/listar")
    public String enlaces(){
        return "admin/enlaces";
    }
}
