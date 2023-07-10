package com.taggy;
import java.math.BigDecimal;

public class SwitchStatement {

    public static void main(String[] args) {
         System.out.println("------");
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
            case Double object -> f.doubleValue();
            case BigDecimal object -> Double.parseDouble(s);
            default -> BigDecimal.ZERO;
        };
    }
}
