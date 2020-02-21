package learning.collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public
class PriorityQueueDemo {
    public static
    void main (String[] args) {

        Queue<Integer> pq = new PriorityQueue <> ();

        System.out.println (pq.peek () );
        //System.out.println (pq.element () );

        for (int i = 0; i <20 ; i++) {
            pq.offer ( i );
        }
        System.out.println (pq );

        System.out.println (pq.poll () );

        System.out.println (pq.remove () );

        System.out.println (pq );

    }

}
