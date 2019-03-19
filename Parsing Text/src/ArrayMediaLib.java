public class ArrayMediaLib
{
    public static void main(String[] args)
    {
        String [] sharingFriends = {"Jamal",
                "Emily",
                "Destiny",
                "Mateo",
                "Sofia"
        };

        for (int i = 0; i < sharingFriends.length; i++)
        {
            System.out.println(sharingFriends[i]);
        }

        int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};

        int total = 0;
        double average;
        for (int val : daysBtwnPurchase)
        {
            total = total + val;
        }
        average = total / daysBtwnPurchase.length;
        System.out.println("Average Days Between Purchase: " + average);

        Song[] topTenSongs = {new Song("The Twist"),
                              new Song("Smooth"),
                              new Song("Mack the Knife"),
                              new Song("How Do I Live"),
                              new Song("Party Rock Anthem"),
                              new Song("I gotta Feeling"),
                              new Song("Macarena"),
                              new Song("Physical"),
                              new Song("You Light Up My Life"),
                              new Song("Hey Jude"),
        };

        for (Song s: topTenSongs)
        {
            System.out.println(s.getTitle());
        }

        // change the array
//        System.out.println("-BEFORE--");
//        for (Song changeSong : topTenSongs) {
//            changeSong.setTitle("test");
//        }
// show the array
//        System.out.println("-AFTER--");
//       for (Song showSong : topTenSongs) {
//            System.out.println(showSong.getTitle());
//        }
        int count = 0;
        for (Song s : topTenSongs) {
            if(count % 3 == 0) {
                s.setPrice(.99);
                System.out.println(s.getTitle() + " Price: " + s.getPrice());
            }
            else {
                s.setPrice(1.29);
                System.out.println(s.getTitle() + " Price: " + s.getPrice());
            }
            count++;
        }
    }

}
