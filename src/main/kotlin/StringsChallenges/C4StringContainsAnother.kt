package StringsChallenges

class C4StringContainsAnother {
    //Write your own version of the contains() method on String that ignores letter case, and
    //without using the existing contains() method.

    //-----------------------------------usecase-------------------------------------\\
    //•The code "Hello, world".fuzzyContains("Hello") should return true.
    //• The code "Hello, world".fuzzyContains("WORLD") should return true.
    //• The code "Hello, world".fuzzyContains("Goodbye") should return false.

    fun test(string: String, string2: String){
        println(string.containsAnother(string2))
        println(string.fuzzyContainsB(string2))
    }

    fun String.containsAnother(string2: String): Boolean{
        //in this aproach i try to find the first letter of the second word
        //within the string 1. if the letter is not in the string1 its obvious it doesnt contains it

        // firts lowercase both strings since the cases tells us no caseSensitive
        val stringLow = this.lowercase()
        val string2low = string2.lowercase()
        //then find the index of the first letter of the word we're searching
        val index = StringBuilder(stringLow).indexOf(string2low[0])
        var j = 0
        // if index = -1 means the firsts letter of second word is not founded so de word2 is not in the word1
        if (index == -1) return false

        for (i in index ..<this.length){
            if (stringLow[i] != string2low[j]){
                return false
            }
            j++
        }
        return true
    }

    fun String.fuzzyContainsA(other: String): Boolean {
        //the book uses rangeOf, but that is for siwft an kotlin dont have rangeOf like that
        //so basically the book uses contains with other func word
        //here only upercase the words to avoid falses
        return this.uppercase().contains(other.uppercase())
    }

    fun String.fuzzyContainsB(other: String): Boolean {
        //this aproach is more like kotlin solution
        //first uppercase the words to avoid case Sensitive
        val text = this.uppercase()
        val pattern = other.uppercase()
        //if the second word is empty it is containted by default
        if (pattern.isEmpty()) return true
        //if the second word is bigger than the first, the fistst cant contain it
        if (pattern.length > text.length) return false
        // create this bound to ensure iterate just what we need because if a word2 size is 5
        // and the word 1 only have 4 letter remaining its imposible to word2 fits in the remaining letters
        val bound = text.length - pattern.length
        //iterates on the first word to compare form here
        for (i in 0.. bound) {
            var match = true
            //here runs over the second word comparing each letter in the fisrt word form the last index i
            for (j in pattern.indices) {
                //when the compared letter dont match inmediatelly breaks the loop and moves to the next one index of i
                if (text[i + j] != pattern[j]) {
                    match = false
                    break
                }
            }
            // if match var keeps true it stops the loop and returns a true
            if (match) return true
        }
        // return this at the end if nothing happens
        return false
    }

}