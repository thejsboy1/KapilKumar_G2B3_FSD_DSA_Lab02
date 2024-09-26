/**
 * 
 */
package com.gl.skyscraper;


import java.util.Scanner;
import java.util.Stack;


/**
 * 
 */
public class SkyScraperConstruction {

		//4 4 2 3 1
		//3 3 1 2
		
		public static void main(String[] args) 
		{
			int n;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Total no of floors in the building:");
			n = sc.nextInt();
			int[] a = new int[n];
			for(int i =0;i<n;i++) 
			{
				System.out.printf("Enter the floor size given on day: %d\n", i+1);
				a[i] = sc.nextInt();
			}
			
			Solve(a,n);
		}

		public static void Solve(int[] a, int n) 
		{
			
			int max =n;
			Stack<Integer> stack = new Stack<>();
			System.out.println("The order of construction is as follows");
			for(int i=0;i<n;i++)
			{
				
				if(a[i]!=max) 
				{
					stack.push(a[i]);
					System.out.println();
					System.out.println("Day: "+(i+1));
					System.out.println();
				}
				else if(a[i]==max) 
				{
					stack.push(a[i]);
					System.out.println();
					System.out.println("Day: "+(i+1)+" ");
					while(!stack.isEmpty() && stack.peek()==max)
			        {

						System.out.print(stack.pop()+" ");
						max--;
				
			        }
				}
			}
			
		}
		
}


