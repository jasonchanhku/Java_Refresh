import comp102x.IO;
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class test
     */
    public static int q2(int[] array){
        
        int index = 0;
        
        for (int i = 0; i < array.length; i++){
            if(array[i] < array[index]) index = i;
        }
   
    return index;
    }
    
    public static void main(String[] args){
    
    int[] a;
    a[1] = 1;
    a[2] = 2;
    a[3] = 3;
    IO.outputln(a[0]);
    
    
    } 
}
