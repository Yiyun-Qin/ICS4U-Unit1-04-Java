import java.util.Scanner;
/**
 * The HelloWorld program implements an application that
 * simply displays energy released question to the standard output.
 *
 * @author  Yiyun Qin
 * @version 1.0
 * @since   2022-11-05
 */

class Guess {
  public static void main(String[] args) {
    int insertNumber = -1;
    int turn = 0;
    String insertString;
    Scanner myobj = new Scanner(System.in);
    final double random;
    final int randomNumber;

    random = Math.floor(Math.random() * 6) + 1;
    randomNumber = (int) Math.round(random);
    for (int loopCounter = 0; loopCounter < loopCounter + 1; loopCounter++) {
      System.out.print("Insert your guessed number between 1 and 6: ");
      insertString = myobj.next();
      try {
        insertNumber = Integer.parseInt(insertString);
        if (insertNumber < 1 || insertNumber > 6) {
          System.out.println("This number is not between 1 to 6.");
        } else {
          if (insertNumber > randomNumber) {
            System.out.println("You guessed too big.");
          } else if (insertNumber < randomNumber) {
            System.out.println("You guessed too small.");
          } else {
            break;
          }
        }
      } catch (Exception e) {
        System.out.println("Invalid number!");
      } finally {
        turn = loopCounter + 1;
      }
      System.out.println("Please try again.\n");
    }
    System.out.println("Your guess is right! The correct answer is "
                    + randomNumber);
    System.out.println("It takes you " + turn + " turns to guess right.");
    System.out.println("\nDone.");
  }
}
