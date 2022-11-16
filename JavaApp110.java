
package javaapp110;

import java.util.Scanner;


public class JavaApp110 {
    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.println("vvedite stroky");
        String line = scan.nextLine();
        
        
        int indexX = line.indexOf("x");
        int indexW = line.indexOf("w"); 
        if(indexX == -1 && indexW == -1){
            System.out.println("net this indexof");
        }
        else if(indexX == -1){
            System.out.println("symbol x ne naiden");
        }
        else if(indexW == -1){
            System.out.println("symbol w ne naiden");
        }
        else if(indexX < indexW){
            System.out.println("x vstretilsya ranshe");
        }else
            System.out.println("w vstretilsya ranshe");        
    }
    
}
