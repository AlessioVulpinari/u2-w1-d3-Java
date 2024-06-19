package alessiovulpinari.u2_w1_d3_Java.entities;

import alessiovulpinari.u2_w1_d3_Java.enums.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Pizza extends MenuElement{

    List<Topping> toppingList;
    private Size size;

    public Pizza(String name, Double price, int calories, List<Topping> toppingList, Size size) {
        super(name, price, calories);
        this.toppingList = toppingList;
        this.size = size;
    }
}
