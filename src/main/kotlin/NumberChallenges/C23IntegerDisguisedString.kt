package NumberChallenges

class C23IntegerDisguisedString {
    // Write a function that accepts a string and returns true if it contains only numbers, i.e. the digits
    //0 through 9.

    //• The input “01010101” should return true.
    //• The input “123456789” should return true.
    //• The letter “9223372036854775808” should return true.
    //• The letter “1.01” should return false; “.” is not a number.

    fun isStr(inpuit: String): Boolean{
        //if it is posible we can use a try catch if the string is not a integer
        //it should return a false by catching the exception of conversion
        var num = 0
        try {
            num = inpuit.toInt()
        } catch (e: Exception){
            return false
        }
        return true
    }

    fun isStr2(input: String): Boolean{
        //another way to see it is comparing every character with the know numbers
        val number = "0123456789"
        for (i in input){
            //if the current character is not on the numbers it return false
            if (!number.contains(i)) return false
        }
        return true
    }
}