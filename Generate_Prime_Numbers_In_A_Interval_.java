import java.util.*;
class Love{
    public static int prime(int n){
        if(n==1){
            return 0;
        }
        else{
            int c = 0;
            for(int i = 2 ; i < n ; i++){
                if(n%i==0){
                    c++;
                }
            }
            if(c==0){
                return 1;
            }
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        while(n<=m){
            if(prime(n)==1){
                System.out.format("%d
",n);
            }
            n++;
        }
    }
}