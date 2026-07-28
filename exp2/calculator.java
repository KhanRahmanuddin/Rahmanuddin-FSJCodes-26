/* AIM : WAP to create a calculator class to add two numbers. Use constructor overloading to initialize the data with either default values or user provided values. Use method overloading to add integer or double.
NAME : KHAN RAHMANUDDIN
CLASS : SE-COMPS(A) */
public class Calculator {
    int a;
    int b;
    Calculator() {
        a = 0;
        b = 0;
    }
    Calculator(int x, int y) {
        a = x;
        b = y;
    }
    void add(int m, int n) {
        int sum = m + n;
        System.out.println("Sum Of Integers : " + sum);
    }
    void add(double m, double n) {
        double sum = m + n;
        System.out.println("Sum Of Doubles : " + sum);
    }
}
