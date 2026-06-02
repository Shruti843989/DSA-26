package PATTERNS;
import java.util.*;
public class pattern5 {
    public static void main(String[] args) {
     Scanner sct = new Scanner(System.in);
     int rows = sct.nextInt();
      for(int i =0;i<rows;i++){
        for(int j =1;j<=rows;j++){
            System.out.print((char)(j+96)+" ");
        }
        System.out.println();
     }
}
}
