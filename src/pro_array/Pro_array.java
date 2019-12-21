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
public class Pro_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner enter_vlaue = new Scanner(System.in);
        
        System.out.print("for profit enter 1 or 0 for cost :");
        int decision = enter_vlaue.nextInt();
        // size of array
        System.out.print("enter rows of array = ");
        int rows = enter_vlaue.nextInt();
        System.out.print("enter columns of array = ");
        int columns = enter_vlaue.nextInt();
        
        double a [][] = new double[rows][columns];
        double value [];
        value = new double[rows-1];
         double outPutValue = 0;
       
// enter array elements
System.out.println("the first " + columns + " number is float");
 for (int i = 0; i < a.length; i++) { 
        for(int j = 0; j < a[i].length; j++) 
           a[i][j] = enter_vlaue.nextDouble();
        if(i==0){
            System.out.println("now enter integer number");
        }
     }
 
 // out put
     int count =0;
     double temp =0;
     
     for (int i = 1; i < rows; i++) {
         count++;
            for(int j = 0; j < columns; j++)
            {
                 outPutValue = outPutValue+(a[i][j]*a[i-count][j]);
            }
             value[i-1] = outPutValue;
             
             outPutValue=0;
         }
     if(value.length<2){
         System.out.println("ther is no decsion to make here");
     } 
     else if(decision == 1)
     {
        temp =  value[0];
        for(int i=1;i<value.length;i++)  {
             
             if(value[i] > temp)
             temp =  value[i];
                                                 
        System.out.println(temp);
    }
         
     } else if(decision == 0){
         temp =  value[0];
        for(int i=1;i<value.length;i++)  {
             
             if(value[i] < temp)
             temp =  value[i];
                                                 
        System.out.println(temp);
    }
     }
     
    }
    
    
    
}
