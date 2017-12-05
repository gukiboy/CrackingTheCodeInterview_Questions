import java.util.List;
import java.util.LinkedList;

/*
 *  You are given a binary tree in which each node contains a value.
 *  Design an algorithm to print all paths which sum up to that value. 
 *  Note that it can be any path in the tree - it does not have to start at the root.
 *
 */
class BinaryTreeSum
{
    public static void checkPath(Tree pRoot, int pValue, int pCurrent, String pPath)
    {
        pCurrent += pRoot.value;

        if(pCurrent > pValue)
        {
            pCurrent -= pRoot.value;
            return;
        }

        if(pCurrent == pValue)
        {
            System.out.println("Path found: {"+pPath+";"+pRoot.toString()+"}");
            pCurrent -= pRoot.value;
            return;
        }

        if(pRoot.getLeft() != null)
            checkPath(pRoot.getLeft(), pValue, pCurrent, pPath+" ; "+pRoot.toString());

        if(pRoot.getRight() != null)
            checkPath(pRoot.getRight(), pValue, pCurrent, pPath+" ; "+pRoot.toString());
    }

    public static void treePaths(Tree pRoot, int pValue)
    {

        checkPath(pRoot, pValue, 0, new String());

        if(pRoot.getLeft() != null)
            treePaths(pRoot.getLeft(), pValue);
        if(pRoot.getRight() != null)
            treePaths(pRoot.getRight(), pValue);
    }

    public static void main (String args[])
    {
        Tree ROOT = new Tree(1);
        Tree CURSOR = ROOT;

        CURSOR.setLeft(new Tree(4));
        CURSOR.setRight(new Tree(8));
        /*
         *       1
         *      / \
         *     4   8 
         */

        CURSOR = CURSOR.getLeft();
        CURSOR.setLeft(new Tree(7));
        CURSOR.setRight(new Tree(1));
        /*
         *       1
         *      / \
         *     4   8
         *    / \
         *   7   1 
         */

        treePaths(ROOT, 9);

    }
}
