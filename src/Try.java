class MyObject implements Cloneable{

    int x;
    int y;

    protected Object clone() throws CloneNotSupportedException{
        return  super.clone();
    }
}

public class Try  {

    public static void main(String[] args) throws CloneNotSupportedException{

         int A=10;
        MyObject obj1 = new MyObject();
        MyObject obj2 = (MyObject) obj1.clone();
        obj2.x=2;
        System.out.println(obj2.x);
    }
}
