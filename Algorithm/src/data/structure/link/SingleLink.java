package data.structure.link;

public class SingleLink {
	private int num;
	private Node head;
	public SingleLink(int num,Node head) {
		this.num=num;
		this.head=head;
	}
	
	/*
	 * 尾插法
	*/
	public void createHeadInsert() {
		Node tail=head;
		for(int i=0;i<num;i++) {
			Node p=new Node();//创建一个新节点
			p.data=i;//设置数据域
			p.next=null;
			tail.next=p;
			tail=p;
		}
	}
	
	/*
	 * 前插法
	*/
	public void beforeHeadInsert() {
		Node tail=null;
		for(int i=0;i<num;i++) {
			Node p=new Node();//创建一个新节点
			p.data=i;//设置数据域
			p.next=tail;
			tail=p;
		}
		head.next=tail;
	}
	
	/*
	 * 链表输出
	*/
	public void pop() {
		while(head!=null) {
			Node node=head.next;
			if(node!=null) {
				System.out.print(node.data+" ");
				head=node;
			}else {
				break;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node();
		SingleLink list=new SingleLink(10,head);
		System.out.println("前插法创建大小为10的一个链表:0 1 2 3 4 5 6 7 8 9");
		list.createHeadInsert();
		System.out.print("前插法创建链表输出");
		list.pop();
		
		System.out.println("\r后插法创建大小为10的一个链表:0 1 2 3 4 5 6 7 8 9");
		head=new Node();
		list=new SingleLink(10,head);
		list.beforeHeadInsert();
		System.out.print("后插法创建链表输出");
		list.pop();
		

	}

}
