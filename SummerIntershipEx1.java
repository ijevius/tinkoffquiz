import java.util.Scanner;

public class SummerIntershipEx1 {

    static int n;
    static double x, y;
    static double metres;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        x = sc.nextInt();
        y = sc.nextInt();
        if(y>x){
            metres = x;
            while(metres < y){
                metres = metres + metres/100*70;
                n++;
            }
        }else{
            n = 1;
        }
        System.out.println(n);
    }


}
