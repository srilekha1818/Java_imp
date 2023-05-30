public class PowerNum{
    static double powerNum(double x,int n){
        if(n==0)
        return 1;
        if(n<0){
            n=-n;
            x=1/x;
        }
        return (n%2==0) ? powerNum(x*x,n/2) : x*powerNum(x*x,n/2);
        //for even power:(x*x)^n/2 for odd power:x*(x*x)^n/2
    }
    public static void main(String[] args){
double x=2.00;
int n=-4;
System.out.println(powerNum(x, n));
    }
}