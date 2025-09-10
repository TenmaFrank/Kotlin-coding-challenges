package StringsChallenges

class C8StringRotated {
    //Write a function that accepts two strings, and returns true if one string is rotation of the other,
    //taking letter case into account.
    //Tip: A string rotation is when you take a string, remove some letters from its end, then append
    //them to the front. For example, “swift” rotated by two characters would be “ftswi”.
    //////-----------------------------------usecase-------------------------------------\\
    //• The string “abcde” and “eabcd” should return true.
    //• The string “abcde” and “cdeab” should return true.
    //• The string “abcde” and “abced” should return false; this is not a string rotation.
    //• The string “abc” and “a” should return false; this is not a string rotation.


    fun isRotated(input1: String, input2: String): Boolean{
        var aux = ' '
        val s = input1.toCharArray()
        val lastChar = input1[input1.length-1]
        val rotatedCharIndex = input2.indexOf(lastChar)
        var timesRotated = 1
        if (rotatedCharIndex != 0){
            timesRotated = (input1.length) - rotatedCharIndex
        }

        while (timesRotated>0){
            for (i in s.size -1  downTo 0){
                if(i == s.size-1){
                    aux = s[i]
                } else {
                    s[i + 1] = s[i]
                }
            }
            s[0] = aux
            timesRotated --
        }

        return s.joinToString("") == input2
    }


    fun challenge8a(input1: String, input2: String): Boolean{
        //yes this is a better solution, if you concat the string is like rotate it
        //keeping the sequence
        if (input1.length != input2.length) return false
        val text = input1 + input1
        return text.contains(input2)
    }
}