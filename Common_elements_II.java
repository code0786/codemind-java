import java.util.*;
class Love
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        int[] brr = new int[b];
        for(int i = 0 ; i < a ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < b ; i++){
            brr[i] = sc.nextInt();
        }
        int[] rrr = new int[100];
        int c = 0;
        for(int i = 0 ; i < a ; i++){
            int count = 0;
            for(int j = 0 ; j < b ; j++){
                if(arr[i] != brr[j]){
                    count++;
                }
            }
            if(count == b){
                rrr[c++] = arr[i];
            }
        }
        for(int i = 0 ; i < b ; i++){
            int count = 0;
            for(int j = 0 ; j < a ; j++){
                if(arr[j] != brr[i]){
                    count++;
                }
            }
            if(count == a){
                rrr[c++] = brr[i];
            }
        }
        for(int i = 0 ; i < c ; i++){
            System.out.format("%d ",rrr[i]);
        }
    }
}