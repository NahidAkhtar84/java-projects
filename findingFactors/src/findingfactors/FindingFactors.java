/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package findingfactors;

import java.util.Arrays;
import java.util.Scanner;
import javafx.util.Pair;


public class FindingFactors {

    public FindingFactors(){
       
    }
    
    public static int[] listOfFactors(int n){
        int k=0;
        int newarr[] = new int[n];
       //Finding the factors.
       
      for (int i=1; i<=Math.sqrt(n); i++) 
        { 
            if (n%i==0) 
            { 
                // If divisors are equal, take i
                if (n/i == i) {
                    newarr[k] = i;
                    k++;
                }
                else // Otherwise take i and n/i
                {
                    newarr[k] = i;
                    k++;
                    newarr[k] = n/i;
                    k++;
                }
                     
            } 
        } 
      //sort the array
    Arrays.sort(newarr, 1, k);
        //Define a new array to copy the elements from newarr
        int arr[] = new int[k];
        for(int i=0; i<k; i++)
        {
            arr[i] = newarr[i];
        }
        
        return arr;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in); 
        //Enter the values
        System.out.println("Enter the value of n:");
        n = sc.nextInt();
        FindingFactors f = new FindingFactors();
        System.out.println(Arrays.toString(FindingFactors.listOfFactors(n)));
    }
    
}
