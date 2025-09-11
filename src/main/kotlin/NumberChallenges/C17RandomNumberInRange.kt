package NumberChallenges

class C17RandomNumberInRange {
    //Write a function that accepts positive minimum and maximum integers, and returns a random
    //number between those two bounds, inclusive.

    //• Given minimum 1 and maximum 5, the return values 1, 2, 3, 4, 5 are valid.
    //• Given minimum 8 and maximum 10, the return values 8, 9, 10 are valid.
    //• Given minimum 12 and maximum 12, the return value 12 is valid.
    //• Given minimum 12 and maximum 18, the return value 7 is invalid.


    fun randomA(min: Int, Max: Int): Int{
        // at least as i know the only way to randomize is using built function
        // like math.random or java.util.random
        return (min .. Max).random()
    }
}