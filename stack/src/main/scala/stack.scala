class Stack[T]{
  private class Node[T](data: T){
    var next = Node[T] //Inits to a default value
    override def toString = data.toString
  }

  private var head: Node[T] = _

  def push(data: T) = {
    val n = new Node(data)
    n.next = head
    head = n
  }

  def pop():T = {
    val data = n.data
    head = n.next
    return data
  }
}
