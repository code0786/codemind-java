import java.util.*;
class Love{
    public static int fact(int n){
        int sum = 1;
        while(n>1){
            sum*=n;
            n--;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n ;
        int sum = 0 ; 
        while(n>0){
            sum+=fact(n%10);
            n/=10;
        }
        if(t==sum){
            System.out.format("The number %d is a strong number",t);
        }
        else{
            System.out.format("The number %d is not a strong number",t);
        }
    }
}