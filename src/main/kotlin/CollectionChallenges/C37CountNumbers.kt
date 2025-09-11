package CollectionChallenges

class C37CountNumbers {
    //Write an extension for collections of integers that returns the number of times a specific digit
    //appears in any of its numbers.

    //• The code [5, 15, 55, 515].challenge37(count: "5") should return 6.
    //• The code [5, 15, 55, 515].challenge37(count: "1") should return 2.
    //• The code [55555].challenge37(count: "5") should return 5.
    //• The code [55555].challenge37(count: "1") should return 0.

    fun test(){
        val array: Collection<Int> = intArrayOf(5, 15, 55, 515).toList()
        println(array.countNumbers(5))
    }


    fun Collection<Int>.countNumbers(num: Int):Int{
        //i thought in this solution, is similar with the book but have key diferences
        //this if controls to be only 1 digin
        if (num > 9) return 0
        //this convert the number to search as sting
        val numS = num.toString()
        //our counter
        var count = 0
        //for every item in the collection
        for (i in this){
            //convert the item in to a string
            val asWord = i.toString()
            //then run over every character
            for (letter in asWord){
                //comparing with the given number
                if (numS.contains(letter)){
                    //if its equal increase the counter
                    count++
                }
            }
        }
        //return the counter
        return count
    }

    fun Collection<Int>.challenge37a(count: Char): Int {
        //its the same logic from above but the given number to search
        //is asked by the function as a char direclty so no need to covert and the extra if

        //our counter
        var total = 0
        //the run over every item of the collection
        for (item in this) {
            //convert the current item into a string
            val str = item.toString()
            //iterate for every letter in the stirng
            for (letter in str) {
                // a simple if statement to get the time the number appears
                if (letter == count) {
                    total += 1
                }
            }
        }
        return total
    }

    fun Collection<Int>.challenge37b(count: Char): Int {
        //another way to do it using kotlin functions
        return this.sumOf { item ->
            item.toString().count { it == count }
        }
    }

}