import java.util.ArrayList;
import java.util.LinkedList;

public  final class Slide  {

    int a;

    public static void main(String[] args) {


        Slide s = new Slide();
        s.a=10;
        s=null;

        Slide sl = new Slide();
        s=sl;
        sl=s;
        System.out.println(sl.a);

//        String a=new String("Kunal");
//        String b="Kunal";
//        System.out.println(a==b);
//        System.out.println(a.equals(b));


        ArrayList<Integer>list=new ArrayList<>();
        LinkedList<?>list1=new LinkedList<>();
    }

}


//class  ABC  extends Slide{
//
//}

