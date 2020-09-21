package data.structure.heap;

import data.structure.link.Node;

public class LinkHeap {
	  
	   public Node head;
	   public Node tail;
	   
	   public LinkHeap(Node head) {
		   this.head=head;
		   this.tail=head;
	   }
	
	   //順序栈压栈 判断是否栈满
	   public void push(int data) {
		   Node p=new Node();
		   p.data=data;
		   p.next=tail;
		   tail=p;
		   head.next=p;
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
						//栈：1.先进后出，后进先出  2.栈空时，头指针和尾指针相等且下标都为0 3.栈满时，tail指针指向栈底，head指向栈顶 
						//应用：1.浏览器的前进后退  2.程序函数的运行过程中的压栈和出栈 
						//类型： 1.数组实现的栈叫顺序栈  2.链表实现的栈叫顺序栈
			int n=12;
			LinkHeap heap=new LinkHeap(new Node());
			System.out.println("入栈：");
			for(int i=0;i<n;i++) {
				System.out.print(i+" ");
				heap.push(i);
			}

			System.out.println("");
			System.out.println("出栈：");
			Integer item=null;
			while((item=heap.pop())!=null) {
				System.out.print(item+" ");
			}
			
		}

}
