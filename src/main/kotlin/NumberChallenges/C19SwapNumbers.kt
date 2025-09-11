package NumberChallenges

class C19SwapNumbers {
    //Swap two positive variable integers, a and b, without using a temporary variable.

    //• Before running your code a should be 1 and b should be 2; afterwards, b should be 1
    //and a should be 2.

    fun swapNumbers( num1: Int, num2: Int){
        //In Kotlin, function parameters are immutable by default and behave like val variables
        //so we need to declare a variables any ways to use them
        var n1 = num1
        var n2 = num2

        // add this first 2 numbers, this addition is like storing both in n1
        n1 = n1 + n2
        // the substrac n1 wich is greater to n2, this will swap n1 to n2 values
        n2 = n1 - n2
        // then just substrac again but now n2 is the first number so it will  get the rest
        n1 = n1 - n2

        println("$n1 and $n2")

    }

    fun challenge19(num1: Int, num2: Int){
        //the book says to use swap fuction but there's no fucntion like that
        //instead you can do the next

        var n1 = num1
        var n2 = num2

        n1 = n2.also { n2 = n1 }
        println(println("$n1 and $n2"))
    }
}