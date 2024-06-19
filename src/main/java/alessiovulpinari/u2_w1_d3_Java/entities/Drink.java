package alessiovulpinari.u2_w1_d3_Java.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Drink extends MenuElement{

    public Drink(String name, Double price, int calories) {
        super(name, price, calories);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
