import java.util.*;

public class DepthFirstSearch {
  static class Node {
    private int val;
    private List<Node> neighbors;

    Node(int val) {
      this.val = val;
      this.neighbors = new ArrayList<>();
    }

    public void addNeighbor(Node neighbor) {
      neighbors.add(neighbor);
    }
  }

  public static boolean depthFirstSearch(Node node, Set<Node> visited, int goal) {
    if (node == null)
      return false;

    if (node.val == goal)
      return true;

    for (Node neighbor : node.neighbors) {
      if (visited.contains(neighbor)) continue;

      visited.add(neighbor);

      if (depthFirstSearch(neighbor, visited, goal))
        return true;
    }

    return false;
  }

  public static void main(String[] args) {
    Node 
      node1 = new Node(1),
      node2 = new Node(2),
      node3 = new Node(3),
      node4 = new Node(4),
      node5 = new Node(5);

    node1.addNeighbor(node2);
    node1.addNeighbor(node3);
    node2.addNeighbor(node4);
    node4.addNeighbor(node5);

    int goalValue = 5;

    Set<Node> visitedNodes = new HashSet<>();

    if (depthFirstSearch(node1, visitedNodes, goalValue))
      System.out.println("Goal value " + goalValue + " found!");
    else
      System.out.println("Goal value " + goalValue + " not found.");
  }
}
