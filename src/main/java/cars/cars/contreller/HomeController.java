package cars.cars.contreller;

import cars.cars.model.Exaple;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(final Model model) {
        model.addAttribute("message", "EEEEEE SPRING!!!");
        final Exaple exaple = new Exaple("AAAAAAAAAa", 15);
        model.addAttribute("objectForExample", exaple);
        model.addAttribute("exaple", new Exaple());
        return "home";
    }

    @PostMapping("/processForm")
    public void processForm(final Exaple exaple, final Model model) {
        model.addAttribute("Name", exaple.getName());
    }

}
