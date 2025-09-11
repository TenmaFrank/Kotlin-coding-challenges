package CollectionChallenges

class C40MissingNumbersArray {
    //Create a function that accepts an array of unsorted numbers from 1 to 100 where zero or more
    //numbers might be missing, and returns an array of the missing numbers.

    //If your test array were created like this:
    /*
    var testArray = Array(1...100)
    testArray.remove(at: 25)
    testArray.remove(at: 20)
    testArray.remove(at: 6)
     */
    //Then your method should [7, 21, 26], because those are the numbers missing from the
    //array.

    //the problem is poorly described
    //it says to find numbers that are not in the array, if the array is considered as a range
    //the function should return the missing numbers in another array

    //examples

    // if you create an array (0,1,2,3,4,5) the function will return an empty array, since the function
    //will considerate the array as a range of 0 to 5 and look for the elements between it

    // if you create an array (1,5,10,25) should return (2,3,4,6,7,8,9,11,12,13,14,15,16,17,18,19,20,21,22,23,24)
    // if the array is (2,4,6) should return (3,5)

    fun missingNumbers(input: List<Int>): List<Int>{
        //considering the input array as a range
        //need to know the firts number and use it as a left bound
        val min = input[0]
        // then the last number and use it as a right boud
        val max = input[input.size-1]
        val result = mutableListOf<Int>()

        //in this for loop we create the range with the necessary  elements
        for (i in min .. max){
            //if the current number (I) is not on the given input
            if (!input.contains(i)){
                // add it to our result
                result.add(i)
            }
        }
        return result
        // this makes the same logic as the book but the diference here is
        // i create the range just for the numbers we need making them less slow than
        // have a static range from 1 to 100
        // i think is a way better solution this. bless good i didn't pay 50 bucks
    }


    fun challenge40c(input: List<Int>): List<Int> {
        val inputSet = input.toSet()
        val testSet = (1..100).toSet()
        return (testSet - inputSet).sorted()
    }

}