package WordFrequency;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String sentence=input.nextLine();
        sentence=sentence.toLowerCase();
        String[] arr=sentence.split(" ");
        HashMap<String,Integer> listOfWords=new HashMap<>();
        for(String word: arr){ // TODO ben input da space enter yapınca  You give empthy character! vermiyo
            if(!word.isEmpty()){
                //If there are characters other than these characters("[^a-zA-Z0-9]") in the word, the value "" is returned.
                word=word.replaceAll("[^a-zA-Z0-9]","");

                // listOfWords.getOrDefault(word,0)+1
                //If the word exists in listOfWord it returns the value of the word, otherwise 0
                listOfWords.put(word,listOfWords.getOrDefault(word,0)+1);

            }else{
                System.out.println("You give empthy character!");
            }

        }
        //Map.Entry<> entry: hashset.entrySet() gives key and value at the same time
        for(Map.Entry<String,Integer> entry : listOfWords.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
