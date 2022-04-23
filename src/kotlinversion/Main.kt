package kotlinversion


fun main(args: Array<String>) {
    // Example
    val node = Node(Data(7,3))
    node.appendToEnd(Data(1,10))
    node.appendToEnd(Data(1,4))
    node.appendToEnd(Data(2,1))
    node.appendToEnd(Data(5,2))
    node.appendToEnd(Data(6,5))
    node.appendToEnd(Data(8,4))
    node.appendToEnd(Data(9,2))
    node.appendToEnd(Data(8,9))


    println(node.printNodes())
    println("En kısa yol = "+node.sumOfNodes())
    // End of Example

}