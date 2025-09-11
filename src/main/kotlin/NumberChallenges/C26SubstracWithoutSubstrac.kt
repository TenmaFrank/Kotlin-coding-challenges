package NumberChallenges

class C26SubstracWithoutSubstrac {
    //Create a function that subtracts one positive integer from another, without using -.
    //• The code challenge26(subtract: 5, from: 9) should return 4.
    //• The code challenge26(subtract: 10, from: 30) should return 20.

    fun challenge26a(sub: Int, from: Int):Int{
        //the book proposal is convert the subtract number to its negative
        //and just do a sum of positive + negative
        val res = from + -sub
        println("subtract: $sub, from: $from. Equals $res")
        return res
    }

    fun challenge26b(sub: Int, from: Int):Int{
        //another way to convert a number to its negative
        val res = from + (-1 * sub)
        println("subtract: $sub, from: $from. Equals $res")
        return res
    }
}