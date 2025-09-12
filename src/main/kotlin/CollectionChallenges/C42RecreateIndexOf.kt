package CollectionChallenges

class C42RecreateIndexOf {
    //Write an extension for all collections that reimplements the index(of:) method.
    //Tip: This is one of the easiest standard library methods to reimplement, so please give it an
    //especially good try before reading any hints

    //• The code [1, 2, 3].challenge42(indexOf: 1) should return 0.
    //• The code [1, 2, 3].challenge42(indexOf: 3) should return 2.
    //• The code [1, 2, 3].challenge42(indexOf: 5) should return nil.

    fun test(){
        val numbers = listOf<Int>(1,2,3)
        println(numbers.findIndex(3))
    }

    fun List<Int>.findIndex(num: Int): Int?{
        // this iterate every index in the list
        for (i in indices){
            // if the numbe is equal to this[i] it only return the value of index
            if (this[i] == num){
                return i
            }
        }
        //if never gets something just return null
        return null
        //this is the same way to do it it will take O(n) because it need to run over every index until found the match
    }

    fun <T> Iterable<T>.challenge42(search: T): Int? {
        //the book proposal its the same as my aproach above
        //just iterate until you found the element and return its index
        for ((index, item) in this.withIndex()) {
            if (item == search) {
                return index
            }
        }
        return null
    }

}