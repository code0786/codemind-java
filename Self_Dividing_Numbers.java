import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = a ; i <= b ; i++){
            int c = 0, d = 0;
            a = i;
            while(a>0){
                int p = a%10;
                if(p!=0 && i%p==0){
                    c++;
                }
                a/=10;
                d++;
            }
            if(c==d){
                System.out.format("%d ",i);
            }
        }
    }
}