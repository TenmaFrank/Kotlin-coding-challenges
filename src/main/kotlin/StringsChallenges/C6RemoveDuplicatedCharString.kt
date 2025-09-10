package StringsChallenges

class C6RemoveDuplicatedCharString {
    //Write a function that accepts a string as its input, and returns the same string just with
    //duplicate letters removed.
    //Tip: If you can solve this challenge without a for-in loop, you can consider it “tricky”
    //rather than “easy”.
    //-----------------------------------usecase-------------------------------------\\
    //• The string “wombat” should print “wombat”.
    //• The string “hello” should print “helo”.
    //• The string “Mississippi” should print “Misp”.

    fun removeDuplicatedCharsI(text: String): String{
        //create a stringbuilder to creat the new string without the duplicates
        val string = StringBuilder()
        //run over every letter on text
        for (i in text){
            // if our new string not contains the current letter(I) add to de string
            // if the letter is already in the new string means that is a duplicated thats why it skips it
            if (!string.contains(i)){
                string.append(i)
            }
        }
        //return de new string where the duplicates were skiped
        return string.toString()
    }


    fun challenge6a(input: String): String {
        //here the book proposal
        // most of the same iterates trough every letter
        val seen = mutableSetOf<Char>()   // keeps track of already added characters
        val result = StringBuilder()

        for (c in input) {
            if (seen.add(c)) {            // add() returns false if already present
                result.append(c)
            }
        }

        return result.toString()
    }

    fun challenge6bl(input: String): String {
        //to use kotlin functions
        return input.toList() //returns a list of characteres
            .distinct()       // removes duplicates, preserves order
            .joinToString("") // joins back into a single string
    }
}