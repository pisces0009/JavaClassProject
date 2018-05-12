
package vehicle;


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Vehicle {

   
    public static void main(String[] args) {
        
     
        double dryWeight;
        int year;
        String color, make, model;
        String  ch = JOptionPane.showInputDialog(null, "if you want to built Car then press '1' And for Truck Press '2'");
        
        
        if("1".equals(ch) || "1".equals(ch))
        {
            dryWeight = Double.valueOf(JOptionPane.showInputDialog(null, "Enter the car’s dry weight::"));
            year = Integer.valueOf(JOptionPane.showInputDialog(null, "Enter Year of Car:: "));
            color = JOptionPane.showInputDialog(null, "Enter Color::");
            make = JOptionPane.showInputDialog(null, "Enter Make::");
            model = JOptionPane.showInputDialog(null, "Enter Model::");
           
            
            Car C = new Car();
            
            int doors = Integer.valueOf(JOptionPane.showInputDialog(null, "How many doors you want? "));
            String sunroof = String.valueOf(JOptionPane.showInputDialog(null, "Press ENTER For 'SunRoof' Option "));
            C.setValue(doors, sunroof);
           
            String rf;
          
           //rf = "yes";
           //if(objCar.equals(rf))
           //{
              rf = JOptionPane.showInputDialog(null,"(With SunRoof press '3' And for Without SunRoof Press '4') ");
              if("3".equals(rf) || "3".equals(rf))
              {
           //}else {
             //JOptionPane.showMessageDialog(null, "with sunroof" );
               rf = "'with sunroof'";
           }else if("4".equals(rf) || "4".equals(rf)){
            //JOptionPane.showMessageDialog(null, "without sunroof");
            rf = "'without Sunroof'";
        }
           
     //final ImageIcon icon1 = new ImageIcon("abc.png");
     
         JOptionPane.showMessageDialog(null, "Final features:>>  \n car weight is: \n" + dryWeight + "\n year: "+year+ "\n Color : "+color+"\n make : "+make+ ".\n model : "+model+ " with "+String.valueOf(C.getDoorValue())+" doors and  " + rf);
        
         
         
         
         
        } else if( "2".equals(ch) || "2".equals(ch))
        { 
            
            dryWeight = Double.valueOf(JOptionPane.showInputDialog(null, "Enter the Truck’s dry weight"));
            year = Integer.valueOf(JOptionPane.showInputDialog(null, "Enter Year of Truck: "));
            color = JOptionPane.showInputDialog(null, "Enter Color:");
            make = JOptionPane.showInputDialog(null, "Enter Make: ");
            model = JOptionPane.showInputDialog(null, "Enter Model: ");
            
            
            Truck objTruck = new Truck();
            
            
            int axels = Integer.valueOf(JOptionPane.showInputDialog(null, "Enter axels: "));
            double grossCombinedWeight = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter : grossCombinedWeight (weight when the truck is fully loaded)"));
            int range = Integer.valueOf(JOptionPane.showInputDialog(null, "Enter range (on a full tank of fuel): "));
            
            objTruck.setValue(axels, range, grossCombinedWeight);
            
            JOptionPane.showMessageDialog(null, "Final features:>> \n your Truck weight : \n"+ dryWeight + "\n year  "+year+ "\n Color:  "+color+"\n make: "+make+ "\n model : "+model+ " with "+String.valueOf(objTruck.getAxelsValue())+" axels \n grossCombinedWeight: " + objTruck.getGCWValue() + "\n weight when the truck is fully loaded "+ objTruck.getRangeValue() + "Miles");
            
            
        }
        
        
    }
    
}
