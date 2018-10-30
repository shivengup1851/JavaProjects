public class InsertionSorter
{
	/**
		Constructs an insertion sorter.
		@param anArray the array to sort
	*/
	public InsertionSorter(String[] anArray)
	{
		a = anArray;
	}
	/**
		Sorts the array managed by this insertion sorter.
	*/
	public void sort()
	{
		for (int i = 1; i < a.length; i ++)
		{
			String next = a[i];
			// Find the insertion location
			// Move all larger elements up
			int j = i;
			while (j > 0 && a[j - 1].compareTo(next) < 1)
			{
				a[j] = a[j - 1];
				j--;
			}
			// Insert the elemenent
			a[j] = next;
		}
	}
	private String[] a;
}