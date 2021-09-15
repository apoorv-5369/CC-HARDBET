import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       int[] arr = new int[t*3];
       for(int i=0; i<t*3; i+=3) {
    	   for(int j=i; j<i+3; j++) {
        	   arr[j] = sc.nextInt();
           } 
    	   
       }
       for(int i=0; i<t*3; i+=3){
    	   if(arr[i]<arr[i+1]&&arr[i]<arr[i+2]) System.out.println("Draw");
           else if(arr[i+1]<arr[i]&&arr[i+1]<arr[i+2]) System.out.println("Bob");
           else if(arr[i+2]<arr[i]&&arr[i+2]<arr[i+1]) System.out.println("Alice");
       }
	}
}
