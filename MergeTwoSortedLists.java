import java.util.LinkedList;

/*Merge two sorted linked lists and return it as a new list. The new list should be 
made by splicing together the nodes of the first two lists.*/



public class MergeTwoSortedLists 
{
public static LinkedList<Integer> mergeTwoLists(LinkedList<Integer> l1, LinkedList<Integer> l2) 
{
	
	LinkedList<Integer> result=new LinkedList<Integer>();
	while(l1!=null&&l2!=null)
	{
		int first1,first2;
		first1=l1.getFirst();
		first2=l2.getFirst();
		if(first1<first2)
		{
			result.add(first1);
			l1.removeFirst();
		}
		else
		{
			result.add(first2);
			l2.removeFirst();
		}
	}
	if(l1!=null)
		result.addAll(l1);
	else
		result.addAll(l2);
	return result;
    }
    
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
LinkedList<Integer> l1=new LinkedList<Integer>();
LinkedList<Integer> l2=new LinkedList<Integer>();
l1.add(1);
l1.add(2);
l1.add(3);
l1.add(4);
l1.add(5);
l1.add(6);
l2.add(10);
l2.add(11);
l2.add(12);
l2.add(13);
l2.add(14);
l2.add(15);
System.out.println(l1);
System.out.println(l2);
System.out.println(mergeTwoLists(l1,l2));
	}

}
