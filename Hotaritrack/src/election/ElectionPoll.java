package election;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class ElectionPoll {
	public static void main(String[] args) {
		TreeMap<String,Integer> hash=new TreeMap<>();
		hash.put("Jessy", 10000);
		hash.put("Philip", 10000);
		hash.put("Susheel",1200);
		hash.put("Jack", 12002);
		hash.put("Carl", 100000);
		hash.put("Bob", 100000);	
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
