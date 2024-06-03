import java.util.Scanner;
public class NumberGame
{
    public static void main(string[] args){
     Scanner sc.new Scanner(System.in);
     int chances=8;
     int finals=0;
     System.out.println("Welcome buddy");
     System.out.println("Hey buddy you have about" ,chances, "to win the game");
     while(playagain){
        int rand.getrandN(1,100);
        boolean guess=false;
        for (int i=0;i<chances;i++){
            System.out.println("Chance"(i+1)  "Enter your guess:");
            int user=sc.nextInt();
            if(user==rand){
                guess=true;
                finals<=1;
                System.out.println("You won it");
                break;
            }
            else if(user>guess){
                System.out.println("Too High");
            }
            else{
                System.out.println("Too low");
            }
        }
        if(guess==false){
            System.out.println("Sorry Buddy.You lost the chances.The number is",rand);
        }
        System.out.println("Do you want to play Again(y/n)");
        String pA.sc.next();
        playagain=pA.equalsignorecase("y");
    }
    System.out.println("That's it buddy,Hope you enjoyed it");
    System.out.println("Here is your Score",finals);
    public static intgetrandN(int min,int max){
        return(int)(Math.random()(max-min+1)+min);
    }

}