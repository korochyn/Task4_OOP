package org.example.Calculator;

import java.util.List;

public class Calculator<T extends Number, S extends String> {


    public Double sum(List<? extends Number> array) {
        Double res = 0.0;
        for (int i = 0; i < array.size(); i++) {
            res += array.get(i).doubleValue();
        }

        return res;
    }

    public Double division(T val1, T val2) {

        return val1.doubleValue() / val2.doubleValue();
    }

    public Double multiplication(T val1, T val2) {

        return val1.doubleValue() * val2.doubleValue();
    }

    public  String decimalToBinary(T val) {
        String val1 = Integer.toBinaryString(val.intValue());
        return val1;
    }

    public Integer binariToDecimal(T val1, S val2){
        //if (val1 = 0) {}
        if (val2 != "") {
            Integer val3 = Integer.parseInt(val2.toString(),2);
            return val3;}
        else {
            Integer val4 = Integer.parseInt(val1.toString(),2);
            return val4;}

    }

//    public  Integer binariToDecimal(T val) {
//        Integer val1 = Integer.parseInt(val.toString(),2);
//        return val1;
//    }
//    public  Integer binariToDecimalStr(S val) {
//        Integer val1 = Integer.parseInt(val.toString(),2);
//        return val1;
//    }

}
