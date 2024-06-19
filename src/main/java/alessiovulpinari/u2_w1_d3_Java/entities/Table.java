package alessiovulpinari.u2_w1_d3_Java.entities;


import alessiovulpinari.u2_w1_d3_Java.enums.TableState;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Table {

   private int tableNumber;
   private int maxCoperti;
   private TableState tableState;
}
