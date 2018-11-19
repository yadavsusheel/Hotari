package election;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class GetRidOfDuplicates {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
	/*	Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			list.add(scan.nextInt());
		} */                              // for console input
		ArrayList<Integer> newList=new ArrayList<Integer>();
		list.add(4);
		list.add(5);
		list.add(5);
		list.add(6);
		list.add(6);
		list.add(6);
		Collections.sort(list);
		System.out.println(list);
		int count=0;
		newList.add(list.get(0));
		for(int i=0;i<list.size()-1;i++)
		{
			if(list.get(i)!=list.get(i+1))
			{
				newList.add(list.get(i+1));
			}
			else
			{
				count++;
			}
		}
		System.out.println("Number of Dumplictes Array element is: "+count);
		System.out.println("New Array is: "+newList);	
	}
}
