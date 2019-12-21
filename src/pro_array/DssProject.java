/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro_array;
//import static java.lang.Double.sum;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class DssProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); 
        // size of array
        System.out.print("enter size of array d1 = ");
        int one = sc.nextInt();
        System.out.print("enter size of array d2 = ");
        int two = sc.nextInt();
        
        double a [][] = new double[one][two];
        double value [];
        value = new double[one-1];
         double su = 0,tu=0;
       
// enter array elements
System.out.println("the firest row is float");
 for (int i = 0; i < a.length; i++) { 
        for(int j = 0; j < a[i].length; j++) 
           a[i][j] = sc.nextDouble();
        if(i==0){
            System.out.println("now enter int number");
        }
     }
 
 // out 
      int count =0;
     for (int i = 1; i < one; i++) {
         count++;
            for(int j = 0; j < two; j++)
            {
                 su = su+(a[i][j]*a[i-count][j]);
            }
             value[i-1] = su;
             su=0;
         }
     for(int i=0;i<one-1;i++)
     System.out.println(value[i]);
    }
    
    
    
}
