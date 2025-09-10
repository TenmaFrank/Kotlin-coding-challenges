package StringsChallenges

class C13RunLengthEncoding {
    //Write a function that accepts a string as input, then returns how often each letter is repeated in
    //a single run, taking case into account.
    //Tip: This approach is used in a simple lossless compression technique called run-length
    //encoding.
    /*
    • The string “aabbcc” should return “a2b2c2”.
    • The strings “aaabaaabaaa” should return “a3b1a3b1a3”
    • The string “aaAAaa” should return “a2A2a2”
     */

    fun howManyLetters(input: String): String{
        //considering the letters are always grouped and separated for a diferent letter
        //i just compare with the current letter with the left of it
        // sb storage te resul
        val sb = StringBuilder()
        // the lengh of input
        val n = input.length -1
        //counter will start in 1 because is the quantity of the letter if you have a letter you have 1 of that
        var counte = 1
        //append the first letter to start storing our result
        sb.append(input[0])

        //using indexes for better handle
        for (i in 1 .. n ){
            //if the current letter equals to the previous
            if (input[i] == input[i -1]){
                //the counter will increase that means that you already have one of the first leter
                counte++
            } else {
                //if not means that the letter or gruop of letters changed
                //apped the current counter value, this value is from the matches of previous letter
                sb.append(counte.toString())
                // then appen the next lette
                sb.append(input[i])
                //and restart conter to 1
                counte = 1
            }
        }
        // this append the las counter becuase at the end of the loop dont compute the else statement
        //but it surely do the counter of letter matches
        sb.append(counte)
        return sb.toString()
    }


    fun challenge13a(input: String): String {
        var currentLetter: Char? = null
        var result = StringBuilder()
        var letterCounter = 0

        for (letter in input) {
            if (letter == currentLetter) {
                letterCounter++
            } else {
                currentLetter?.let {
                    result.append("$it$letterCounter")
                }
                currentLetter = letter
                letterCounter = 1
            }
        }

        currentLetter?.let {
            result.append("$it$letterCounter")
        }

        return result.toString()
    }


    fun challenge13b(input: String): String {
        val result = StringBuilder()
        var letterCounter = 0
        val chars = input.toCharArray()

        for (i in chars.indices) {
            letterCounter++
            if (i + 1 == chars.size || chars[i] != chars[i + 1]) {
                result.append("${chars[i]}$letterCounter")
                letterCounter = 0
            }
        }
        return result.toString()
    }

}