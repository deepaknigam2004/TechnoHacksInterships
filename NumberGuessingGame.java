import java.util.Scanner;
import java.util.Random;

class Main
{
    public static void main(String[] args)
    {
        play();
    }
    public static void play()
    {
        Scanner sc=new Scanner(System.in);
        Random ra=new Random();
        int computer_no=ra.nextInt(100)+1;
        System.out.println("User only 3 Attempts");
        int user_no;
        int i=0;
        while(i<3)
        {
            System.out.println("Attempt"+(i+1));
            System.out.println("User the number");
            user_no=sc.nextInt();
            User us=new User(user_no);
            i=us.display(computer_no)+i;
            System.out.println();
            if(i==3 && computer_no != user_no)
            {
                System.out.println("Game over");
            }
        }
        
        System.out.println("Computer Value : "+computer_no);
        System.out.println("Playagain Yes or No ");
        String playagain=sc.next();
        if(playagain.equals("Yes"))
        {
            play();
        }
        
        
    }
}
class User{
    private int user_no;
    User(int user_no)
    {
        this.user_no=user_no;
    }
    public int display(int computer_no)
    {
        if(computer_no==user_no)
        {
            System.out.println("Correct guess number");
            System.out.println("You are Winner");
            return 3;
        }
        else if(user_no<computer_no)
        {
            System.out.println("This is low number");
            return 1;
        }
        else
        {
            System.out.println("This is high number");
            return 1;
        }
    }
    
}
