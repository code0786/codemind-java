import java.util.*;
class Love{
    public static int rev(int n){
        int temp = 0;
        while(n>0){
            temp = temp*10+(n%10);
            n/=10;
        }
        return temp;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(1==1){
            n+=rev(n);
            if(n==rev(n)){
                System.out.format("%d",n);
                break;
            }
        }
    }
}