package alessiovulpinari.u2_w1_d3_Java.entities;

import alessiovulpinari.u2_w1_d3_Java.enums.OrderState;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Order {

    private int orderNumber;
    private Table table;
    private List<MenuElement> menuElements;
    private OrderState state;
    private double copertoPrice;
    private int copertoNumber;
    private LocalDate acquisitionDate;
    private double totalPrice;

    public Order(int orderNumber, Table table, List<MenuElement> menuElements, OrderState state, double copertoPrice, int copertoNumber, LocalDate acquisitionDate) {
        this.orderNumber = orderNumber;
        this.table = table;
        this.menuElements = menuElements;
        this.state = state;
        this.copertoPrice = copertoPrice;
        this.copertoNumber = copertoNumber;
        this.acquisitionDate = acquisitionDate;
        this.totalPrice = calcTotalPrice(this.menuElements, this.copertoPrice);
    }

    private double calcTotalPrice (List<MenuElement> menuElements, double copertoPrice) {

        System.out.println(copertoPrice);

        double partial = 0;

        for (MenuElement menuElement : menuElements) {
            partial += menuElement.price;
        }

       double coperto = this.copertoNumber * copertoPrice;
        return coperto + partial;
    }
}
