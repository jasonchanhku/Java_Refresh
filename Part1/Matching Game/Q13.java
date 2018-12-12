
import comp102x.IO;

public class Q13
{

        public static int countDivisible(int p, int q) {
            
            int counter = 0;
            for(int i = p ; i <= q ; i++){
                
                //divisible by 3 and not divisible by 9
                // ( x mod 3 == 0 && x mod 9 != 0)
                if(i % 3 == 0 && i % 9 != 0){
                    
                    counter++;
                
                }
            
            
            }
            
            return counter;
        }
        
        public static void printNumberLine(int seqCenter, int length) {
        // length is always odd and > 2(seqCenter) + 1
        // difference of length and seq_length is always even
        // number of digits
        // 0: 0         1
        // 1: 010       3
        // 2: 01210     5
        // 3: 0123210   7
        // 4: 012343210 9
        // pattern for sequence length is  2(seqCenter) + 1
        // (length - (2(seqCenter) + 1))/2 will be the amount of whitespace to add
        //System.out.print("\n");
        int space = (length - (2*(seqCenter) + 1))/2;
        
        for(int i = 0 ; i < space ; i ++){
            
            System.out.print(" ");
        
        }
        
        for(int i = 0 ; i <= seqCenter ; i++){
            System.out.print(i);
        
        }
        
        for(int i = seqCenter-1 ; i >= 0  ; i--){
            System.out.print(i);
        
        }
        
        for(int i = 0 ; i < space ; i ++){
            
            System.out.print(" ");
        
        }
        
        System.out.print("\n");
        
        }
        
        public static void printNumberDiamond(int diaCenter) {
        /*
         *     0              (two spaces, followed by a 0, and then followed by two spaces)
         *    010            (one space, followed by 010, and then followed by one space)
         *   01210          (no spaces, followed by 01210, and then followed by no spaces)
         *    010            (one space, followed by 010, and then followed by one space)
         *     0              (two spaces, followed by a 0, and then followed by two spaces)
         * 
         */
        // printNumberLine(0, 5)
        // printNumberLine(1, 5)
        // printNumberLine(2, 5)
        // printNumberLine(1, 5)
        // printNumberLine(0, 5)
        int total = 2*(diaCenter) + 1;
        
        for (int i = 0 ; i <= diaCenter ; i++){
            
            printNumberLine(i, total);
        
        }
        
         for (int i = diaCenter - 1 ; i >= 0 ; i--){
            
            printNumberLine(i, total);
        
        }
        System.out.print("\n");
        }
        
        public static void main(String[] args) {
            // implementation given below
            System.out.println(countDivisible(3, 9));
          
            
        }
}

