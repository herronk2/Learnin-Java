package week3;

// Create a Word class with a static method called allDone

public class Word {
    
    public static boolean allDone(String word, String guess){
        int count = 0;

        for(int i=0; i <= guess.length() -1; i++){

            for(int j=0; j <= word.length() -1; j++ ){

                if(word.charAt(j) == guess.charAt(i)){
                    count += 1;
                }
            }
        }

        if(count == word.length() - 1){
            return true;
        }
 
        else{
            return false;
        }
    }

    public static String showLetter(String word, char guess){
        String total = "";
        
        for(int i=0; i < word.length(); i++){

            if(word.charAt(i) == guess){
                total += word.charAt(i);
            }

            else{
                total += "_";
            }
        }

        return total;
    }

    public static String showLetters(String word, String Guesses){
        
    }
}