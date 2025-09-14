package CollectionChallenges

class C50CountLargestRange {

    //Write a function that accepts an array of positive and negative numbers and returns a closed
    //range containing the position of the contiguous positive numbers that sum to the highest value,
    //or nil if nothing were found.

    //• The array [0, 1, 1, -1, 2, 3, 1] should return 4...6 because the highest
    //sum of contiguous positive numbers is 2 + 3 + 1, which lie at positions 4, 5, and 6 in
    //the array.
    //• The array [10, 20, 30, -10, -20, 10, 20] should return 0...2.
    //• The array [1, -1, 2, -1] should return 2...2.
    //• The array [2, 0, 2, 0, 2] should return 0...0.
    //• The array [Int]() should return nil.


    fun foundRange(input: Array<Int>): String{
        //i do it brute force calculating for every number in array
        var aux = 0
        var firstIndex = 0
        var lastSum = 0
        var lastRange = " "

        //run over every number
        for (i in input.indices){
            //if the current numer is greater than 0 means you can sum
            if (input[i] > 0){
                //add the current value to aux
                aux += input[i]
                //if the aux is greater than the lastsum it means aux is the new last sum wich is the best sum
                if (aux > lastSum){
                    //store the value
                    lastSum = aux
                    //and the range will be the first index and the current index
                    lastRange = "$firstIndex .. $i"
                }
                //if the current number is less tha 0 means this will be our bound
                // so now need to start adding again
            } else {
                //now our first index will be de last were broke the best range
                firstIndex = i
                //reset aux
                aux = 0
                }
            }
        return lastRange
    }


}