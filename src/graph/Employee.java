package graph;

import java.util.TreeSet;

public class Employee {


    public static void main(String[] args) {
        Empl empl1 = new Empl("a",1);
        Empl empl2 = new Empl("b",111);
        Empl emp3 = new Empl("c",0);

        Empl[]arr = {empl1,empl2,emp3};
        TreeSet<Empl>ts = new TreeSet<>();
        ts.add(empl1);
        ts.add(empl2);
        ts.add(emp3);
        System.out.println();

        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i].salary>arr[j].salary){
                    Empl temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}

class Empl{
    String name;
    int salary;

    public Empl(String name,int salary){
        this.name=name;
        this.salary = salary;
    }
}



