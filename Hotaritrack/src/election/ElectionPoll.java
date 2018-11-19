package election;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class ElectionPoll {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		TreeMap<String,Integer> hash=new TreeMap<>();
		for(int i=0;i<n;i++)
		{
			hash.put(scan.next(), scan.nextInt());
		}	
		Set s=hash.entrySet();
		Iterator itr= s.iterator();
		int maxValue=0;
		String Winner="";
		while(itr.hasNext())
		{
		      Map.Entry map=(Map.Entry)itr.next();
		      int value=(int) map.getValue();
		      String str= (String) map.getKey();
		      if(value==maxValue)
		      {
		    	int i= Winner.compareTo(str);
		    	if(i<0)
		    	{
		    		Winner=str;
		    	}
		      }
		      if(value>maxValue)
		      {
		    	  maxValue=value;
		    	  Winner=str;
		      }
		}
		System.out.println(Winner+" : "+maxValue);	
	}
}
