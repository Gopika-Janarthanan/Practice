package DSA;
import java.lang.StringBuffer;
import java.util.Arrays;
public class Array {

    static int missingNumber(int[] n) {
       int c = 0;
       int s = 0;
       for (int i = 0; i < n.length; i++) {
           c += i + 1;
           s += n[i];
       }
       return c - s;
   }
    String mergeAlternately(String w1, String w2) {
       int len = Math.max(w1.length(), w2.length());
            int i = 0;
            StringBuffer s = new StringBuffer();
            while (i < len) {
                if(i<w1.length()){
                    s.append(w1.charAt(i));
                }
               if(i<w2.length()) {
                   s.append(w2.charAt(i));
               }
                i++;
            }
            return s.toString();
        }
    int maximum(int [] arr){
       int max=0,i=0;
       while(i<arr.length-1){
           if (arr[i]<arr[i+1]){
               max=arr[i+1];
           }
           i++;
       }
       return max ;
        }
    int secondlarge (int[] arr){
       int i=0,sec=0,lar=0;
       while(i<arr.length){
           if (arr[i]>lar){
               sec=lar;
               lar=arr[i];
           }
           if(arr[i]<lar && arr[i]>=sec){
               sec = arr[i];
           }
           i++;

       }
       return sec;
}
    static String reversestrsb (String word){
       StringBuilder s = new StringBuilder(word);
       return s.reverse().toString();
}
    String reverewhile(String word){
       int i=0;
       int len= word.length();
       char[] charar= new char[word.length()];
       while(i<len-1){
           charar[i] =word.charAt(len-1);
           i++;
           len --;
       }
       return new String (charar);
}
    String leftrotate(int[] arr){
    //[1,2,3,4,12]
    int temp=arr[0];
    for (int i =1; i < arr.length; i++) {
        arr[i-1]=arr[i];
    }
    arr[arr.length-1]=temp;

    return Arrays.toString(arr) ;
}
    String leftdarr(int[] array,int d){
        d= d % array.length ;
        int[]first= new int[d-array.length];
        int[] second=new int[d] ;
        int[] arr=new int[first.length+second.length];
        for (int i = 0; i < d ; i++) {
            first[i] = array[i];
        }
        for (int i = d+1; i < array.length; i++) {
            second[i-1]=array[i];
        }


        for (int i = 0; i < first.length; i++) {
            arr[i]=first[i];
        }
        for (int i = first.length; i < array.length; i++) {
            int j=0;
            arr[i]=second[j];
            j++;

        }
       return Arrays.toString(arr);
    }

}