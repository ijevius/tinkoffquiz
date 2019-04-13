import java.util.Scanner;

public class Spring2019Ex1 {

    static Scanner sc = new Scanner(System.in);
    static String message;

    public static void main(String[] args){
        message = sc.nextLine();
        message = message.replaceAll(" +", " ");
        if(message.startsWith(" ")){
            message = message.substring(1, message.length());
        }
        if(message.endsWith(" ")){
            message = message.substring(0, message.length()-1);
        }
        System.out.println(message);
    }

}
