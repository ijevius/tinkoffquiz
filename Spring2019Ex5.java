import java.util.Scanner;

public class Spring2019Ex5 {

    static int N, M, r; static int[][] ij;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        N = sc.nextInt();
        M = sc.nextInt();
        ij = new int[M][2];
        for(int i=0; i<M; i++){
            ij[i][0] = sc.nextInt();
            ij[i][1] = sc.nextInt();
        }
        for(int i=0; i<=M-2; i++){
            for(int k=i+1; k<=M-1; k++){
                if((ij[k][0] <=ij[i][1] && ij[k][0] >= ij[i][0]) || (ij[k][1] >= ij[i][0] && ij[k][1] <= ij[i][1]) || (ij[k][0] <= ij[i][0] && ij[k][1] >= ij[i][1])){
                    break;
                }else{
                    if(k==M-1) r++;
                }
            }
        }
        System.out.println(r+1);
    }

}
