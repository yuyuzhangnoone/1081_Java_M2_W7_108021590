import java.util.Scanner;
public class HW{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sun = 0;
        int i =scn.nextInt();
        for(int f=3 ;f<=i;f+=3){
            sun = sun+f;
            System.out.println(sun);
        }
    }
}