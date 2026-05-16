package Revision;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n=5;
        int place=1;
        int bin=0;
        while (n>0){
            int rem=n%2;
            bin=bin+place*rem;
            n=n/2;
            place=place*10;
        }
        System.out.println(bin);
//
//        int dec=0;
//        String s = Integer.toString(bin);
//        String ans="";
//        for(int i=0;i<s.length();i++){
//            String ch= Character.toString(s.charAt(i));
//            ans=ans+Integer.toString(Math.pow(2,i)*Integer.parseInt(ch));
//        }
    }
}

//        while (n>0){
//            str+=Integer.toString(n%2);
//            n=n/2;
//        }
//        StringBuffer sf=new StringBuffer(str);
//        System.out.println(sf.reverse());
//        str="";
//        for(int i=0;i<sf.length();i++){
//            str=str+sf.charAt(i);
//        }
//        System.out.println(Integer.parseInt(str));


