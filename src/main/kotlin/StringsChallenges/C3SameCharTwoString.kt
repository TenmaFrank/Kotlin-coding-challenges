package StringsChallenges

class C3SameCharTwoString {
    //Write a function that accepts two String parameters, and returns true if they contain the
    //same characters in any order taking into account letter case.
    //-----------------------------------usecase-------------------------------------\\
    //• The strings “abca” and “abca” should return true.
    //• The strings “abc” and “cba” should return true.
    //• The strings “ a1 b2 ” and “b1 a2” should return true.
    //• The strings “abc” and “abca” should return false.
    //• The strings “abc” and “Abc” should return false.
    //• The strings “abc” and “cbAa” should return false.

    fun containsTheSameChar(word1: String, word2: String): Boolean{
        // in this aproach i notice that the words should be the same size and case sensitive
        // this os O(n) because check the length before
        // if the words dont have the same size automaticlly return false
        if (word1.length != word2.length) return false
        // then i sorted the words
        val word1s = word1.toSortedSet().sorted()
        val word2s = word2.toSortedSet().sorted()

        // then only compared the sorted words, the compartation is case sensitive by default
        return word1s == word2s
    }

    fun challenge3a(string1: String, string2: String): Boolean {
        //the book proposes to save the second string in a builder to
        //find the string1 character in the string and save its index

        val checkString = StringBuilder(string2)

        for (letter in string1) {
            //iterates over every character in string1 and checks if that character is in the string2 builder
            val index = checkString.indexOf(letter.toString())
            //if the letter is not found the default value will be -1
            if (index != -1) {
                //delets the letter from de string2 build if it's founded
                checkString.deleteCharAt(index)
            } else {
                // if some time the index is -1 means the strings dont have the same letters
                // automatically returns false
                return false
            }
        }
        //if the string2 build is empty means the strings have the same latter
        //because they were deleted if the letter of string1 was founded in the string2
        return checkString.isEmpty()
    }

    fun challenge3b(string1: String, string2: String): Boolean {
        //in this aproach the only need to sort and compare
        // this is O(nlogn)
        return string1.toList().sorted() == string2.toList().sorted()
    }
}