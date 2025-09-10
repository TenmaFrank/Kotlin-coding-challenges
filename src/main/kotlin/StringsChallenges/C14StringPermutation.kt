package StringsChallenges

class C14StringPermutation {
    //Write a function that prints all possible permutations of a given input string.
    //Tip: A string permutation is any given rearrangement of its letters, for example “boamtw” is a
    //permutation of “wombat”.

    //• The string “a” should print “a”.
    //• The string “ab” should “ab”, “ba”.
    //• The string “abc” should print “abc”, “acb”, “bac”, “bca”, “cab”, “cba”.
    //• The string “wombat” should print 720 permutations.

    fun challenge14(string: String, current: String = "") {
        val length = string.length
        if (length == 0) {
            // nothing left to rearrange → print the permutation
            println(current)
            println("******")
        } else {
            println(current) // optional: shows partial progress
            for (i in string.indices) {
                val left = string.substring(0, i)
                val right = string.substring(i + 1, length)
                challenge14(left + right, current + string[i])
            }
        }
    }
}