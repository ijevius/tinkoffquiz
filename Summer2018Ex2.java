import java.util.Scanner;

public class Summer2018Ex2 {

    static Scanner sc = new Scanner(System.in);
    static String message;

    public static void main(String[] args){
        message = sc.nextLine();
        int f = message.indexOf("@");
        int l = message.lastIndexOf("@");
        String b = message.substring(f+1, l);
        message = message.replace(b, new StringBuilder(b).reverse().toString());
        System.out.println(message);
    }

}
