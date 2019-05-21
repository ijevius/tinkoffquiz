import java.util.Scanner;

public class SummerIntership2019Ex5 {

    static Scanner sc = new Scanner(System.in);
    static String pass; static boolean b = false, d = false, s = false;

    public static void main(String[] args){
        pass = sc.nextLine();
        if(pass.length() < 8){
            System.out.println("NO");
            System.exit(0);
        }else{
            char[] arr = pass.toCharArray();
            for(int y = 0;  y < arr.length; y++){
                if(isBigSym((int) arr[y])){
                    b = true;
                }else if(isSmallSym((int) arr[y])){
                    s = true;
                }else if(Character.isDigit(arr[y])){
                    d = true;
                }else{
                    System.out.println("NO");
                    System.exit(0);
                }
            }
        }
        if(b && d && s){
            System.out.println("YES");
        }
    }

    static boolean isBigSym(int c){
        return (c >= 65 && c <= 90);
    }

    static boolean isSmallSym(int c){
        return (c >= 97 && c <= 122);
    }

}
