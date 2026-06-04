package PATTERNS;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
     Scanner sct = new Scanner(System.in);
     int rows = sct.nextInt();
      for(int i =1;i<=rows;i++){
        // for(int j =i;j<=rows;j++){
        // for(int j=rows;j>=i;j--){ NOT STANDARD TEMPLATE
        for(int j=1;j<=rows+1-i;j++){
            System.out.print("*"+" ");
        }
        System.out.println();
     }
}
}
