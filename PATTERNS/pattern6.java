package PATTERNS;
import java.util.*;
public class pattern6 {
     public static void main(String[] args) {
     Scanner sct = new Scanner(System.in);
     int rows = sct.nextInt();
      for(int i =1;i<=rows;i++){
        for(int j =1;j<=rows;j++){
            System.out.print(i+" ");
        }
        System.out.println();
     }
}
}
