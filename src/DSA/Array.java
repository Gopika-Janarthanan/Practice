package DSA;

public class Array {

   static int missingNumber(int[] n) {
        int c=0;
        int s=0;
        for (int i=0;i<n.length;i++){
            c+=i+1;
            s+=n[i];
        }
        return c-s;
    }
}
