
public class PowerCalculator
{
    /**
     * Calculate the non-negative power of an integer number. If a negative power is input, the method returns 1.
     * 
     * @param number The number to take power.
     * @param power The power factor to be taken to.
     * @return The calculation result after taking power of the integer number.
     */
    public static long powerN(int number, int power) {
        int counter = 1;
        int base = number;
        // write your code after this line
        if (power <= 0) return 1;
        
        while (counter < power){
            
            number = number * base;
            counter += 1;
        
        }
        
        return number; // remove this line after completing your code
    }
    public static int fact2(int n1, int n2) {  

    int t = 1; // initialize t to 1       
    for (int counter = n1; counter <= n2; counter++) {
        t = t * counter;
    }
    return t;
}
 
    
    public static void main(String[] args){
        long val = powerN(2, 4);
        System.out.println(val);
        
        int a = 4;
        int b = 20;
        int result1 = b / ++a;
        int result2 = b / a++;
        System.out.println(result1);
        System.out.println(result2);
    
    }
}
