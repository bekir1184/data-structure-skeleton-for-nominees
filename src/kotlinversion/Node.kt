package kotlinversion

import kotlin.math.absoluteValue

class Node(var data: Data) {

    var following: Node? = null
    var length : Int = 0
    fun appendToEnd(data: Data) {
        val end = Node(data)
        var n: Node? = this
        while (n!!.following != null) {
            n = n.following
        }
        n.following = end
        //The length will increase by one each time node is added and we can know the length
        length++
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    fun printNodes() {
        var result = ""
        var n = this
        while (n.following != null){
            result += n.data.x.toString() +","+ n.data.y.toString()
            if(n.following != null){
                result += " --> "
            }
            n = n.following!!
        }
        result += n.data.x.toString() +","+ n.data.y.toString()
        println(result)
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    fun length(h: Node?): Int {
        return length
    }

    // TODO:: Implement to return the sum of the Nodes
    fun sumOfNodes(): Int {
        var result = 0
        val firstNode =  this
        val secondNode = firstNode.following
        while (firstNode.following != null){

            //We calculated the path between the first node and the next client each time.
            //We multiplied the shortest path we found by 2, since the dealer returned to the factory again
            result += shortestPath(firstNode , firstNode.following!!) * 2

            firstNode.following = firstNode.following!!.following

        }

        firstNode.following = secondNode

        return result
    }

    //We found the shortest path from Pythagoras
    private fun shortestPath(firstNode: Node, following: Node): Int {

        val x = (firstNode.data.x - following.data.x).absoluteValue

        val y = (firstNode.data.y - following.data.y).absoluteValue

        return x+y
    }

    fun deleteNode(head: Node, data: Data): Node? {
        val n: Node = head

        if(n.data == data) {
            return head.following
        }

        var current = head
        while (current.following != null){
            if(current.following!!.data == data){
                current.following = current.following!!.following
                return current
            }
            current = current.following!!
        }

        return head
    }


}
data class Data(val x : Int, val y:Int)