import java.util.Scanner;

class NumberGame{
    public int produce(int maximum,int minimum){
        return (int) (Math.random()*(maximum - minimum + 1) + minimum);
    }
}
class Real
 {

    public static void main(String[] args)
     {
        Scanner obj = new Scanner(System.in);
        NumberGame n = new NumberGame();
        int totchn = 0;
        int w = 0;

        while (true) {
            System.out.println("Enter the maximum number to play further");
            int maximum = obj.nextInt();
            System.out.println("Enter the minimum number to play further");
            int minimum = obj.nextInt();
            obj.nextLine();

            int cn = n.produce(maximum, minimum);
            int atmpts = 0;

            while (true) {
                System.out.println("Guess a number between "+maximum+" and "+minimum);
                int gn = obj.nextInt();
                atmpts++;

                if (gn > cn) {
                    System.out.println("Too High");
                } else if (gn < cn){
                    System.out.println("Too Low");
                }else{
                    System.out.println("Correct Guess");
                    w++;
                    break;
                }
            }
            totchn += atmpts;
            System.out.println("Total Attempts = " + atmpts);
            System.out.println("Wins = " + w);

            double wr = (double) w / totchn*100;
            System.out.printf("Winrate is %.2f%%\n",wr);

            System.out.println("Wanna play again? (yes or no)");
            String Repeatplay = obj.next();
            if(!Repeatplay.equalsIgnoreCase("yes")){
                obj.close();
                System.exit(0);
            }
            obj.nextLine();
        }
    }
}