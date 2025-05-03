package DSA;

public class Sorting {
    static int[] bubblesort(int arr[]){
        for (int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
    static class CyclicSort{
        void missingNumber(int[] arr){
            int i=0;
            while(i<arr.length){
                int c=arr[i];
                if(arr[i] < arr.length&& arr[c]!=arr[i]){
                    swap(arr,c,i);
                }
                else{
                    i++;
                }
            }
            for(int in:arr){
                System.out.print(in+" ");
            }

        }
       void  swap(int[] arr,int f,int l){
            int temp = arr[f];
            arr[f]=arr[l];
            arr[l]=temp;
        }
    }
    }
