/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laila
 */
//belah ketupat
public class CountKite extends CountArea {

    @Override
    protected void set_A(double a) {
  this.a=a;      
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
        c=0.5*a*b;
        System.out.println("SO, THE AREA OF KITE IS " +c);
    }
    
}
