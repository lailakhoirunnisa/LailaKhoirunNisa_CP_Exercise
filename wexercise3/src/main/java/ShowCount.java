/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laila
 */

import java.util.InputMismatchException;
import java.util.Scanner;
final public class ShowCount extends CountArea{
private static String planeFigure;

    
    private static void showAreaAll(CountArea CA, double a, double b){
        CA.set_A(a);
        CA.set_B(b);
        CA.set_C();
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner scanner1= new Scanner(System.in);

        double a=0;
        double b=0;
        int err=0;
        try{
            System.out.println("PLEASE CHOOSE ONE OF THESE PLANE FIGURE");
            System.out.println("1. SQUARE");
            System.out.println("2. RECTANGLE");
            System.out.println("3. CIRCLE");
            System.out.println("4. TRAPEZOID");
            System.out.println("5. TRIANGLE");
            System.out.println("6. RHOMBUS");
            System.out.println("7. KITE");
            System.out.println("8. PARALLELOGRAM");
            System.out.println("PLEASE INSERT YOUR CHOICE [1/2/3/4/5/6/7/8] : ");
            int choice = scanner1.nextInt();
            if (choice==1){
                System.out.println("YOU CHOSE SQUARE");
                System.out.println("INSERT THE SIDES");
                a= scanner1.nextDouble();
                if(a>0){
                planeFigure ="SQUARE";
               CountSquare square1=new CountSquare();
                square1.show_Area(a,b);
                }
                else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
            }
            else if (choice==2){
                System.out.println("YOU CHOSE RECTANGLE");
                System.out.println("INSERT THE LENGTH");
                a= scanner1.nextDouble();
                if(a>0){
                System.out.println("INSERT THE WIDTH");}
                else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
                b= scanner1.nextDouble();
                 if(b>0){
                planeFigure ="RECTANGLE";
               CountRectangle rectangle1=new CountRectangle();
                rectangle1.show_Area(a,b);}
                  else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
            }
             else if (choice==3){
                System.out.println("YOU CHOSE CIRCLE");
                System.out.println("INSERT THE RADIUS");
                a= scanner1.nextDouble();
                 if(a>0){
                planeFigure ="CIRCLE";
               CountCircle circle1=new CountCircle();
                circle1.show_Area(a,b);}
                  else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
            }
            else if (choice==4){
                System.out.println("YOU CHOSE TRAPEZOID");
                System.out.println("INSERT THE AMOUNT OF PARALLEL LENGTH");
                a= scanner1.nextDouble();
                 if(a>0){
                System.out.println("INSERT THE HEIGHT");}
                  else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
                b= scanner1.nextDouble();
                 if(b>0){
                planeFigure ="TRAPEZOID";
               CountTrapezoid trapezoid1=new CountTrapezoid();
                trapezoid1.show_Area(a,b);}
                  else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
            }
            else if (choice==5){
                System.out.println("YOU CHOSE TRIANGLE");
                System.out.println("INSERT THE BASE");
                a= scanner1.nextDouble();
                if(a>0){
                System.out.println("INSERT THE HEIGHT");}
                  else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
                b= scanner1.nextDouble();
                 if(b>0){
                planeFigure ="TRIANGLE";
               CountTriangle triangle1=new CountTriangle();
                triangle1.show_Area(a,b);}
                  else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
            }
            else if (choice==6){
                System.out.println("YOU CHOSE RHOMBUS/BELAH KETUPAT");
                System.out.println("INSERT THE DIAGONAL1");
                a= scanner1.nextDouble();
                if(a>0){
                System.out.println("INSERT THE DIAGONAL2");}
                 else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
                b= scanner1.nextDouble();
                if(b>0){
                planeFigure ="RHOMBUS";
               CountRhombus rhombus1=new CountRhombus();
                rhombus1.show_Area(a,b);}
                 else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
            }
            else if (choice==7){
                System.out.println("YOU CHOSE KITE");
                System.out.println("INSERT THE DIAGONAL1");
                a= scanner1.nextDouble();
                if(a>0){
                System.out.println("INSERT THE DIAGONAL2");}
                  else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
                b= scanner1.nextDouble();
                if(b>0){
                planeFigure ="KITE";
               CountKite kite1=new CountKite();
                kite1.show_Area(a,b);}
                 else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
            }
            else if (choice==8){
                System.out.println("YOU CHOSE PARALLELOGRAM");
                System.out.println("INSERT THE BASE");
                a= scanner1.nextDouble();
                  if(a>0){
                System.out.println("INSERT THE HEIGHT");}
                  else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
                b= scanner1.nextDouble();
                 if(b>0){
                planeFigure ="PARALLELOGRAM";
               CountParallelogram parallelogram1=new CountParallelogram();
                parallelogram1.show_Area(a,b);}
                  else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
            }
            else{
                System.out.println("YOU DIDN'T CHOSE ANY OF CHOICE");
            }
        }
        catch(InputMismatchException | ArithmeticException e)
        {
            err=1;
            System.out.println("PROGRAM CAN NOT RUN, BECAUSE OF " + e);
        }
    
}

    @Override
    protected void set_A(double a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void set_B(double b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void set_C() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double get_A() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double get_B() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected double get_C() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void show_Area(double a, double b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}