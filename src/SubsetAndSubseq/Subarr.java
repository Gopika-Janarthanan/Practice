package SubsetAndSubseq;

public class Subarr {
    public static void main(String[] args) {
        System.out.println(sub("adddiii",'i'));
    }
    static String sub(String str,char c){
        return subarr(str,c,"");
    }
    static String subarr(String str,char c, String newstr){
        if(str.isEmpty()){
            return newstr;
        }
        char ch = str.charAt(0);
        if(ch==c){
            subarr(str.substring(1),c,newstr);
        }
        return subarr(str.substring(1),c,newstr+ch);
    }
}
