package NumberChallenges

class C21CountingBinaryOnes {
    //Create a function that accepts any positive integer and returns the next highest and next lowest
    //number that has the same number of ones in its binary representation. If either number is not
    //possible, return nil for it.

    //• The number 12 is 1100 in binary, so it has two 1s. The next highest number with that
    //many 1s is 17, which is 10001. The next lowest is 10, which is 1010.
    //• The number 28 is 11100 in binary, so it has three 1s. The next highest number with that
    //many 1s is 35, which is 100011. The next lowest is 26, which is 11010.

    fun challenge21a(number: Int): Pair<Int?, Int?> {
        // first convert the given number to binary as string
        val targetBinary = number.toString(2)
        //count how many ones it have
        val targetOnes = targetBinary.count { it == '1' }

        var nextHighest: Int? = null
        var nextLowest: Int? = null

        // Search upwards for next highest
        for (i in number + 1..Int.MAX_VALUE) {
            //convert the next numbers an count their ones
            val currentOnes = i.toString(2).count { it == '1' }
            //if the ones are equal in the next number
            if (currentOnes == targetOnes) {
                // save that number
                nextHighest = i
                break
            }
        }

        // Search downwards for next lowest
        for (i in number - 1 downTo 0) {
            //convert the previous numbers and count their ones
            val currentOnes = i.toString(2).count { it == '1' }
            //iof the ones are equal in the previous number
            if (currentOnes == targetOnes) {
                //save that number
                nextLowest = i
                break
            }
        }
        //return the numbers as a pair
        return Pair(nextHighest, nextLowest)
    }
}