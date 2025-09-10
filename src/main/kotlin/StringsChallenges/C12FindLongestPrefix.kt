package StringsChallenges

class C12FindLongestPrefix {
    //Write a function that accepts a string of words with a similar prefix, separated by spaces, and
    //returns the longest substring that prefixes all words.

    //• The string “swift switch swill swim” should return “swi”.
    //• The string “flip flap flop” should return “fl”.

    fun findLongPrefix(input: String):String{
        //i split the word into an array
        val words = input.split(" ")
        // used the first word as reference
        val st = words.get(0)
        // creat a var to store the prefix
        var prefix = ""


        //iterate over every word
        for(i in 1..<words.size){
            //and every letter in the word
            for (letter in words[i]){
                //first check for the same letters in the reference
                if(st.contains(letter)){
                    //if is the same letter and is not concated yet
                    if (!prefix.contains(letter)){
                        //concat the letter it shaere with the base without duplication
                        prefix += letter
                    }
                }
            }
        }
        //return the result
        return prefix
    }

    fun challenge12(input: String): String {
        //book solution
        //split by soaces
        val parts = input.split(" ")
        if (parts.isEmpty()) return ""

        //uses the first one as a base to compare
        val first = parts.first()
        //two posible prefixes
        var currentPrefix = ""
        var bestPrefix = ""

        //runs over every letter in the base word
        //to compare every letter on the words as a prefix
        for (letter in first) {
            currentPrefix += letter
            for (word in parts) {
                if (!word.startsWith(currentPrefix)) {
                    return bestPrefix
                }
            }
            bestPrefix = currentPrefix
        }
        return bestPrefix
    }
}