package PATTERNS;
import java.util.*;
public class pattern1 {
 public static void main(String[] args) {
    Scanner sct = new Scanner(System.in);
    int rows = sct.nextInt();
    int colums = sct.nextInt();
    for(int i =0;i<rows;i++){
        for(int j = 0;j<colums;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
 }   
}
