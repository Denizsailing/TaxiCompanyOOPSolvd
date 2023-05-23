package org.example;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordCounter {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\deniz\\OneDrive\\Masaüstü\\uniquewords.txt";

        String outputFilePath = "C:\\Users\\deniz\\OneDrive\\Masaüstü\\uniquewords.txt";

        try {
            //  Read the text from  file
            String text = new String(Files.readAllBytes(Paths.get(inputFilePath)));

            //  Split the text into words
            String[] words = text.split("\\s+");

            // Create a Set to store unique words
            Set<String> uniqueWords = new HashSet<>();

            //  Iterate over words and add them to  set
            for (String word : words) {
                uniqueWords.add(word);
            }

            // Get the count of unique words
            int uniqueWordCount = uniqueWords.size();

            //  Write the result to a file
            String result = String.valueOf(uniqueWordCount);
            Files.write(Paths.get(outputFilePath), result.getBytes());

            System.out.println("Unique word count: " + uniqueWordCount);
            System.out.println("Result written to file: " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
