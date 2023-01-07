package ownextrapractice;
/*
 * Simple calculator in java
 */
public class practice1 {
    public static void main(String[] args) {
             Calculator myCalculator = new Calculator();

             System.out.println(myCalculator.add(a: 5, b: 11));

             int subraction = myCalculator.subtract(a: 45, b: 11);
             System.out.println(subraction);

             System.out.println(myCalculator.multiply(a: 2, b: 8));

             System.out.println(myCalculator.divide(a: 8, b: 2));

             System.out.println(myCalculator.modulo(a: 13, b: 12));
    } 
}
