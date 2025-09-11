package NumberChallenges

class C16FizzBuzz {
    // Write a function that counts from 1 through 100, and prints “Fizz” if the counter is evenly
    //divisible by 3, “Buzz” if it’s evenly divisible by 5, “Fizz Buzz” if it’s even divisible by three
    //and five, or the counter number for all other cases.

    //• 1 should print “1”
    //• 2 should print “2”
    //• 3 should print “Fizz”
    //• 4 should print “4”
    //• 5 should print “Buzz”
    //• 15 should print “Fizz Buzz”


    fun fizzFuzz(){
        //this need to print every number from 1 to 100
        for (i in 1 .. 100){
            //check the current number I with the 2 constraints to print fizz buzz
            //becasue if you check it at the end it never print it or print it double
            if (i % 3 == 0 && i % 5 == 0){
                println("fizz buzz")
            } else {
                //if the i dont matches 2 operations at the same only
                //then only search for one at time
                if ( i % 3 == 0){
                    println("fizz")
                } else if ( i % 5 == 0){
                    println("buzz")
                } else {
                    //only when it dont match any if just print the number
                    println(i)
                }
            }
        }
    }
}