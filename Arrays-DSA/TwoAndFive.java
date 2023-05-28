public class TwoAndFive{
    public static void main(String[] args){
        int a=2;
        int b=20;
        int size=Math.abs(b-a)+1;
        int[] ar=new int[size];
        for(int i=a;i<=b;i++){
            if(i%2==0 || i%5==0){
                ar[i-a]=1;
            }
        }
        System.out.print("multiples of 2 and 5 are: ");
        for(int i=a;i<=b;i++){
            if(ar[i-a]==1){
                System.out.print(i+" ");
            }
        }
       

    }
}