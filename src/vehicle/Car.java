/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author PRASAD
 */
public class Car extends Vehicle  {
    
    private int doors;
    private String sunroof;
    
    /*public Car(int doors, boolean sunroof){
        this.doors = doors;
        this.sunroof = sunroof;
    }*/
    
    public void setValue(int doors, String sunroof){
        this.doors = doors;
        this.sunroof = sunroof;
    }
    
    public int getDoorValue(){
        return doors;
    }
    
    public String getSunroofValue(){
        return sunroof;
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
    /* public void setValue(int x , boolean y)
    {
        
        doors = x;
        sunroof = y;
        
    }
    
    public int getDoorValue()
    {
        return doors;
    }
    public boolean getSunroofValue()
    {
        return sunroof;
    }*/
    
}
