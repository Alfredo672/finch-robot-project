package com.alfredo;

import com.birdbrain.Finch;
public class Test {
public static void main(String[] args) {
     Finch myFinch = new Finch();


//starting sound
     myFinch.playNote(60,0.5);
//Getting out of the starting position 
     myFinch.setMove("F", 16,50);
     myFinch.setTurn("R", 90, 50);
     myFinch.setMove("F", 65,50);

     myFinch.playNote(100,0.5);
//mid section
     myFinch.setTurn("L", 90, 50);
     myFinch.setMove("F", 60, 30);
     myFinch.setTurn("L", 90, 50);
     myFinch.setMove("F", 68,50);
//long stretch of the maze
     myFinch.setTurn("R", 92, 50);
     myFinch.setMove("F", 115, 50);
         //final turns until the end
     myFinch.setTurn("R", 90, 50);
     myFinch.setMove("F", 20, 50);
     myFinch.setTurn("L", 90, 50);
     myFinch.setMove("F", 28, 50);
     myFinch.setTurn("L", 90, 50);
     myFinch.setMove("F", 25, 50);


     myFinch.stopAll();
     myFinch.disconnect();
}
}
