import java.util.*;
class Love{
    public static int prime(int n){
        int c = 0;
        if(n == 1){
            return 0;
        }
        else{
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
        int[] arr = new int[n];
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            if(prime(arr[i])==1 && arr[i]>=k){
                count++;
            }
        }
        System.out.format("%d",count);
    }
}