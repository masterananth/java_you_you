import java.util.Scanner;
/**
 * NumberGame
 */
public class NumberGame
{    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chances=8;
        int finals=0;
        boolean playAgain=true;
        System.out.println("welcome buddy!");
        System.out.println("Hey buddy you have about"+chances+"to win the game");
        while(playAgain){
            int rand=getrandN(1,100);
            boolean guess=false;
            for(int i=0;i<chances;i++){
                System.out.println("Chance"+(i+1)+ "Enter your guess:");
                int user=sc.nextInt();
                if(user==rand){
                    guess=true;
                    finals+=1;
                    System.out.println("you won it.");
                    break;
                }
                else if (user>rand){
                    System.out.println("Too high");
                }
                else{
                    System.out.println("Too Low");
                }
           }
           if(guess==false){
                 System.out.println("Sorry Buddy .you lost chances.The number is "+rand);
           }
           System.out.println("Do you to play Again(y/n)");
           String PA=sc.next();
           playAgain=PA.equalsIgnoreCase("y");
        }
        System.out.println("That's it Buddy ,Hope you enjoyed it");
        System.out.println("here is your Score"+finals);
    }
        public static int getrandN(int min,int max){
            return (int) (Math.random()*(max-min+1)+min);
        }
    
}