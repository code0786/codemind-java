import java.util.*;
class Love{
    public static int pal(int n){
        int temp1 = n;
        int temp = 0;
        while(temp1!=0){
            temp = temp*10+(temp1%10);
            temp1/=10;
        }
        if(temp == n){
            return 1;
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner D = new Scanner(System.in);
        int n = D.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            arr[i] = D.nextInt();
            if(pal(arr[i])==1){
                count++;
            }
        }
        System.out.format("%d",count);
    }
}