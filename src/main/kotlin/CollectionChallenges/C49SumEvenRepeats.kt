package CollectionChallenges

class C49SumEvenRepeats {
    //Write a function that accepts a variadic array of integers and return the sum of all numbers that
    //appear an even number of times.
    //• The code challenge49(1, 2, 2, 3, 3, 4) should return 5, because the
    //numbers 2 and 3 appear twice each.
    //• The code challenge49(5, 5, 5, 12, 12) should return 12, because that’s the
    //only number that appears an even number of times.
    //• The code challenge49(1, 1, 2, 2, 3, 3, 4, 4)` should return 10.

    fun sumRepetedEven(input: IntArray): Int{
        //i notice if you get a sorted array the numbers shoul be in blocks
        val sorted = input.sorted()
        // get the max index to use as boundry
        val n = sorted.size -1
        // initalize a counter for times that a number apears
        // the counter is 1 because every number appears at least 1 time in array
        var countTimes = 1
        //an auxiliar variable to join the sum
        var aux = 0
        // the final result
        var totalSum = 0

        //for every number in the sorted array
        for (i in 1 .. n){
            //ask if the numbers is equal to it previous
            if (sorted[i - 1] == sorted[i]){
                //if is the same means the number is duplicated
                countTimes += 1 // increase the counter
                //and add the number
                aux += sorted[i]
            } else { // if the noumber is not repeated
                //check if the times it appear is even
                if (countTimes % 2 == 0){
                    //if it is save the stored sum
                    totalSum += aux
                }
                //then reset the counters
                aux = 0
                countTimes = 1
            }
        }
        //at the end check for the last sum sinces the delimiter for the else
        // are another number, at the end it wont go through the else where finish the addtion
        if (countTimes % 2 == 0){
            totalSum += aux
        }
        //return our result
        return totalSum
    }
}