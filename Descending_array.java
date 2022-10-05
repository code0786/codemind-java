import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int D = scan.nextInt();
        int[] H = new int[D];
        int count = 0;
        for(int i = 0 ; i < D ; i++){
            H[i] = scan.nextInt();
        }
        for(int i = 1 ; i < D ; i++){
            if(H[i-1] > H[i]){
                count++;
            }
        }
        if(count == D-1){
            System.out.format("yes");
        }
        else{
            System.out.format("no");
        }
    }
}