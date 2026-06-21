public class ProcessStringWithSpecialCharacter {
    public static void main(String[] args) {
        String s="cd%#*#";
        StringBuilder rev = new StringBuilder();
        StringBuilder sb =  new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            int val  = ch;
            if(val>=97 && val<=122){
                sb.append(ch);
                rev.insert(0,ch);
            }
            else if(ch=='*'){
                int n1 = sb.length();
                int n2 = rev.length();
                if(n1>0){
                    String t = sb.substring(0,n1-1);
                    sb = new StringBuilder(t);
                    rev = new StringBuilder(rev.substring(0,n2-1));
                }
            }
            else if(ch=='#'){
                sb.append(sb);
                rev.append(rev);
            }
            else{
//                StringBuilder temp = reverse(sb);
//                sb = temp;
                sb = rev;
            }
        }
        System.out.println(sb);
    }

    public static StringBuilder reverse(StringBuilder str){
        int i = str.length()-1;
        StringBuilder temp = new StringBuilder();
        while(i>=0){
            temp.append(str.charAt(i));
            i--;
        }
        return temp;
    }
}
