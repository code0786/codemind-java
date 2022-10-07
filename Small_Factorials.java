import java.util.*;
class Love{
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0){
            int n = sc.nextInt();
            System.out.format("%d
",fact(n));
            test-=1;
        }
    }
}