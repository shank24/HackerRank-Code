package learning.collections.Set;

import java.util.Random;

public
class RandomDemo {
    public static
    void main (String[] args) {
        Random random = new Random ( );
        int    i      = random.nextInt ( );

        System.out.println (i );
        int y = random.nextInt (100);
        System.out.println (y );

    }
}
