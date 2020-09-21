package data.structure.heap;

public class OrderHeap {
	  public int count=0;//栈中元素个数
	  public int n;//栈的大小
	  public int items[];//数组
	
	  public OrderHeap(int n) {
		  this.n=n;
		  items=new int[n];
	  }
	
	
	   //順序栈压栈 判断是否栈满
	   public boolean push(int item) {
		   while(count<n) {
			   items[count]=item;
			   ++count;
			   return true;
		   }
		   return false;
	   }
	   
	   //順序栈出栈
       public Integer pop() {
    	   if(count>0) {
    		   --count;
    		   return items[count];
    	   }
    	   return null;
	   }
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
						//栈：1.先进后出，后进先出  2.栈空时，头指针和尾指针相等且下标都为0 3.栈满时，tail指针指向栈底，head指向栈顶 
						//应用：1.浏览器的前进后退  2.程序函数的运行过程中的压栈和出栈 
						//类型： 1.数组实现的栈叫顺序栈  2.链表实现的栈叫顺序栈
			int n=12;
			OrderHeap heap=new OrderHeap(n);
			System.out.print("入栈：");
			for(int i=1;i<=n;i++) {
				System.out.print(i+" ");
				heap.push(i);
			}
			
			System.out.print("\r出栈：");
			Integer item=null;
			while((item=heap.pop())!=null) {
				System.out.print(item+" ");
			}
			
		}

}
