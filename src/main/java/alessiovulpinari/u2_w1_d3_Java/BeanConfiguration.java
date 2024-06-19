package alessiovulpinari.u2_w1_d3_Java;

import alessiovulpinari.u2_w1_d3_Java.entities.*;


import alessiovulpinari.u2_w1_d3_Java.enums.OrderState;
import alessiovulpinari.u2_w1_d3_Java.enums.Size;
import alessiovulpinari.u2_w1_d3_Java.enums.TableState;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDate;
import java.util.Arrays;

@Configuration
@PropertySource("application.properties")
public class BeanConfiguration {

    @Bean
    public Topping ham() {
        return new Topping("Ham", 0.99, 35);
    }

    @Bean
    public Topping pineapple() {
        return new Topping("Pineapple", 0.79, 24);
    }

    @Bean
    public Topping salami() {
        return new Topping("Salami", 0.99, 86);
    }

    @Bean
    public Topping cheese() {
        return new Topping("Cheese", 0.69, 92);
    }

    @Bean
    public Pizza margherita() {
        return new Pizza("Margherita", 4.99, 1104, null, Size.NORMAL);
    }

    @Bean
    public Pizza margheritaXl() {
        return new Pizza("Margherita XL", 6.99, 1504, Arrays.asList(cheese()), Size.XL);
    }

    @Bean
    public Pizza hawaiianPizza() {
        return new Pizza("hawaiian Pizza", 6.49, 1024, Arrays.asList(ham(), pineapple()), Size.NORMAL);
    }

    @Bean
    public Pizza hawaiianPizzaXl() {
        return new Pizza("hawaiian Pizza XL", 8.49, 1524, Arrays.asList(ham(), pineapple(), ham(), pineapple()), Size.XL);
    }

    @Bean
    public Pizza salamiPizza() {
        return new Pizza("Salami Pizza", 5.99, 1160, Arrays.asList(salami()), Size.NORMAL);
    }

    @Bean
    public Pizza salamiPizzaXl() {
        return new Pizza("Salami Pizza XL", 88.99, 1660, Arrays.asList(salami(), salami()), Size.XL);
    }


    @Bean
    public Topping onion() {
        return new Topping("Onion", 0.69, 22);
    }

    @Bean
    public Drink lemonade() {
        return new Drink("Lemonade", 1.29, 128);
    }

    @Bean
    public Drink water() {
        return new Drink("Water", 1.29, 0);
    }

    @Bean
    public Drink wine() {
        return new Drink("Wine", 7.49, 607);
    }

    @Bean
    public Table table() {
        return new Table(1, 10, TableState.OCCUPIED);
    }

    @Bean
    public Order order(@Value("${coperto.price}") double copertoPrice) {
        return new Order(1, table(), Arrays.asList(margherita(), margheritaXl()), OrderState.SERVED, copertoPrice,
                2, LocalDate.now());
    }
}
