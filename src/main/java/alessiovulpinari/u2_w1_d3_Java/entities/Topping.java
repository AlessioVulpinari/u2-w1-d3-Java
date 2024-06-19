package alessiovulpinari.u2_w1_d3_Java.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Topping extends MenuElement{

    public Topping(String name, Double price, int calories) {
        super(name, price, calories);
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
