package CollectionChallenges

class C46RecreateMap {
    //Write an extension for all collections that reimplements the map() method.


    //• The code [1, 2, 3].challenge46 { String($0) } should return [“1”, "2", "3"]
    //• The code ["1", "2", "3"].challenge46 { Int($0)! } should return [1, 2, 3].

    fun test(){
        val numbers = listOf(1, 2, 3, 4)
        val numbers2 = listOf("1", "2", "3", "4")
        val strings = numbers.challenge46 { "Number: $it" }
        val integers = numbers2.challenge46 { it }
        println(strings)
        println(integers)
    }

    fun <T, R> Collection<T>.challenge46(transform: (T) -> R): List<R> {
        val returnValue = mutableListOf<R>()  // create the return list
        for (item in this) {                  // loop through all elements
            returnValue.add(transform(item))  // apply transform and add result
        }
        return returnValue                    // return the list
    }
    /*
    Explanation (line by line):

fun <T, R> Collection<T>.challenge46(transform: (T) -> R): List<R>

This declares an extension function on all Collection<T>.

It takes a lambda transform that maps each element of type T into a new type R.

The function itself returns a List<R>.

val returnValue = mutableListOf<R>()

Creates an empty mutable list that will hold the transformed elements.

for (item in this)

Iterates through all the items in the collection (this is the collection you call it on).

returnValue.add(transform(item))

Applies the transform function to each element.

Adds the result into returnValue.

return returnValue

Finally, returns the completed list with all transformed elements.
     */
}