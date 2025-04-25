
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
    /**public double fever();
    for(double temp : temperatures){
        int feverCase = 0;
        double maxTemp = 0;
            if(37.5 < temp && temp > maxTemp){
                feverCase++;
                maxTemp = temp;
            }
        System.out.println("There is " + feverCase + " fever cases" + " and the max temperature is " + maxTemp);
    }*/
    
    //26
    //System.out.println(temperatures.max());
    
    //27
    //I'm not sure how but i think i could use the sorted list and print the last value since it's sorted from minimum to maximum and I need the maximum.
}
