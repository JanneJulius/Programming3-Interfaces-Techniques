import java.util.ArrayList;
import java.util.Iterator;

public class ArrayNode extends Node implements Iterable<Node> {
  private ArrayList<Node> nodes;

  public ArrayNode() {
    this.nodes = new ArrayList<Node>();
  }

  public void add(Node node) {
    nodes.add(node);
  }

  public int size() {
    return nodes.size();
  }

  public Iterator<Node> iterator() {
    return nodes.iterator();
  }
}
