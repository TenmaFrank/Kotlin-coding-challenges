package NumberChallenges

class C20NumberIsPrime {
    // Write a function that accepts an integer as its parameter and returns true if the number is prime.
    //Tip: A number is considered prime if it is greater than one and has no positive divisors other
    //than 1 and itself.

    //• The number 11 should return true.
    //• The number 13 should return true.
    //• The number 4 should return false.
    //• The number 9 should return false.
    //• The number 16777259 should return true.

    fun checkPrime(num: Int): Boolean{
        //safe calle when number is less than 1
        if (num< 1) return false
        //we iterate with every number until reach the input
        for (i in 2 .. num){
            // calculete the modulus with every iteration
            if (num % i == 0 && i != num){
                // if the modulus is 0 means the given number is divisible by another number that is not the same
                //meaning that is not a prime number so it stop early
                return false
            }
        }
        //if nothing happen it return true
        return true
    }
}