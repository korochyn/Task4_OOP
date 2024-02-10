package org.example.Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 84, 59));
        Calculator calculator = new Calculator();
        System.out.println("calculator.sum(array1) = " + calculator.sum(array1));
        List<Double> array2 = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 84.0, 59.0));
        System.out.println("calculator.sum(array2) = " + calculator.sum(array2));
        Integer vr1 = 1;
        Integer vr2 = 2;
        System.out.println("calculator.del(vr1, vr2) = " + calculator.division(vr1, vr2));
        System.out.println("calculator.multiplication(vr1,vr2) = " + calculator.multiplication(vr1, vr2));
        Double vrd1 = 10.11;
        Double vrd2 = 234.52;
        System.out.println("calculator.del(vr1, vr2) = " + calculator.division(vrd1, vrd2));
        System.out.println("calculator.multiplication(vr1,vrd2) = " + calculator.multiplication(vrd1, vrd2));
        System.out.println("calculator.binary1(vrd2) = " + calculator.decimalToBinary(vrd2));
        Integer vrb1 =101010101;
        String vrb2 = "101010101";
        System.out.println("calculator.binary2(vrs) = " + calculator.binariToDecimal(vrb1,""));
        System.out.println("calculator.binary2(vrs) = " + calculator.binariToDecimal(0,vrb2));


    }
}
