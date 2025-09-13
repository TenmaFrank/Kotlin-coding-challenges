package CollectionChallenges

class C48DequeDatastructure {
    //Create a new data type that models a double-ended queue using generics, or deque. You should
    //be able to push items to the front or back, pop them from the front or back, and get the number
    //of items.
    //Tip: It’s pronounced like “deck”.

    //Once your data structure has been created, this code should compile and run cleanly:
    //var numbers = deque<Int>()
    //numbers.pushBack(5)
    //numbers.pushBack(8)
    //numbers.pushBack(3)
    //assert(numbers.count == 3)
    //assert(numbers.popFront()! == 5)
    //assert(numbers.popBack()! == 3)
    //assert(numbers.popFront()! == 8)
    //assert(numbers.popBack() == nil)

    fun test(){
        var numbers = Deque<Int>()

        numbers.pushFront( 1)
        numbers.pushFront( 5)
        numbers.pushBack(11)

        numbers.printElements()

    }

}

class Deque<T> {
    private val array = ArrayList<T>()

    val count: Int
        get() = array.size

    val isEmpty: Boolean
        get() = array.isEmpty()

    fun pushBack(obj: T) {
        array.add(obj)
    }

    fun pushFront(obj: T) {
        array.add(0, obj)
    }

    fun popBack(): T? {
        return if (array.isEmpty()) null else array.removeAt(array.size - 1)
    }

    fun popFront(): T? {
        return if (array.isEmpty()) null else array.removeAt(0)
    }

    fun printElements(){
        for (item in array){
            print(" $item , ")
        }
    }
}