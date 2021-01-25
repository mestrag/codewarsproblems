package Practise;

import java.util.LinkedList;
import java.util.Queue;

public class CircularQueuePractise {
    public static void main(String[] args) {
        int [] arr = {1,3,4,45,6,7};
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i <arr.length ; i++) {
            queue.add(arr[i]);
        }
        while(queue.size()>0){
            System.out.println(queue.peek());
            queue.remove();
        }




    }
}
