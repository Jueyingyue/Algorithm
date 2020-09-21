package data.structure.stack;

public class OrderStack {
	  public int head=0;//队头
	  public int tail=0;//队尾
	  public int items[];//数组
	  public int n;//队列大小
	
	  public OrderStack(int n) {
		  items=new int[n];
		  this.n=n;
	  }
	
	
	   //順序队列压队 判断是否栈满
	   public boolean push(int item) {
		   while(tail<n) {
			   items[tail]=item;
			   ++tail;
			   return true;
		   }
		   return false;
	   }
	   
	   //順序队列出队
       public Integer pop() {
    	   if(head<tail) {
    		   return items[head++];
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
