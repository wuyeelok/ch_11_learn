package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FormNum {
    public static void main(String[] args){
        double d = 234234234.566;

        NumberFormat f1 = new DecimalFormat("#,#####.00");
        System.out.println(f1.format(d));

        NumberFormat f2 = new DecimalFormat("0,0,0000000000,0.00000");
        System.out.println(f2.format(d));
    }

}
