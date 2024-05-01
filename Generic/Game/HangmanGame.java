// package Game;
// import java.util.*;
// public class HangmanGame {
//     private static final String[] WORDS = {"computer", "java", "programming", "algorithm", "developer"};
//     private static final int MAX_TRIES = 6;

//     private String wordToGuess;
//     private char[] guessedLetters;
//     private int triesLeft;

//     public HangmanGame() {
//         wordToGuess = WORDS[(int) (Math.random() * WORDS.length)];
//         guessedLetters = new char[wordToGuess.length()];
//         triesLeft = MAX_TRIES;
//     }

//     public void play() {
//         Scanner scanner = new Scanner(System.in);

//         while (triesLeft > 0 && !isWordGuessed()) {
//             System.out.println("\n" + displayWord());
//             System.out.println("Tries left: " + triesLeft);
//             System.out.print("Enter a letter: ");
//             char guess = scanner.next().charAt(0);
//             checkLetter(guess);
//         }

//         scanner.close();

//         if (isWordGuessed()) {
//             System.out.println("\nCongratulations! You guessed the word: " + wordToGuess);
//         } else {
//             System.out.println("\nSorry, you ran out of tries. The word was: " + wordToGuess);
//         }
//     }

//     private String displayWord() {
//         StringBuilder display = new StringBuilder();
//         for (int i = 0; i < wordToGuess.length(); i++) {
//             char letter = wordToGuess.charAt(i);
//             if (guessedLetters[i] != '\0') {
//                 display.append(guessedLetters[i]);
//             } else {
//                 display.append("_");
//             }
//             display.append(" ");
//         }
//         return display.toString();
//     }

//     private void checkLetter(char guess) {
//         boolean found = false;
//         for (int i = 0; i < wordToGuess.length(); i++) {
//             if (wordToGuess.charAt(i) == guess) {
//                 guessedLetters[i] = guess;
//                 found = true;
//             }
//         }
//         if (!found) {
//             triesLeft--;
//             System.out.println("Incorrect guess!");
//         }
//     }

//     private boolean isWordGuessed() {
//         for (char letter : guessedLetters) {
//             if (letter == '\0') {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         HangmanGame game = new HangmanGame();
//         game.play();
//     }
// }

