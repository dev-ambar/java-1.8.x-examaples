package com.example.bank;


import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/***
 * We need to find the top N frequently occurring words in a given text file.
 * This is a common problem in text analysis, where we often need to analyze large bodies of text (e.g., logs, articles, books) and determine the most frequently occurring words.
 */
public class TopNWordsFinder {

    public static void main(String[] args) {

          String filePath = "input.txt";
          int frequency = 5;

        Map<String,Integer> wordsCountMap = readInputFile(filePath);
        if(wordsCountMap!=null)
        {
            System.out.println("words with frequency in files");
            wordsCountMap.entrySet().stream().forEach(System.out::println);
        }
        Map<Character, Integer> characterCountMap = readCharacterOccurrence(wordsCountMap);

        System.out.println("total number of Alphabets count in file ");
         characterCountMap.entrySet().forEach(System.out::println);

        List<Map.Entry<String, Integer>> topNWords = findTopNWords(wordsCountMap, frequency);

        System.out.println("Top " + frequency+ " most frequent words:");
        for (Map.Entry<String, Integer> entry : topNWords) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }



    }

    // Method to find the top N frequent words from the word count map
    public static List<Map.Entry<String, Integer>> findTopNWords(Map<String, Integer> wordCountMap, int n) {
        return wordCountMap.entrySet()
                .stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))  // Sort by value in descending order
                .limit(n)  // Limit to top N
                .collect(Collectors.toList());
    }



    private static Map<Character, Integer> readCharacterOccurrence(Map<String, Integer> wordsCountMap) {

        Map<Character, Integer> characterCountMap = new HashMap<>();
         Set<String> words =  wordsCountMap.keySet();
           for(String word : words)
           {
                for(int i = 0 ; i < word.length() ; i++)
                {
                     if(characterCountMap.getOrDefault(word.charAt(i),null)!=null)
                     {
                          characterCountMap.put(word.charAt(i),characterCountMap.get(word.charAt(i))+1);
                     }
                     else
                     {
                         characterCountMap.put(word.charAt(i),1);
                     }
                }
           }
           return characterCountMap;
    }

    private static Map<String, Integer> readInputFile(String filePath) {
           
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try  {
              fileReader = new FileReader(filePath);
              bufferedReader = new BufferedReader(fileReader) ;
                String line ;
                Map<String,Integer> wordsCountMap = new HashMap<>();
                while((line = bufferedReader.readLine())!=null)
                {
                     //String [] words = line.split(" ");
                    String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");

                    for(String word : words)
                    {
                        if(wordsCountMap.getOrDefault(word,null) != null)
                        {
                            wordsCountMap.put(word,wordsCountMap.get(word)+1);
                        }
                        else
                            wordsCountMap.put(word,1);
                    }

                    return wordsCountMap;
                }
            

        }  catch (Exception e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        finally
        {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                
                System.out.println("Error closing the resource: " + e.getMessage());
            }
            
        }

        return null;
    }
}
