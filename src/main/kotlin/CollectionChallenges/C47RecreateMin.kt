package CollectionChallenges

class C47RecreateMin {
    //Write an extension for all collections that reimplements the min() method.
    //• The code [1, 2, 3].challenge47() should return 1.
    //• The code ["q", "f", "k"].challenge47() should return “f”.
    //• The code [4096, 256, 16].challenge47() should return 16.
    //• The code [String]().challenge47() should return nil.

    fun test(){
        val numbers = listOf("f", "g", "a")
        println(numbers.minOf())
    }

    fun <T> Collection<T>.minOf(): T{
        val sorted = this.sortedBy { it.toString() }
        return sorted[0]
    }

    /*fun <T> Collection<T>.minOf2(): T?{
        if (this.isEmpty()) return null
        val list = this.toList()
        if (this.size == 1) return list[0]
        var aux: T? = list[0]
        for (item: T? in list){
            if (aux == null || item < aux ){
                aux = item
            }
        }
        return aux
    } */
}