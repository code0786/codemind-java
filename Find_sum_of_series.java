import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double sum = 0.0;
        while(n>0){
            sum+=1.0/(n*1.0);
            n--;
        }
        System.out.format("%.2f",sum);
    }
}