package com.taggy;
import java.math.BigDecimal;

public class SwitchStatement {

    public static void main(String[] args) {
            System.out.println("Trying out new features");
            
            System.out.println("Strings");
           
            System.out.println(getBigDecimalPrior17("100"));
            System.out.println(getBigDecimalin17("100"));

            System.out.println("Double");
            System.out.println(getBigDecimalPrior17(100d));
            System.out.println(getBigDecimalin17(100d));

            System.out.println("BigDecimal");
            System.out.println(getBigDecimalPrior17(BigDecimal.ONE));
            System.out.println(getBigDecimalin17(BigDecimal.ONE));

            System.out.println("Integer");
            System.out.println(getBigDecimalPrior17(10));
            System.out.println(getBigDecimalin17(10));
    }

    static BigDecimal getBigDecimalPrior17(Object o) {
        BigDecimal output;

        if (o instanceof String) {
            output = new BigDecimal(((String) o));
        } else if (o instanceof Double ) {
           output = new BigDecimal(((double) o));
        } else if (o instanceof BigDecimal) {
            output = ((BigDecimal) o);
        } else {
            output = BigDecimal.ZERO;
        }

        return output;
    }

    static BigDecimal getBigDecimalin17(Object o) {
        return switch (o) {
            case String string -> new BigDecimal(string);
            case Double object -> new BigDecimal(object.doubleValue());
            case BigDecimal object -> object;
            default -> BigDecimal.ZERO;
        };
    }
}
