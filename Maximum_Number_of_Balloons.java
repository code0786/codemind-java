import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long b = 0 , a = 0 , l = 0 , o = 0 , n = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)=='a'){
                a++;
            }
            else if(s.charAt(i)=='b'){
                b++;
            }
            else if(s.charAt(i)=='l'){
                l++;
            }
            else if(s.charAt(i)=='o'){
                o++;
            }
            else if(s.charAt(i)=='n'){
                n++;
            }
        }
        long balloon = 0 ;
        while(b>0 && a>0 && l>0 && o>0 && n>0){
            b--;
            a--;
            n--;
            l-=2;
            if(l<0){
                break;
            }
            o-=2;
            if(o<0){
                break;
            }
            balloon++;
        }
        System.out.format("%d",balloon);
    }
}