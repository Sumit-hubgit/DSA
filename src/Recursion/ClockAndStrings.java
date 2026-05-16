package Recursion;
import  java.util.Scanner;
public class ClockAndStrings {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int testcase = inp.nextInt();

        for(int i=0;i<testcase;i++){

            int a1=inp.nextInt();

            int b1=inp.nextInt();


            int a2=inp.nextInt();

            int b2=inp.nextInt();

            if(b1>a1){
                int temp=a1;
                a1=b1;
                b1=temp;
            }

            if(b2>a2){
                int temp=a2;
                a2=b2;
                b2=temp;
            }
            if(a1<a2 && b1>b2){
                System.out.println("No");
            }
            else if(a1>a2 && b1>b2){
                System.out.println("No");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
