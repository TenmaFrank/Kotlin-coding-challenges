package StringsChallenges

class C5CountCharacters {
    // Write a function that accepts a string, and returns how many times a specific character appears,
    //taking case into account.
    //Tip: If you can solve this without using a for-in loop, you can consider it a Tricky
    //challenge.

    //-----------------------------------usecase-------------------------------------\\

    //• The letter “a” appears twice in “The rain in Spain”.
    //• The letter “i” appears four times in “Mississippi”.
    //• The letter “i” appears three times in “Hacking with Swift”.

    fun appearCount(text: String, target: Char): Int{
        //in my approach i thought about using a for loop, but the book says not use it
        // i use a while but basically is the same
        // i is the index to loop
        var i = 0
        //appearences the counter
        var appearences = 0
        //this runs over the string and compares the character with the current
        while (i < text.length){
            if (text[i] == target){
                appearences ++
            }
            i ++
        }
        return appearences
    }

    fun challenge5a(text: String, target: Char): Int{
        // the book says not use for loop and then shows you a for loop solution
        var letterCount = 0
        for (letter in text){
            if (letter == target){
                letterCount ++
            }
        }
        return letterCount
    }

    fun challenge5b(input: String, target: Char): Int {
        //in kotlin .fold is like .reduce swift  but our accumulator(acc) need to be declared
        // c is the char where is runing over
        // basically the same from above
        return input.fold(0) { acc, c ->
            if (c == target) acc + 1 else acc
        }
    }


}