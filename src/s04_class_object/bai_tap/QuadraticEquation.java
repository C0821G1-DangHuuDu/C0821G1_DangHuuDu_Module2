package s04_class_object.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }
    public double getDiscriminant(){
        return b*b-4*a*c;
    }
    public double getRoot1(){
        return (-b+Math.sqrt(b*b-4*a*c))/(2*a);
    }
    public double getRoot2(){
        return (-b-Math.sqrt(b*b-4*a*c))/(2*a);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number a: ");
        double a= Double.parseDouble(input.nextLine());

        System.out.print("Enter number b: ");
        double b= Double.parseDouble(input.nextLine());

        System.out.print("Enter number b: ");
        double c= Double.parseDouble(input.nextLine());

        QuadraticEquation equation=new QuadraticEquation(a,b,c);

        double delta=equation.getDiscriminant();

        if(delta<0){
            System.out.println("The equation has no root");
        } else if (delta==0){
            System.out.println("The equation has 1 root: x1 = x2 = "+equation.getRoot1());
        } else{
            System.out.println("The equation has 2 root: x1 = "+equation.getRoot1()+" and x2 = "+equation.getRoot2());
        }
    }
}


