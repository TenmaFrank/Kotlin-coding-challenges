package NumberChallenges

class C25CalculateSquareRootHand {
    //Write a function that returns the square root of a positive integer, rounded down to the nearest
    //integer, without using sqrt().
    //• The number 9 should return 3.
    //• The number 16777216 should return 4096.
    //• The number 16 should return 4.
    //• The number 15 should return 3.

    fun challenge25a(input: Int): Int {
        //the simple way to do it
        //safe return if number equals 1
        if (input == 1) return 1
        //this loop will iterate only to the half of the number
        for (i in 0..(input / 2 + 1)) {
            //if the current number multiplyit by itself is grater than the input
            if (i * i > input) {
                //means its square root is this number minus 1
                return i - 1
            }
        }
        // if nothing happens this will be its square root
        return 0
    }

    fun integerSqrt(n: Int): Int {
        //using the binary search to find its square
        if (n < 2) return n  // sqrt(0)=0, sqrt(1)=1

        //here create the bounds for the search
        var left = 1
        var right = n / 2
        var ans = 1

        //this loop will iterate for the first elemento to the half
        while (left <= right) {
            //calculate for the mid between current bonds
            val mid = left + (right - left) / 2
            // the best square yet is the mid mutiplied by itself
            val square = mid.toLong() * mid  // use Long to avoid overflow

            when {
                //when the square is exact the same that the input number
                square == n.toLong() -> return mid  // exact square root
                //whe the square is less than the input
                square < n -> {
                    ans = mid  //save the mid
                    left = mid + 1 //now the mid is the first bound
                    //and calculate again
                }
                //if square is greater than input
                // mid -1 becomes the second bound
                else -> right = mid - 1
                ////and calculate again
            }
        }
        //return the final
        return ans
    }
}