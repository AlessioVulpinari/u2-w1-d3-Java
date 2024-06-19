package alessiovulpinari.u2_w1_d3_Java.entities;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Menu {

    List<Pizza> pizzas;
    List<Topping> toppings;
    List<Drink> drinks;
}
