import java.util.Scanner;

public class SummerIntershipEx4 {

    static Scanner sc = new Scanner(System.in);
    static long N; static long d = 2;

    public static void main(String[] args){
        N = sc.nextLong();
        if(N%2 != 0){
            d = 3;
            while(N%d != 0){
                d+=2;
            }
        }
        System.out.println(d);
    }

}
