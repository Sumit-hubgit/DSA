package heap;

import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {

        int[]arr={5,4,3,2,1};
        int k=1;
        PriorityQueue<Integer>priorityQueue=new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            priorityQueue.add(arr[i]);
            if(priorityQueue.size()>k){
                priorityQueue.remove();
            }
        }
        System.out.println(priorityQueue.peek());
    }
}
