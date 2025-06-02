package com.alfredo;

import com.birdbrain.Finch;

public class Test {
    public static void main(String[] arg) {
        Finch bird = new Finch();

        // Move forward for 1 second
        bird.setMove("F", 30, 100);

   // Turn right for 0.5 seconds


   // Move backward for 1 second


   // Turn left for 0.5 seconds



        bird.stop();
        bird.disconnect();
    }
}