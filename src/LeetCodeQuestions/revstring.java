package LeetCodeQuestions;

public class revstring {
    public static void main(String[] args) {
        rvsstr("sachin");
    }

    static public void rvsstr(String s){
        int len = s.length();
        String revrs = "";

        for(int i = len-1;i>=0;i--){
            String p;
             revrs =  revrs+s.charAt(i);
        }
        System.out.println(revrs);
    }

    static public void pt(int n){
        
    }


}
