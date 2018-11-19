package election;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class CheckDivisibility {   
   public static  ArrayList<String> arr=new ArrayList<String>();
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String number=scan.next();
		int n=number.length();
		CheckDivisibility check=new CheckDivisibility();
		check.permutation(number,0,n-1);
		System.out.println(arr);
		check.divisibilityBy8(arr); }
	public void divisibilityBy8(ArrayList<String> list)
	{     ArrayList<Integer> number=new ArrayList<Integer>();
	      Iterator	itr=list.iterator();
	      while(itr.hasNext())
	      {
	    	 String str= (String) itr.next();
	    	 int num=Integer.parseInt(str);
	    	 if(num%8==0)
	    	 {
	    		 number.add(num);
	    	 } }
	      System.out.println(number); }
	public void permutation(String str,int l,int r)
	{
		if(l==r)
		{
			arr.add(str);
		}
		else
		{
			for(int i=l;i<=r;i++)
			{
			     str=swap(str,l,i);
			     permutation(str,l+1,r);
			     swap(str,l,i);
	}}}
	public String swap(String str,int l,int i )
	{
		char temp;
		char[] num=str.toCharArray();
		temp=num[l];
		num[l]=num[i];
		num[i]=temp;
		return String.valueOf(num);
	}}
