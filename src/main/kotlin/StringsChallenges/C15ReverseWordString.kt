package StringsChallenges

class C15ReverseWordString {
    //Write a function that returns a string with each of its words reversed but in the original order,
    //without using a loop.
    //• The string “Swift Coding Challenges” should return “tfiwS gnidoC segnellahC”.
    //• The string “The quick brown fox” should return “ehT kciuq nworb xof”.


    fun challenge15(input: String): String{
        //the book says don't use a loop and its proposal is tu use .reverse
        //firts split the input with the spaces
        val words = input.split(" ")
        //then revers evey word individually
        // map return a list wtith objects
        val reversed = words.map { it.reversed() }
        // then join them again with string
        return reversed.joinToString(" ")
    }

    fun reversedWords(input: String): String{
        //if we cant use the reverse funtion
        //need to iterate the words
        //first separate the words by spaces
        val words = input.split(" ")
        val sb = StringBuilder()
        //iterate for every word in the array of words
        for (word in words){
            //calculate the bound for the current word
            val wLen = word.length - 1
            //itarate for every letter in the word desingding for the last index
            for (i in wLen downTo 0){
                //just append the letter
                sb.append(word[i])
            }
            sb.append(" ")
        }
        //revese the words keeping the words order
        return sb.toString()
    }
}