package CollectionChallenges

class C41FindMedian {

    //Write an extension to collections that accepts an array of Int and returns the median average,
    //or nil if there are no values.
    //Tip: The mean average is the sum of some numbers divided by how many there are. The
    //median average is the middle of a sorted list. If there is no single middle value – e.g. if there
    //are eight numbers - then the median is the mean of the two middle values.

    //• The code [1, 2, 3].challenge41() should return 2.
    //• The code [1, 2, 9].challenge41() should return 2.
    //• The code [1, 3, 5, 7, 9].challenge41() should return 5.
    //• The code [1, 2, 3, 4].challenge41() should return 2.5.
    //• The code [Int]().challenge41() should return nil.

    fun test(){
        val numbers = listOf<Int>(1,2,3)
        println(numbers.findMedian())
    }

    fun List<Int>.findMedian(): Double?{
        // return null for empty list
        if (this.isEmpty()) return null
        //first sort the elments
        val sortedList = this.sorted()
        // get the middle index
        //since its diving by 2 (int) it will round down the result
        val mid = sortedList.size / 2
        //if mid % 2 is not 0 means there are a middle number
        // e. g the array size is 3 the mid should be 1.5 but is rounded down
        // so mid equals 1 and the modulus of 1 is 1, the size of the list is not simetric and can found a midle number
        //if mid equals 2 and modulus of 2 is 0, this size is simetric and the middle are 2 numbers
        return if (mid % 2 != 0){
            sortedList[mid].toDouble()
        } else {
            ((sortedList[mid] + sortedList[mid-1]) / 2.0)
        }
    }
}