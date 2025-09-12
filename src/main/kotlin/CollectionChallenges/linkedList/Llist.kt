package CollectionChallenges.linkedList

class Llist<T> {
    var start: Lnode<T>? = null

    //function for challenge c43
    fun printNodes() {
        var currentNode = start
        while (currentNode != null) {
            print("${currentNode.value} ")
            currentNode = currentNode.next
        }
    }

    //function for challenge c44
    fun returnMid(): Lnode<T>?{
        var slow = start
        var fast = start
        while (fast != null && fast?.next != null){
            slow = slow?.next
            fast = fast?.next?.next
        }
        return slow
    }


    fun insert(value: T) {
        val newNode = Lnode(value)
        if (start == null) {
            start = newNode
            return
        }
        var current = start
        while (current?.next != null) {
            current = current.next
        }
        current?.next = newNode
    }

    fun find(value: T): Lnode<T>? {
        var current = start
        while (current != null) {
            if (current.value == value) {
                return current
            }
            current = current.next
        }
        return null
    }

    // Eliminar un valor (primer match)
    fun remove(value: T): Boolean {
        if (start == null) return false

        // Caso especial: el nodo a eliminar es el primero
        if (start?.value == value) {
            start = start?.next
            return true
        }

        var current = start
        while (current?.next != null) {
            if (current.next?.value == value) {
                current.next = current.next?.next
                return true
            }
            current = current.next
        }
        return false
    }

    // Representación como String
    override fun toString(): String {
        val result = StringBuilder()
        var current = start
        while (current != null) {
            result.append("${current.value} -> ")
            current = current.next
        }
        result.append("null")
        return result.toString()
    }
}