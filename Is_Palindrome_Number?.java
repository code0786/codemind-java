import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp1 = n;
        int temp = 0;
        while(n!=0){
            temp=temp*10+(n%10);
            n/=10;
        }
        if(temp1 == temp){
            System.out.format("2");
        }
        else{
            System.out.format("1");
        }
    }
}
