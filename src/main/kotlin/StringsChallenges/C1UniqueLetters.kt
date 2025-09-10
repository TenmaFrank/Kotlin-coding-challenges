package StringsChallenges

class C1UniqueLetters {

    //Write a function that accepts a String as its only parameter, and returns true if the string has
    //only unique letters, taking letter case into account.

    //The string “No duplicates” should return true.
    //The string “AaBbCc” should return true because the challenge is case-sensitive.
    //The string “Hello, world” should return false because of the double Ls and double Os.

    fun uniqueLetters(input: String): Boolean{
        //greedy algorithm aproach O(n^2)
        var repChar = true
        //iterates through array
        for (i in input){
            //for every character iterates again to compare the current character [i]
            //with the rest of the characters
            for (j in 1..<input.length){
                if (i == input[j]){
                    //if it finds a equal character even if its only one
                    repChar = false
                }
            }
        }
        return repChar
    }


    fun challenge1a(input: String): Boolean {
        //better version with O(n)
        //creates a list of characters were we only add the iterated position
        val usedLetters = mutableListOf<Char>()

        //iterates the characters
        for (letter in input) {
            //checks if the chararacter has passed before meaning it is repeated
            if (usedLetters.contains(letter)) {
                return false
            }
            //saves the character in the usedletter list
            usedLetters.add(letter)
        }
        return true
    }

}