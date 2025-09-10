package StringsChallenges

class c11ThreeDiferentLetters {
    //Write a function that accepts two strings, and returns true if they are identical in length but
    //have no more than three different letters, taking case and string order into account.
    //-----------------------------------usecase-------------------------------------\\\
    //• The strings “Clamp” and “Cramp” would return true, because there is one letter
    //difference.
    //• The strings “Clamp” and “Crams” would return true, because there are two letter
    //differences.
    //• The strings “Clamp” and “Grams” would return true, because there are three letter
    //differences.
    //• The strings “Clamp” and “Grans” would return false, because there are four letter
    //differences.
    //• The strings “Clamp” and “Clam” would return false, because they are different lengths.
    //• The strings “clamp” and “maple” should return false. Although they differ by only one
    //letter, the letters that match are in different positions.

    fun diferentLetter(input1: String, input2: String): Boolean{
        if (input1.length != input2.length) return false

        var limit = 4
        for (i in input1.indices){
            if (input1[i]!=input2[i]){
                limit--
            }
            if (limit<=0){
                return false
            }
        }

        return true
    }


}