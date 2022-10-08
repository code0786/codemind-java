import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0;
        int s = 1;
        int ne = f+s;
        while(s<= n){
            f = s;
            s = ne;
            ne = f+s;
        }
        if(n-f == s-n)
            System.out.format("%d %d",f,s);
        else if(n-f < s-n)
            System.out.format("%d",f);
        else
            System.out.format("%d",s);
    }
}
