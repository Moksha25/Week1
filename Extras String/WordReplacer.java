import java.util.Scanner;

public class WordReplacer 
{
    
    // Method to replace a given word with another word in a sentence
    public static String replaceWord(String input, String oldWord, String newWord) 
	{
        return input.replaceAll(oldWord, newWord);
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Accept input sentence and words from the user
        System.out.print("Enter the sentence: ");
        String input = sc.nextLine();

        System.out.print("Enter the word to be replaced: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter the new word: ");
        String newWord = sc.nextLine();

        // Replace the old word with the new word
        String updatedSentence = replaceWord(input, oldWord, newWord);

        // Output the updated sentence
        System.out.println("Updated sentence: " + updatedSentence);

        sc.close();
    }
}
