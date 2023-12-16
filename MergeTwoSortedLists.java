public class MergeTwoSortedLists {
    static class Node {
    private int data;
    private Node next;

    public Node(int val) {
      data = val;
    }

    public void setNext(Node node) {
      next = node;
    }

    public Node getNext() {
      return next;
    }
  }

  public static void main(String[] args) {
    Node 
      A1 = new Node(1),   B1 = new Node(0),
      A2 = new Node(5),   B2 = new Node(2),
      A3 = new Node(13),  B3 = new Node(17),
      A4 = new Node(44),  B4 = new Node(46),
      A5 = new Node(99);

    A1.setNext(A2);   B1.setNext(B2);
    A2.setNext(A3);   B2.setNext(B3);
    A3.setNext(A4);   B3.setNext(B4);
    A4.setNext(A5);

    printLinkedList(A1);
    System.out.println("");   
    
    printLinkedList(B1);
    System.out.println("");

    printLinkedList(SortedMerge(A1, B2));
  }

  public static Node SortedMerge(Node A, Node B) {
    if (A == null) return B;
    if (B == null)  return A;

    if (A.data < B.data) {
      A.next = SortedMerge(A.next, B);
      return A;
    } else {
      B.next = SortedMerge(A, B.next);
      return B;
    }
  }

  public static void printLinkedList(Node head) {
    Node temp = head;

    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.getNext();
    }
  }
}
