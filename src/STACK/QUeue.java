package STACK;

import java.util.LinkedList;
import java.util.Queue;

public class QUeue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(2);
//        queue.poll();
//        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }
}
