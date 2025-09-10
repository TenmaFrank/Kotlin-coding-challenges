package StringsChallenges

class C7CondenseWhitespace {
    //Write a function that returns a string with any consecutive spaces replaced with a single space.
    ////-----------------------------------usecase-------------------------------------\\
    //I’ve marked spaces using “[space]” below for visual purposes:
    //• The string “a[space][space][space]b[space][space][space]c” should return “a[space]b[space]c”.
    //• The string “[space][space][space][space]a” should return “[space]a”.
    //• The string “abc” should return “abc”.

    fun condenseSpaceses(input: String): String{
        //i notice that if there's no space return the string as it is so
        if (!input.contains(" ")) return input
        //the function only should return one space
        // we can use the same approach from deleting the duplicates
        val string = StringBuilder()

        for (i in 0..<input.length){
            // iterate over every letter if the space have another letter to the right
            // save that space
            if (input[i] == ' '){
                if (input[i+1] != ' '){
                    string.append(input[i])
                }
            } else {
                // if the letter is not a space just add it
                string.append(input[i])
            }
        }

        return string.toString()
    }

    fun challenge7(input: String): String{
        // if can use the kotlin functions slip the string by spaces
        //this deletes all spaces then join it using only one
        return input
            .split("\\s+".toRegex())  // split by any whitespace/newline
            .filter { it.isNotEmpty() } // then make a list deleting empty (spaces)
            .joinToString(" ")// finally add them to string using a spaces
    }
}