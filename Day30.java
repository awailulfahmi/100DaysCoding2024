
import java.math.BigDecimal;


public class Day30 {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("10.88");
        BigDecimal b = new BigDecimal("89.88");
        
        //aritmatika
        BigDecimal pengurangan = a.subtract(b);
        BigDecimal perkalian = a.multiply(b);
        
        System.out.println("pengurangan"+pengurangan);
        System.out.println("Perkalian"+perkalian);
    }
    
}
