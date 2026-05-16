package contest;

public class CONTEST {

    public static void main(String[] args) {
//        int a=65;
//        char c=(char)a;
//        System.out.println(c);

        StringBuilder sb = new StringBuilder();
        sb.append("a");
        int k=5,i=0;
        while(sb.length()<=k){
            char c = (char)(sb.charAt(i)+1);
            sb.append(c);
            i++;
        }
        System.out.println(sb);
    }
}
