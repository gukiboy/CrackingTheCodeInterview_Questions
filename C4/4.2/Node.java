import java.util.LinkedList;
import java.util.List;

public class Node
{
    List<Node> myAdjacencies;
    String myName;

    public Node(String pName)
    {
        myName = pName;
        myAdjacencies = new LinkedList<Node>();
    }

    public Node(String pName, List<Node> pAdjacencies)
    {
        myName = pName;
        myAdjacencies = pAdjacencies;
    }

    public void addAdjacent(Node pNode)
    {
        myAdjacencies.add(pNode);
    }

    public boolean hasNeighbor()
    {
        return !myAdjacencies.isEmpty();
    }

    @Override
    public String toString()
    {
        return myName;
    }
}
