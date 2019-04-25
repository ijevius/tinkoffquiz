public class Spring2019Ex1 {

    static String text = "";
    static Character empty = '\0';
    static char[] t = text.toCharArray();

    public static void main(String[] args){
        for(int i=0; i<t.length-1; i++) {
            if(cur(i)){
                if(right(i)) {
                    t[i] = empty;
                    if(i == 0){
                        t[1] = empty;
                    }else if(i == t.length-2){
                        t[t.length-2] = empty;
                        t[t.length-1] = empty;
                    }
                }
            }else{
                if(right(i) && i==t.length-2) {
                    t[i+1] = empty;
                }
            }
        }
        System.out.println(new String(t));
    }

    static boolean right(int pos){        
        if(pos<=t.length-2)
            return t[pos+1] == ' ';
        else throw new ArrayIndexOutOfBoundsException();
    }

    static boolean cur(int pos){
        if(pos<=t.length-1)
            return t[pos] == ' ';
        else throw new ArrayIndexOutOfBoundsException();
    }

}
