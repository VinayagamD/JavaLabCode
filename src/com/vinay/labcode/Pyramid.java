package com.vinay.labcode;

public class Pyramid {
    public static void main(String[] args) {
       int rows = 8;
        int spaceCount=0,data = 0;

       for (int col =1; col<= rows; col++){
           for (int space=1; space<=rows-col; space++){
               System.out.print("  ");
                spaceCount++;
           }
           for(int printCol = 1; printCol <= rows+col; printCol++ ){
               if((printCol+spaceCount)<=rows) {
                   data = rows - (printCol + spaceCount) + 1;
                   System.out.print(data + " ");
               }else if(data <= (rows-spaceCount-1)){
                   System.out.print(++data+" ");
               }else {
                   System.out.print("  ");
               }
           }
           spaceCount=data=0;
           System.out.println();
       }
    }
}
