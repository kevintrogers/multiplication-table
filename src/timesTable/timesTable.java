/*************************
Kevin Rogers
cs112
December 3, 2013

Create 2-D array Table with nine rows and nine colums
for (counter=0; counter > row; row++)
   for (counter=0; counter > column; column++)
      Display row* column
do 
   Ask for row and column
   Save row  and column
   Display value is Table[r][c]
    if row = 0 && column = 0
     display done
while row!=0 || column!=0  
   

**************************/
package timesTable;

import java.util.*;

public class timesTable
{
      public static void main(String[]args)
      {
         final int ROW = 100;
         final int COLUMN = 100;
         int row, column;
         int table[][] = new int [ROW][COLUMN]; 
         
         for (int r = 0; r < ROW; r++)
            for (int c = 0; c < COLUMN; c++)
            {
               table[r][c] = r*c;
            }
         try
         {
	         Scanner keyboard = new Scanner (System.in);
	         do
	         {              
		         
		         System.out.println("Please enter a factor between 1 and 99");
		         row = keyboard.nextInt();
		         System.out.println("Please enter another factor between 1 and 99");
		         column = keyboard.nextInt();
		         System.out.println(table[row][column]);
	         }while (row != 0 || column != 0);
	         keyboard.close();     
         }
         catch (ArrayIndexOutOfBoundsException e)
         {
	         System.out.println("You have entered an invalid factor(s).\nPlease reload the program if you wish to try again");
	         System.exit(0); 
         }
 
      }
}

