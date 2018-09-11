package com.kvirk;

public class Main {

    public static void main(String[] args) {

        byte byteVar = 100;
        short shortVar = 100;
        int intVar = 100;
        long longVar = 50_000 + (10*(byteVar+shortVar+intVar));
        System.out.println("Sum: " + longVar);
        //====================================================


        byte var= 100;
        byte newNum = (byte)(var/2);
        //need to cast it
        //bcz int type cannot be assigned to byte type variable
        System.out.println("New number is :" +  newNum );
        //====================================================

        //use of float and double type
        float floatVar = 5F;
        double doubleVar = 5.2;

        System.out.println("Sum of float num and double num is: " + (floatVar+doubleVar));

        //====================================================
        // ====================================================
        /*code below converts pounds to kilograms
         */
        double poundsVar = 5;
        double poundsToKg = poundsVar * 0.45359237;
        System.out.println("====================================\n" +
                poundsVar + " is equal to " + poundsToKg + " Kg");


    }
}
