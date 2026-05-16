package STACK;

import java.util.HashSet;
import java.util.Set;

public class SEt {

    public static void main(String[] args) {
//        Set<Integer>set=new HashSet<>();

        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<5;i++){
            set.add(i);
        }
        set.add(1);

        System.out.println(set);
    }
}
