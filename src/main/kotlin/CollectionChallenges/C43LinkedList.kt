package CollectionChallenges

class C43LinkedList {
    // Create a linked list of lowercase English alphabet letters, along with a method that traverses all
    //nodes and prints their letters on a single line separated by spaces.

    //Tip #1: This is several problems in one. First, create a linked list data structure, which itself is
    //really two things. Second, use your linked list to create the alphabet. Third, write a method
    //traverses all nodes and prints their letters.

    //Tip #2: You should use a class for this. Yes, really.

    //Tip #3: Once you complete your solution, keep a copy of the code – you’ll need it for future
    //challenges!

    //• The output of your code should be the English alphabet printed to the screen, i.e. “a b c
    //d … x y z”.

    fun test(){
        //here create the object to linkedList
        val list = LinkedList<Char>()
        //here the first object in null because at this point is empty
        var previousNode: LinkedListNode<Char>? = null

        //for every letter in a to z
        for (letter in 'a'..'z') {
            //create a new object using the letter as value
            val node = LinkedListNode(letter) // val = letter, next = null
            //if the previosnode is not null means our list have at least one node stored
            if (previousNode != null) {
                //it will save the new node in the var next of the previous
                previousNode!!.next = node
                //if not that our list is empty
            } else {
                //it will save the new node as start(head) of list
                list.start = node
            }
            //after the operations thi node will be the new previousnode
            //to continue saving the next nodes on the next var
            previousNode = node
        }

        list.printNodes() // Output: a b c d ... z
    }

}

// Node definition
//this node will storage a value and another node
class LinkedListNode<T>(val value: T) {
    var next: LinkedListNode<T>? = null
}

// Linked list
//this will be the cointainer for all the nodes\
//start is an object node that will contian another a value and another node
class LinkedList<T> {
    var start: LinkedListNode<T>? = null

    fun printNodes() {
        //the current node will be equal to the start (head) this contain all the nodes nested
        var currentNode = start
        //while the node dont be null it keep doing this
        while (currentNode != null) {
            // take the value stored in the node
            print("${currentNode.value} ")
            //then the current node wiil be the value stored in next witch is another node object
            currentNode = currentNode.next
        }
        /*
        at my point of view i see the like this. example lets take a b c as values

        start = LinkedListNode<Char> (value = 'a'){
            next = linkedListNode<Char> (value = 'b'){
                next = linkedListNode<Char> (value = 'c'){
                    next = null
                }
            }
        }
        */


    }
}
