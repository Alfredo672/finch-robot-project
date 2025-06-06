package com.alfredo;

import com.birdbrain.Finch;

public static void main(String[] args) {
     Finch myFinch = new Finch();
// Starting movements 
     myFinch.setMove("F", 16,50);
     myFinch.setTurn("R", 90, 50);
     myFinch.setMove("F", 65,50);
// Middle part of the maze
     myFinch.setTurn("L", 90, 50);
     myFinch.setMove("F", 60, 30);
     myFinch.setTurn("L", 90, 50);
     myFinch.setMove("F", 68,50);


//turning into the long stretch of the maze
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