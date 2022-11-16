
package javaapp109;

import java.util.Scanner;

public class JavaApp109 {
    
    static int countSymbol(String line){
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == '+' || line.charAt(i) == '-')
            {
                count++;
            }
        }
        return count;
    }
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite stroky");
        String line = scan.nextLine();
        
        int count = countSymbol(line);
        System.out.println("kol-vo symbol + and - = " + count);
    }    
}
