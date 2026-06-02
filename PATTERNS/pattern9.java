package PATTERNS;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
     Scanner sct = new Scanner(System.in);
     int rows = sct.nextInt();
      for(int i =1;i<=rows;i++){
        for(int j =1;j<=rows;j++){
            if(i%2==0){
            System.out.print((char)(i+64)+" ");
            }else{
                System.out.print((char)(i+96)+" ");
            }
        }
        System.out.println();
     }
}
}
