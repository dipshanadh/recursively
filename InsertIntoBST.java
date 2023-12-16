public class InsertIntoBST {
  static class Node {
    private int data;
    private Node left;
    private Node right;
  };

  public static void main(String[] args) {
    int nums[] = new int[] {100, 80, 50, 90, 30, 60, 90, 85, 95, 120, 110, 108, 115, 140};

    Node root = null;

    for (int i : nums) 
      root = insertNode(root, i);

    printLeaves(root);
  }
  
  public static Node insertNode(Node root, int data) {
    if (root == null) {
      root = new Node();
      root.data = data;

      return root;
    }

    if (data > root.data)
      root.right = insertNode(root.right, data);
    else
      root.left = insertNode(root.left, data);

    return root;
  }

  public static void printLeaves(Node root) {
    if (root == null) return;

    printLeaves(root.left);

    System.out.print(root.data + " ");

    printLeaves(root.right);
  }
}