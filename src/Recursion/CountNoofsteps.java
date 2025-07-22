package Recursion;

public class CountNoofsteps {
    public static void main(String[] args) {
        CountNoofsteps c= new CountNoofsteps();
        System.out.println(c.numberOfSteps(41));
    }
        public int numberOfSteps(int num) {
            return no(num,0);
        }
        int no(int n,int s){
            if(n==0){
                return s;
            }
            if(n%2==0){
                n=n/2;
                s=s+1;
            }
            else{
                n=n-1;
                s=s+1;
            }
            return no(n,s);
        }}

