import java.util.*;
class Love{
    public static int rev(int n){
        int r = 0;
        while(n>0){
            r = r*10 + (n%10);
            n /= 10;
        }
        return r;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int l = sc.nextInt();
        for(int i = f ; i <= l ; i++){
            if(i==rev(i)){
                System.out.format("%d ",i);
            }
        }
    }
}