public class LinkedListReversal {
  static class Node {
    private int val;
    private Node next;

    public Node(int val) {
      this.val = val;
    }

    public void setNext(Node node) {
      this.next = node;
    }

    public Node getNext() {
      return next;
    }
  }

  public static void main(String[] args) {
    Node n1 = new Node(1),
      n2 = new Node(2),
      n3 = new Node(3),
      n4 = new Node(4),
      n5 = new Node(5);

    n1.setNext(n2);
    n2.setNext(n3);
    n3.setNext(n4);
    n4.setNext(n5);

    printLinkedList(n1);
    System.out.println("");
    printLinkedList(reverseList(n1));
  }

  public static Node reverseList(Node node) {
    if (node == null || node.next == null)
      return node;

    Node p = reverseList(node.next);

    node.next.next = node;
    node.next = null;

    return p;
  }

  public static void printLinkedList(Node node) {
    Node temp = node;

    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.getNext();
    }
  }
}
