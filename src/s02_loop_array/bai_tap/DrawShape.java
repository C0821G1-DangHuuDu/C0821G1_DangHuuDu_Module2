package s02_loop_array.bai_tap;

import java.util.Scanner;

public class DrawShape {
    public static void main(String[] args) {
        DrawShape draw=new DrawShape();
        int choice=-1;
        Scanner input= new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");

        do {
            System.out.print("Enter your choice (from 1 to 4): ");
            choice = Integer.parseInt(input.nextLine());

        } while (choice<1||choice>4);

        if (choice==1){
            draw.drawRectangle();
        } else if (choice==2){
            draw.drawSquareTriangle();
        }else if (choice==3){
            draw.drawIsoscelesTriangle();
        } else {
            System.out.println("Exit.");
        }


    }
    public void drawRectangle(){
        int width;
        int height;
        Scanner input= new Scanner(System.in);

        System.out.print("Enter height: ");
        height = Integer.parseInt(input.nextLine());

        System.out.print("Enter width: ");
        width = Integer.parseInt(input.nextLine());

        for (int i=0;i<height;i++){
            System.out.print("\n");
            for (int j=0;j<width;j++){
                System.out.print("*"+"\t");
            }
        }
    }

    public void drawSquareTriangle(){
        int height;
        Scanner input= new Scanner(System.in);

        System.out.print("Enter height: ");
        height = Integer.parseInt(input.nextLine());

        for (int i=0;i<height;i++){
            System.out.print("\n");
            for (int j=0;j<=i;j++){
                System.out.print("*"+"\t");
            }
        }
        System.out.print("\n");

        for (int i=0;i<height;i++){
            System.out.print("\n");
            for (int j=height;j>i;j--){
                System.out.print("*"+"\t");
            }
        }
        System.out.print("\n");

        for (int i=0;i<height;i++){
            System.out.print("\n");
            for (int j=height;j>i;j--){
                System.out.print(" "+"\t");
            }
            for (int k=0;k<=i;k++){
                System.out.print("*"+"\t");
            }
        }
        System.out.print("\n");

        for (int i=0;i<height;i++){
            System.out.print("\n");
            for (int j=0;j<i;j++){
                System.out.print(" "+"\t");
            }
            for (int k=height;k>i;k--){
                System.out.print("*"+"\t");
            }
        }
        System.out.print("\n");


    }
    public void drawIsoscelesTriangle() {
        int height;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height: ");
        height = Integer.parseInt(input.nextLine());

        for (int i=0;i<height;i++){
            System.out.print("\n");
            for (int j=height;j>i;j--){
                System.out.print(" "+"\t");
            }
            for (int k=0;k<=i;k++){
                System.out.print("*"+"\t");
            }
            for (int l=1;l<=i;l++){
                System.out.print("*"+"\t");
            }
        }


    }
}
