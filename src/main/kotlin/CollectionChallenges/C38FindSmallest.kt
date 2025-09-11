package CollectionChallenges

class C38FindSmallest {
    //Write an extension for all collections that returns the N smallest elements as an array, sorted
    //smallest first, where N is an integer parameter.
    //• The code [1, 2, 3, 4].challenge38(count: 3) should return [1, 2, 3].
    //• The code ["q", "f", "k"].challenge38(count: 10) should return [“f”,
    //“k”, “q”].
    //• The code [256, 16].challenge38(count: 3) should return [16, 256].
    //• The code [String]().challenge38(count: 3) should return an empty
    //array.

    fun test(){
        val array: Collection<Int> = intArrayOf(5,4,2,7,9,1).toList()
        println(array.smallestIn(3))
        }

    fun Collection<Int>.smallestIn(count: Int): MutableList<Int> {
        //in kotlin is not possible to do this for all Collections because the .sorted() function
        //for this time ill use collections<Int>
        //first sort the collecton
        val sorted = this.sorted()
        //the selceted numbers will be added in this mutable list
        val result = mutableListOf<Int>()

        //run form the 0 until the count that is a bound to create a group
        for (i in 0 .. count){
            result.add( sorted[i] )
        }

        return result
    }
}