package cars.cars.contreller;

import static cars.cars.model.CarInformation.*;

import cars.cars.model.Car;
import cars.cars.model.CarInformation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/design")
public class DesignController {

    @GetMapping
    public String showDesignForm(final Model model) {
        List<CarInformation> ingredients = Arrays.asList(
                new CarInformation("Buggy", "Hippie", Type.BUGGY),
                new CarInformation("Mazda mx-5", "Corn Tortilla", Type.CABRIOLET),
                new CarInformation("VW Golf", "Ground Beef", Type.HATCHBACK),
                new CarInformation("Lincoln Mark IV", "Big Boss ", Type.COUPE),
                new CarInformation("Tesla Roadster", "Second owner", Type.ROADSTER),
                new CarInformation("Toyota Camry", "First Owner", Type.SEDAN)
        );
        Type[] types = Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),
                    ingredients.get(0));
        }
        model.addAttribute("design", new Car());
        return "design";
    }
}
