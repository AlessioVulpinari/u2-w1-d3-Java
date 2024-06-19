package alessiovulpinari.u2_w1_d3_Java;

import alessiovulpinari.u2_w1_d3_Java.entities.Drink;
import alessiovulpinari.u2_w1_d3_Java.entities.Order;
import alessiovulpinari.u2_w1_d3_Java.entities.Pizza;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class U2W1D3JavaApplicationTests {

	// Calcolo del coperto
	@ParameterizedTest
	@CsvSource({"2, 3, 6", "1.50, 10, 15", "2.50 , 5, 12.5"})
	void sumCovered(double price, int nCovered, double total)
	{
		double result = price * nCovered;
		assertEquals(result, total);
	}

	// Somma i prezzi dei Topping di una pizza
	@ParameterizedTest
	@CsvSource ({"hawaiianPizza , 1.78", "salamiPizzaXl, 1.98"})
	void sumTopping(String pizzaName, double totalToppingPrice) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U2W1D3JavaApplication.class);

		Pizza hawaiPizza = (Pizza) ctx.getBean(pizzaName);

		double partial = 0;

		for (int i = 0; i < hawaiPizza.getToppingList().size(); i++) {
			partial += hawaiPizza.getToppingList().get(i).getPrice();
		}

		assertEquals(partial, totalToppingPrice);

	}

	// Controllare il prezzo di una pizza
	@ParameterizedTest
	@CsvSource({"hawaiianPizza , 6.49", "margheritaXl, 6.99"})
	void checkPizzaPrice(String pizzaName, double price) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U2W1D3JavaApplication.class);
		Pizza pizza = (Pizza) ctx.getBean(pizzaName);

		assertEquals(pizza.getPrice(), price);
	}

	// Controlla se lo stato di un ordine non è nullo
	@ParameterizedTest
	@CsvSource({"order"})
	void checkOrderStatus(String order) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U2W1D3JavaApplication.class);
		Order order1 = (Order) ctx.getBean(order);

		assertNotNull(order1.getState());
	}

	// Controlla se il prezzo di una bevanda è maggiore di 0
	@ParameterizedTest
	@CsvSource({"wine", "lemonade", "water"})
	void checkDrinkPrice(String drink) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U2W1D3JavaApplication.class);
		Drink drink1 = (Drink) ctx.getBean(drink);

		assertNotSame(drink1.getPrice(), 0.0);
	}


}
