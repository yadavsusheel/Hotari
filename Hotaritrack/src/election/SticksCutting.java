package election;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class SticksCutting {
	public static ArrayList<Integer> newList=new ArrayList<Integer>();
	public void stickCutting(ArrayList<Integer> list) throws Exception
	{   Collections.sort(list);
		int minLength=list.get(0);
		newList.add(list.size());
		if(list.size()==1)
		System.out.println(newList);
		int i=0;
		while(i==0)
		{   if(list.get(i)==minLength)
			{ if(list.size()==1)
				{  list.remove(i);
					break;}
				else
				{ 	list.remove(i);
				}}
			else
			{
				break;
			}}
		int j=0;
		while(j<list.size())
		{
		   int element=list.remove(j)-minLength;
		    list.add(j, element);
			j++;
		}
		stickCutting(list);}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		list.add(scan.nextInt());
		SticksCutting sticks=new SticksCutting();
		try
		{
	     	sticks.stickCutting(list);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}}}
