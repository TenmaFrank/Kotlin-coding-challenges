package NumberChallenges

class C18RecreatePow {
    //Create a function that accepts positive two integers, and raises the first to the power of the
    //second.
    //Tip: If you name your function myPow() or challenge18(), you’ll be able to use the
    //built-in pow() for your tests. The built-in pow() uses doubles, so you’ll need to typecast.
    //• The inputs 4 and 3 should return 64, i.e. 4 multiplied by itself 3 times.
    //• The inputs 2 and 8 should return 256, i.e. 2 multiplied by itself 8 times.

    fun powFun(num: Int, toPow: Int): Int{
        //a pow is multiplacate the number its self n times
        //keeping that in mind we can see it as a repetition of an operation
        var result = num // this is equal to say num^1
        var reps = toPow - 1 // this will be our repetitions, its - 1 becasue the first is repetition is the assignation
        while (reps>0){
            //result will multiply itself for num (e.g, at this point whil be num * num)
            result *= num
            //decreasse the repetitons
            reps --
        }
        return result
    }


    fun challenge18a(number: Int, power: Int): Int {
        //the book makes a similar aproach
        //firsts do a safe return
        if (number <= 0 || power <= 0) return 0
        //creates a var to hold the number equal to number^1
        var returnValue = number
        //uses a for from 1 to given power
        for (i in 1..<power) {
            returnValue *= number // returnValue will multiply itself for num (e.g, at this point whil be num * num)
        }
        return returnValue
    }

    fun challenge18b(number: Int, power: Int): Int {
        //here is less code but less readablity
        //it iterates until returnit it self the result number and the power less 1
        //unil power equals to 1
        if (number <= 0 || power <= 0) return 0
        if (power == 1) return number
        return number * challenge18b(number, power - 1)
    }
}