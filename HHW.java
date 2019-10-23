import java.util.Scanner;
public class HHW{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float V1 = scn.nextFloat();
        float maxVal = V1;
        float minVal = V1;
        for(int i = 1;i < 10;i++){
            V1 = scn.nextFloat();
            if(maxVal < V1){
                maxVal = V1;
            }else if(minVal > V1){
                minVal = V1;
            }
            System.out.println(maxVal);
            System.out.println(minVal);
        }
    }
}