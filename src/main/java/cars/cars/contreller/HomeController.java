package cars.cars.contreller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(final Model model) {
        model.addAttribute("message", "EEEEEE SPRING!!!");
        return "home";
    }

}
