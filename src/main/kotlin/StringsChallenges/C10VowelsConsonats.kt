package StringsChallenges

class C10VowelsConsonats {
    // Given a string in English, return a tuple containing the number of vowels and consonants.
    //Tip: Vowels are the letters, A, E, I, O, and U; consonants are the letters B, C, D, F, G, H, J, K,
    //L, M, N, P, Q, R, S, T, V, W, X, Y, Z.

    ///-----------------------------------usecase-------------------------------------\\\
    //• The input “Swift Coding Challenges” should return 6 vowels and 15 consonants.
    //• The input “Mississippi” should return 4 vowels and 7 consonants.

    fun countVowelsConsonats(input: String): String{
        val upercased = input.uppercase()
        val vowels = "AEIOU"
        val consonats = "BCDFGHJKLMNPQRSTVWXYZ"
        var vowelCounter = 0
        var consonatsCounter = 0

        for(letter in upercased){
            if (vowels.contains(letter)){
                vowelCounter++
            } else if (consonats.contains(letter)){
                consonatsCounter++
            }
        }

        return "$vowelCounter : Vowels and $consonatsCounter : Consonats"
    }


}