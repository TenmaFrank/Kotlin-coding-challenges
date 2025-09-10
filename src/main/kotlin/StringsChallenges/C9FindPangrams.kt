package StringsChallenges

class C9FindPangrams {
    // Write a function that returns true if it is given a string that is an English pangram, ignoring
    //letter case. Tip: A pangram is a string that contains every letter of the alphabet at least once.

    //-----------------------------------usecase-------------------------------------\\
    //• The string “The quick brown fox jumps over the lazy dog” should return true.
    //• The string “The quick brown fox jumped over the lazy dog” should return false,
    //because it’s missing the S.


    fun isPangram(text: String): Boolean{
        //for this mu first tough was search in for loop for every letter
        if(text.length<26) return false //if the text is less than 26 it cant fit the whole alphabet
        val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ .,"//english alphabet
        val textEd = text.uppercase()

        //i iterate over every letter of the alphabet and search for it in the given input
        for (letter in alphabet){
            //when an alphebet letter isnt found automatically return false
            if (!textEd.contains(letter)) {
                return false
            }
        }
        // finished without passing over the if
        return true
    }

    fun challenge9a(input: String): Boolean {
        // the book says create a set or array with the given input
        val set = input.lowercase().toSet()
        //then just filter to delete duplicates a to z
        val letters = set.filter { it in 'a'..'z' }
        //if the result of filter duplicates equals to 26 means that it contains the whole alphabet
        return letters.size == 26
    }

}