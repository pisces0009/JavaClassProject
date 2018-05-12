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
public class Truck extends Vehicle {
    
    private int axels;
    private int range;
    private double grossCombinedWeight;
    
   public void setValue(int axels , int range, double grossCombinedWeight)
    {
        
        this.axels = axels;
        this.range = range;
        this.grossCombinedWeight = grossCombinedWeight;
    }
   
    public int getAxelsValue()
    {
        return axels;
    }
    public int getRangeValue()
    {
        return range;
    }
    
    public double getGCWValue()
    {
        return grossCombinedWeight;
    }
}
