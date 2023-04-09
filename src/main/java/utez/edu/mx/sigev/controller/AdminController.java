package utez.edu.mx.sigev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping(value="/administradores")
    public String administradores() {
        return  "admin/administradores";
    }

    @GetMapping(value = "/dashboard")
    public String dashboard(){
        return "admin/dashAdmin";
    }

    @GetMapping(value = "/tema")
    public String tema(){
        return "admin/tema";
    }
}
