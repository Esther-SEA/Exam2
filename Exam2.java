import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class StringCompare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exam2
{
    // instance variables - replace the example below with your own
    private int x;
    /**
     * Constructor for objects of class StringCompare
     */
    public Exam2()
    {
        x = 0;
        
        ArrayList<Double> temperatures = new ArrayList<Double>();
        temperatures.add(37.9);
        temperatures.add(38.5);
        temperatures.add(39.8);
        temperatures.add(35.7);
        temperatures.add(28.9);
        temperatures.add(42.3);
        
        fever(temperatures);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void Exam2()
    {
        
        //Question 24
        
        //a)
        String a = "chocolate";
        String b = "candy";
        //b)
        if (a.equals(b)){
            System.out.println("yes");
        }
        
        //c)
        else{
           System.out.println("no"); 
        }
    }
    
    //25 
    public void fever(ArrayList<Double> temperatures){
        for(Double temp : temperatures){
            int feverCase = 0;
            double maxTemp = 0;
                if(37.5 < temp){
                    feverCase++;
                    System.out.println("There is " + feverCase + " fever cases");
                }
                
                if(temp > maxTemp){
                    maxTemp = temp;
                    System.out.println("The maximum temperature i " + maxTemp);
                }
        } 
        
        
        //26
        System.out.println("The maximum temperature is " + Collections.max(temperatures));
        
        //27
       Collections.sort(temperatures);
       System.out.println("The maximum temperature is " + temperatures.getLast());
    }
}
