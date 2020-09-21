package data.structure.stack;

import data.structure.link.Node;

public class LinkStack {
	  
	   public Node head;
	   public Node tail;
	   
	   public LinkStack(Node head) {
		   this.head=head;
		   this.tail=head;
	   }
	
	   //順序栈压栈 判断是否栈满
	   public void push(int data) {
		   Node p=new Node();
		   p.data=data;
		   tail.next=p;
		   tail=p;
	   }
	   
	   //順序栈出栈
       public Integer pop() {
    	  while(head.next!=null) {
    		  head=head.next;
    		  return head.data;
    	  }
    	  return null;
	   }
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//队列：1.先进先出  2.队列空时，头指针和尾指针相等且下标都为0 3.队列满时，tail指针指向队列尾（tail=count-1），head(head=0)指向队列顶 
			//应用：1.cpu资源分配
			//类型： 1.数组实现的栈叫顺序队列  2.链表实现的栈叫顺序队列
			int n=12;
			OrderStack heap=new OrderStack(n);
			System.out.print("入队列：");
			for(int i=1;i<=n;i++) {
				System.out.print(i+" ");
				heap.push(i);
			}
			
			System.out.print("\r出队：");
			Integer item=null;
			while((item=heap.pop())!=null) {
				System.out.print(item+" ");
			}
			
		}

}
