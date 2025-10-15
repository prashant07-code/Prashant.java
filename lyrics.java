 public class lyrics {
    public static void main(String[] args) {
        printLyrics();
    }

    public static void printLyrics() {
        String[] lyrics = {
            "Haathon ko sambhale mere haathon mein",
            "Kaise haathon ko sambhale mere haathon mein..",
            "Jab tak neend na aaye, inn lakeeron mein..",
            "Baatein ho......",
            "Haaye"
        };

        double[] delays = {10.0, 8.8, 9.1, 8.4, 9.7};

        for (int i = 0; i < lyrics.length; i++) {
            for (char c : lyrics[i].toCharArray()) {
                System.out.print(c);
                System.out.flush();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

