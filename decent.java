// game loop
 while (true) {
          int highestMountain = 0;
          int targetMountain = 0;
    
     for (int i = 0; i < 8; i++) {
         int mountainH = in.nextInt(); // represents the height of one mountain.
        
            if (highestMountain < mountainH){
             highestMountain = mountainH;
             targetMountain = i;
             
        }
     }
        
     // Write an action using System.out.println()
     // To debug: System.err.println("Debug messages...");

    System.out.println(targetMountain); // The index of the mountain to fire on.
 
 }