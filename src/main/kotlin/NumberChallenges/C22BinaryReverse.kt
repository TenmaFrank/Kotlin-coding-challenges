package NumberChallenges

class C22BinaryReverse {
    //Create a function that accepts an unsigned 8-bit integer and returns its binary reverse, padded
    //so that it holds precisely eight binary digits.
    //Tip: When you get the binary representation of a number, Swift will always use as few bits as
    //possible – make sure you pad to eight binary digits before reversing.

    //• The number 32 is 100000 in binary, and padded to eight binary digits that’s 00100000.
    //Reversing that binary sequence gives 00000100, which is 4. So, when given the input
    //32 your function should return 4.
    //• The number 41 is 101001 in binary, and padded to eight binary digits that 00101001.
    //Reversing that binary sequence gives 10010100, which is 148. So, when given the
    //input 41 your function should return 148.
    //• It should go without saying that your function should be symmetrical: when fed 4 it
    //should return 32, and when fed 148 it should return 41.

    fun reverseBinary(num: Int): Int{
        //convert the given number to binary
        val numB =  num.toString(2)
        //calculate how many 0 need to complete 8 bits
        val digLeft = 8 - numB.length
        val sb = StringBuilder()
        val result = StringBuilder()
        // fill the string with the remaining 0
        for (i in 0 ..< digLeft){
            //always from the front
            sb.append("0")
        }
        //just apend the rest of the converted number
        sb.append(numB)

        //revese it it also can use the .revesed() function
        for (i in sb.length-1 downTo 0){
            result.append(sb[i])
        }

        //convert your result to an int using the radix
        return result.toString().toInt(2)
    }
}