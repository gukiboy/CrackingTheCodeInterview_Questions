import java.util.Stack;

/**
 * 
 *
 *
 */

public class SetOfStacks
{
    private int MAX_PILE_SIZE = 10;
    private Stack<Stack<String>> PileOfPlates;


    public SetOfStacks()
    {
        PileOfPlates = new Stack<Stack<String>>();
    }

    public boolean isLastPileMaxedOut()
    {
        if(PileOfPlates.empty())
            return false;
        return PileOfPlates.peek().size() == MAX_PILE_SIZE;
    }

    public boolean isLastPileEmpty()
    {
        if(PileOfPlates.empty())
            return true;
        return PileOfPlates.peek().empty();
    }

    /**
     * Pushes a plate into the set of stacks.
     * If the current stack is full, creates a new one
     */
    public String push(String plate)
    {
        if(isLastPileMaxedOut() || PileOfPlates.empty())
        {
            Stack<String> newPile = new Stack<String>();
            newPile.push(plate);
            PileOfPlates.push(newPile);

            return plate;
        } 

        return PileOfPlates.peek().push(plate);
    }

    /**
     * Pops a plate out of the set of stacks.
     * If the current stack is empty, it will
     * pop it out and remove a plate from the
     * other one.
     */

    public String pop()
    {
        if(PileOfPlates.empty())
        {
            return null;
        }

        if(isLastPileEmpty())
        {
            PileOfPlates.pop();
            return PileOfPlates.peek().pop();
        }

        return PileOfPlates.peek().pop();
    }

    @Override
    public String toString()
    {
        String stringR = "";
    
        for(Stack<String> stack : PileOfPlates)
        {
            stringR += "Stack "+PileOfPlates.indexOf(stack)+"; size :"+stack.size();
            for(String string : stack)
            {
                stringR += "|";
            }
            stringR += "\n\n";
        }

        return stringR;
    }
}
