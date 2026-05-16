package Revision;

public class ReverseAString {

    public static void main(String[] args) {

        String str= "abaa";
        int i=0,j=str.length()-1;
        int count=0;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                count++;
            }
            i++;
            j--;
        }
        System.out.println(count);
        if(count==str.length()/2){
            System.out.println("Palindrome");
        }

    }
}
