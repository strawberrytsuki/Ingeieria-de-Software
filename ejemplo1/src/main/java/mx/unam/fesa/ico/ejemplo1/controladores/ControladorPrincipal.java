package mx.unam.fesa.ico.ejemplo1.controladores;

import mx.unam.fesa.ico.ejemplo1.modelo.Comida;
import mx.unam.fesa.ico.ejemplo1.modelo.Juego;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tienda")

public class ControladorPrincipal {

    @GetMapping("/adultos/")
    public String mostrarAdultos(){
        return "pagina_uno";
    }

    @GetMapping("/mascotas/")
    public String mostrarMascotas(Model model){
        //suponiendo que se consulta BDD
        Comida com = new Comida("croquetas kibble n' bites", 300.0f, "https://www.postconsumerbrands.com/wp-content/uploads/2024/03/Kibblesn-Bits-Bacon-Steak-Flavor-Dry-Dog-Food-3LB-1536x1536.png"
                );
        model.addAttribute("food", com);
        return "masc";
    }

    @GetMapping("/juegos/")
    public String mostrarJuegos(Model model){
        //suponiendo que se consulta BDD
        Juego jue = new Juego("catan", 890.0f, "https://cf.geekdo-images.com/0XODRpReiZBFUffEcqT5-Q__itemrep/img/6Jf5G-bSvdOIMUSwxsJfZXl29B8=/fit-in/246x300/filters:strip_icc()/pic9156909.png"
        );
        model.addAttribute("game", jue);
        return "BG";
    }

}
