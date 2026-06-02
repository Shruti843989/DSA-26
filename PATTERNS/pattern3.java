package PATTERNS;
import java.util.*;
public class pattern3 {
     public static void main(String[] args) {
     Scanner sct = new Scanner(System.in);
     int rows = sct.nextInt();
     for(int i =0;i<rows;i++){
        for(int j =1;j<=rows;j++){
            System.out.print(j+" ");
        }
        System.out.println();
     }
}
}
