import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int l = sc.nextInt();
        int n = sc.nextInt();
        int d = 0;
        while(f<=l){
            if(f%n==0){
                d++;
            }
            f++;
        }
        System.out.format("%d",d);
    }
}