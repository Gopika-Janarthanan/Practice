import java.util.*;
public class JavaPractice {
    static void main(String[] args) {
       // System.out.println(palindrome("HELLOLLEH"));
       // hash("banana");
        hashmap("java is easy and java lolo bolo is powerful");
    }
    static boolean palindrome(String str){
        int e =str.length()-1,s=0;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
            return false;
        }
        e--;
        s++;}
        return true;
    }
    static void dup(String s){
        for(int i=0;i<s.length();i++){

        }
    }
    static void hash(String s) {
            HashMap<Character, Integer> map = new HashMap<>();

            for(char ch : s.toCharArray()){
                if(map.containsKey(ch)){
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }

            for(Map.Entry<Character, Integer> e : map.entrySet()){
                System.out.println(e.getKey() + " -> " + e.getValue());
            }
        }
        static void hashmap(String s){
        String[] str = s.split(" ");
        HashMap<String,Integer> h = new HashMap<>();
        for(String e : str){
            if( h.containsKey(e)){
                h.put(e,h.get(e)+1);
            }
            else{
            h.put(e,1);
            }
        }
        for(Map.Entry<String,Integer> e : h.entrySet()){
            System.out.println(e.getKey() + e.getValue());
        }
        }


}
