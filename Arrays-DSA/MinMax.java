/*Q1. Given an array of size N. The task is to find the maximum and 
the minimum element of the array using the minimum number of comparisons. */
public class MinMax{
    static int[] minMax(int ar[],int n){
        int min=0;
        int max=0;
        if(n==0){
            return new int[]{max,min};
        }
        if(n==1){
            min=ar[0];
            max=ar[0];
            return new int[]{max,min};

        }
        if(ar[0]>ar[1]){
            min=ar[1];
            max=ar[0];

        }
        else{
            min=ar[0];
            max=ar[1];

        }
        for(int i=2;i<n;i++){
            if(ar[i]>max){
                max=ar[i];
            }
            else if(ar[i]<min){
                min=ar[i];

            }

        }
        return new int[]{max,min};
    }
    public static void main(String[] args){
int ar[]={4,9,7,1,2,3,0,-1};
int size=8;
int[] minmax=minMax(ar, size);
System.out.println("minimum of array is: "+minmax[1]);
System.out.println("maximum of array is: "+minmax[0]);
System.out.println(ar.length);
    }
}