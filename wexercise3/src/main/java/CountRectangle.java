
import java.util.InputMismatchException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laila
 */
public class CountRectangle extends CountArea {

    @Override
    protected void set_A(double a) {
//  iftry{
//      this.a=a;
//  }   
//  catch(InputMismatchException e)
//  {
//      System.out.println("PLEASE INPUT ");   
//  }
    }

    @Override
    protected void set_B(double b) {
   this.b=b;
    }

    @Override
    protected void set_C() {
  
    }

    @Override
    protected double get_A() {
  return a;
  
    }

    @Override
    protected double get_B() {
    return b;
    }

    @Override
    protected double get_C() {
        return c;
    }

    @Override
    protected void show_Area(double a, double b) {
        c=a*b;
        System.out.println("SO, THE AREA OF RECTANGLE IS " +c);
    }
    
}
