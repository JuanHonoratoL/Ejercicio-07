package UPIIZ.Ejercicio_07.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String Home(){
        return "index";

    }
}
