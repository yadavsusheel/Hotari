package election;
	 class LinkListNode
	{
		public int data;
	    public LinkListNode next;
		
		public LinkListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
    class LinkList
	{
		public LinkListNode  head;
		private LinkListNode  last;
		 public LinkList()
		 {
			 this.head=null;
		 }
		 
		 public void insertNode(int d)
		   {
			   LinkListNode node=new LinkListNode(d);
			   if(head==null)
			   {
				   node.next=null;
				   head=node;
				   last=node;   
			   }
			   else
			   {
			      last.next=node;
			      node.next=null;
			      last=node;
		   }
		   }
		 
		 public void removeRedundancy()
		 {
			 LinkListNode first=head;
			 while(first.next!=null)
			 {
				 if(first.data==first.next.data)
				 {
					 first.next=first.next.next;
				 }
				 else
				 {
					 first=first.next;
				 }
			 }
		 }
		 public void printList()
		 {
			 LinkListNode link=head;
			 while(link!=null)
			 {
				 System.out.print(link.data+" ");
				 link=link.next;
			 }
		 }
	}
   public class ReduceReduandancy {
   
       public static void main(String[] args) {
    	 LinkList link1=new LinkList();
	     link1.insertNode(1);
	     link1.insertNode(2);
	     link1.insertNode(2);
	     link1.insertNode(2);
	     link1.insertNode(3);
	     link1.insertNode(3);
	     link1.insertNode(5);
	     link1.printList();
	     link1.removeRedundancy();
	     System.out.println();
	     System.out.println("After Removing dupliates data");
	     link1.printList();	     
}

}
