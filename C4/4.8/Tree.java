class Tree
{
	Tree left;
	Tree right;
    int value;


	public Tree(int pValue)
	{
		left=null;
		right=null;
        value = pValue;
	}

	public Tree getLeft()
	{
		return left;
	}

	public Tree getRight()
	{
		return right;
	}

    public void setLeft(Tree pTree)
    {
        left = pTree;
    }

    public void setRight(Tree pTree)
    {
        right = pTree;
    }

    boolean isLeaf()
    {
        return (left==null && right==null);
    }

    @Override
    public String toString()
    {
        return super.toString()+" value: "+value;    
    }
}
