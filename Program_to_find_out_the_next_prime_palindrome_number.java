import java.util.*;
class Love{
    public static int rev(int n){
        int re = 0;
        while(n!=0){
            re = re * 10 + (n % 10) ;
            n /= 10;
        }
        return re;
    }
    public static int prime(int n){
        if(n==1){
            return 0;
        }
        else{
            int c = 0;
            for(int i = 2 ; i <= n/2 ; i++){
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
        if(n==rev(n)){
            n+=1;
        }
        while(n!=0){
            if(n==rev(n) && prime(n)==1){
                System.out.format("%d",n);
                break;
            }
            n++;
        }
    }
}