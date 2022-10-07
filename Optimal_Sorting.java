import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int max = -99999 , min = 99999;
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
                if(arr[i]>max){
                    max=arr[i];
                }
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            int c = 0;
            for(int i = 1 ; i < n ; i++){
                if(arr[i-1]>arr[i]){
                    c++;
                }
            }
            if(c==0){
                System.out.format("%d",c);
            }
            else{
                System.out.format("%d
",max-min);
            }
        }
    }
}