import java.util.*;
class Love{
    public static int add(int n){
        int sum = 0, c = 0;
        while(n>0){
            sum+=n%10;
            n/=10;
            c++;
        }
        if(c==1){
            return sum;
        }
        else{
            return add(sum);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.format("%d",add(n));
    }
}