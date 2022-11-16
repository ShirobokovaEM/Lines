
package javaapp108;

import java.util.Scanner;


public class JavaApp108 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("vvedite stroky");
        String line = scan.nextLine();
        
        System.out.println("vvedite slovo");
        String word = scan.nextLine();
        
        int count = 0;
        int start = 0;
        while(true){
            int pos = line.indexOf(word, start);
            if(pos == -1)
                break;
            count++;
            start = pos + 1;
        }
        System.out.println(count);
    }
    
}
