import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.*;
class GuessingGame
{

	public void GuessingNumber()
			{
			try{

			int user_input=0,guesses=0;
			Random randomNumbers = new Random();
			int int_random = randomNumbers.nextInt(100)*1;
			System.out.println(int_random);
			while(user_input!=int_random)
			{
			 String  input = JOptionPane.showInputDialog("Enter Number For The Guess ");
			 int usersAnswer = Integer.parseInt(input);

			 guesses=guesses+1;


             if(usersAnswer==JOptionPane.CANCEL_OPTION)
             {
				 System.exit(0);
			 }

			 if(usersAnswer==int_random)
			 {

				 JOptionPane.showMessageDialog(null, "Congrats,You Guessed it Right!"+ " You Guessed Number in "+guesses+" Guesses");


			 }
			 else if(int_random>usersAnswer)
			 {
				  JOptionPane.showMessageDialog(null, "Soryyy,you Guessed it Wrong!,Enter greater Number");
			 }
			 else
			    JOptionPane.showMessageDialog(null, "Soryyy,you Guessed it Wrong!,Enter Smaller Number");

		    }
		}catch(Exception e)
		{

			//JOptionPane.showMessageDialog(null, "Empty!....");

		}
  }
	public static void main(String args[])
	{

        GuessingGame game= new GuessingGame();


        game.GuessingNumber();

	}
}