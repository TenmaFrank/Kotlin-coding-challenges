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
        var aux = 0
        var firstIndex: Int
        var lastSum = 0
        var lastRange = " "

        for (i in input.indices){
            if (input[i] > 0){
                firstIndex = i
                aux += input[i]
                if (aux > lastSum){
                    lastSum = aux
                    lastRange = "$firstIndex .. $i"
                }
            } else {
                firstIndex = i
                aux = 0
                }
            }
        return lastRange
    }


}