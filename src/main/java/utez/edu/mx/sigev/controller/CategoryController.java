package utez.edu.mx.sigev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/category")
public class CategoryController {

    @GetMapping(value = "/listar")
    public String category(){
        return "admin/categorias";
    }
}
