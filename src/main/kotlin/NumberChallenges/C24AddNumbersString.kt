package NumberChallenges

class C24AddNumbersString {
    //Given a string that contains both letters and numbers, write a function that pulls out all the
    //numbers then returns their sum.

    //• The string “a1b2c3” should return 6 (1 + 2 + 3).
    //• The string “a10b20c30” should return 60 (10 + 20 + 30).
    //• The string “h8ers” should return “8”.

    fun addNumb(input: String): Int{
        //the given test shows that the number are grouped between letter
        var result = 0
        val nu = "0123456789"
        val sb = StringBuilder()
        //here only save for numbers and change letter to a delimiter
        for (i in input){
            if(nu.contains(i)){
                sb.append(i)
            } else {
                sb.append("+")
            }
        }
        val st = sb.toString()
        //here split by its delimiter to create an arrar with the whole numbers
        val st2 = st.split("+")
        for(s in st2){
            //this if is only to avoid posible blank spaces in the arrar
            if (s.isNotBlank()){
                result += s.toInt()
            }
        }

        return result
    }
}