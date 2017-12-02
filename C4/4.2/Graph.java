import java.util.List;
import java.util.LinkedList;
import java.util.Stack;

public class Graph
{
   static List<Node> myGraph; 

   /**
    * Tries to find a node
    *
    */
   public static Node breadthSearch(Node pSource, Node pDest)
   {
       Node answer = null;

        for(Node n : pSource.myAdjacencies)
        {
            System.out.println("In "+pSource+";Explore "+n);

            if(n == pDest)
            {
                System.out.println("Found!");
                return pDest;
            }
        }

        for(Node n : pSource.myAdjacencies)
        {
            answer = breadthSearch(n, pDest);
            if(pDest == answer)
            {
                return answer;
            }
        }

        System.out.println(answer);
        return answer;
   }

   public static boolean hasAWayFromTo(Node pSource, Node pDest)
   {
        return pDest == breadthSearch(pSource, pDest); 
   }

   public static void main(String args[])
   {
   
       myGraph = new LinkedList<Node>();

       Node kishima = new Node("Kishima");
       Node laura   = new Node("Laura");
       Node virgo   = new Node("Virgo");
       Node ricardo = new Node("Ricardo");
       Node pedro   = new Node("Pedro");
       Node marcela = new Node("Marcela");

       kishima.addAdjacent(virgo);
       kishima.addAdjacent(ricardo);

       virgo.addAdjacent(pedro);
       virgo.addAdjacent(ricardo);
       virgo.addAdjacent(marcela);

       marcela.addAdjacent(kishima);


       laura.addAdjacent(kishima);

       System.out.println(hasAWayFromTo(kishima,laura));
//       System.out.println(kishima.myAdjacencies);
//       System.out.println(laura);
   }
}
