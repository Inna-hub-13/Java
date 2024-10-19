import java.util.*;
import java.io.*;

public class HangmanGame {

    public static void main(String[] args) {

        try{
            File file = new File("words.txt");

            playGame(file);

            System.out.println("File " + file.getName() + " last modified: " + new Date(file.lastModified()));
        }

        catch(FileNotFoundException ex) {

            System.out.println(ex);
        }
    }

    private final static int NUMBER_OF_WORDS = 15;

    public static void printStartMessage() {

        System.out.println("\n\t\t\t\t-|_|-|_|-|_|-|_|-|_|-|_|-|_|-|_|-|_|-");
        System.out.println("\t\t\t\t\t\t\tHangman Game");
        System.out.println("\t\t\t\t_|-|_|-|_|-|_|-|_|-|_|-|_|-|_|-|_|-|_\n");

    }

    public static char getGuessLetter() {

        Scanner input = new Scanner(System.in);
        System.out.print("(Guess) Enter a letter: ");
        return input.next().charAt(0);
    }

    public static boolean isLetterGuessed
            (String guessWord, char guessLetter, ArrayList<Character> guessLetters) {

        for (int i = 0; i < guessWord.length(); i++) {
            if (guessWord.charAt(i) == guessLetter) {

                if(!guessLetters.contains(guessLetter)) {

                    guessLetters.add(guessLetter);
                    return true;
                }
                else {
                    System.out.println(guessLetter + " is already in the guess word");
                    return false;
                }
            }
        }

        // if the for loop doesn't return value, then the guessed letter is
        // not part of the <guessWord>
        if(!guessLetters.contains(guessLetter))
            guessLetters.add(guessLetter);
        else
            System.out.println(guessLetter + " is already guessed");

        System.out.println("Wrong guess");
        return false;
    }

    public static void addDashes(char[] playerGuessWord) {

      for(int i = 0; i < playerGuessWord.length; i++)
          playerGuessWord[i] = '_';
    }

    public static void printWordToGuess(char[] playerGuessWord) {

        System.out.println();
        for (char letter : playerGuessWord)
            System.out.print(letter + " ");

        System.out.println();
    }

    public static void addGuessedLetter(String guessWord, char guessLetter, char[] playerGuessWord) {

        for(int i = 0 ; i < guessWord.length(); i++)
            if(guessWord.charAt(i) == guessLetter)
                playerGuessWord[i] = guessLetter;
    }

    public static boolean isGuessed(char[] playerGuessWord) {

        for(char letter: playerGuessWord)
            if(letter == '_')
                return false;

        return true;
    }

    public static char continuePlay(char[] playerGuessWord) {

        Scanner input = new Scanner(System.in);

        printWordToGuess(playerGuessWord);
        System.out.println("Word is guessed!");
        char yesNo;
        do {
            System.out.print("\nDo you want to play again (Y/N)? ");
            yesNo = input.next().charAt(0);
        }while(yesNo != 'Y' && yesNo != 'N');

        System.out.println();
        return yesNo;
    }

    public static String pickWord(File file) throws FileNotFoundException {

        // generates a random number for a word to be picked
        int randomNumber = (int) (Math.random() * NUMBER_OF_WORDS);
        String picked;

        try(Scanner input = new Scanner(file)){

            while(randomNumber > 0) {
                // scans until the picked word is found
                input.next();
                randomNumber--;
            }
            picked = input.next();
        }

        return picked;
    }

    public static void playGame(File file) throws FileNotFoundException {

        printStartMessage();

        String guessWord;
        char[] playerGuessWord;
        char yesNo, guessLetter;

        while(true){

            guessWord = pickWord(file);
            playerGuessWord = new char[guessWord.length()];
            addDashes(playerGuessWord);
            ArrayList<Character> guessedLetters = new ArrayList<>();

            while(!isGuessed(playerGuessWord)){

                printWordToGuess(playerGuessWord);
                guessLetter = getGuessLetter();
                if(isLetterGuessed(guessWord, guessLetter, guessedLetters))
                    addGuessedLetter(guessWord, guessLetter, playerGuessWord);

            }

            yesNo = continuePlay(playerGuessWord);

            if(yesNo == 'N')
                return;

        }

    }
}
