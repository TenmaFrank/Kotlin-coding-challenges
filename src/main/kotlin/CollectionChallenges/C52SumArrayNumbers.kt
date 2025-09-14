package CollectionChallenges

class C52SumArrayNumbers {
    //Write one function that sums an array of numbers. The array might contain all integers, all
    //doubles, or all floats.
    //Tip: If you think this challenge is easy, you’re either a hardened Swift pro or you’ve
    //underestimated the problem.

    //• The code challenge52(numbers: [1, 2, 3]) should return 6.
    //• The code challenge52(numbers: [1.0, 2.0, 3.0]) should return 6.0.
    //• The code challenge52(numbers: Array<Float>([1.0, 2.0, 3.0]))
    //should return 6.0.


    //the most easy way to do it is making a overload for the same function, changin only for
    //the type
    fun sumAllNumber(input: Array<Int>): Int{
        var res = 0
        for (num in input){
            res += num
        }
        return res
    }

    fun sumAllNumber(input: Array<Double>): Double{
        var res = 0.0
        for (num in input){
            res += num
        }
        return res
    }

    fun sumAllNumber(input: Array<Float>): Float{
        var res = 0.0f
        for (num in input){
            res += num
        }
        return res
    }

    //or create a generic but suing lambdas
    fun <T>sumAllNumberLamb(input: Array<T>, initVal: T, add: (T, T) -> T): T{
        var res = initVal
        for (num in input){
            res = add(res, num)
        }
        return res
    }

    fun test(){
        val num: Array<Int> = arrayOf(1, -1, 2, -1)
        println(sumAllNumber(num))
        println(sumAllNumberLamb(num,0, add = {
                a, b -> a+b
        }))
    }
}