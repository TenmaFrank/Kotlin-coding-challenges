package StringsChallenges

class C2StringPalindrome {
    //Write a function that accepts a String as its only parameter, and returns true if the string
    //reads the same when reversed, ignoring case.

    //-----------------------------------usecase-------------------------------------\\
    //The string “rotator” should return true.
    //The string “Rats live on no evil star” should return true.
    //The string “Never odd or even” should return false; even though the letters are the
    //same in reverse the spaces are in different places.
    //The string “Hello, world” should return false because it reads “dlrow ,olleH”
    //backwards.

    fun isPalindrome(word: String): Boolean{
        // this is O(n)
        var revesed = ""
        // first revese the given word
        for(i in word.length-1 downTo 0){
            // to this solution work need to force to lower case
            revesed += word[i].lowercase()
        }
        //then only need to compare the revesed word with the given
        return revesed == word.lowercase()
    }

    fun chanllenge2(word: String): Boolean{
        //the book recomends use the revesed function
        //its the same thing but wit less code lines
        val loweredWord = word.lowercase()
        return loweredWord == loweredWord.reversed()
    }

}