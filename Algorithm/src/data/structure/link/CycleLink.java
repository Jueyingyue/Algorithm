package data.structure.link;

public class CycleLink {
	private int num;
	private Node head;
	public CycleLink(int num,Node head) {
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
		tail.next=head;
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
			if(i==0) {
				p.next=head;
			}
		}
		head.next=tail;
	}
	
	/*
	 * 链表输出
	*/
	public void pop(int num) {
		int i=0;
		while(head!=null) {
			Node node=head.next;
			if(i>num) {
				break;
			}
			
			if(node!=null) {
				if(node.data!=null) {
					System.out.print(node.data+" ");
				}
				head=node;
				++i;
			}else {
				break;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node();
		CycleLink list=new CycleLink(10,head);
		System.out.println("前插法创建大小为10的一个循环链表:0 1 2 3 4 5 6 7 8 9");
		list.createHeadInsert();
		System.out.print("前插法创建循环链表输出");
		list.pop(15);
		
		System.out.println("\r后插法创建大小为10的一个循环链表:0 1 2 3 4 5 6 7 8 9");
		head=new Node();
		list=new CycleLink(10,head);
		list.beforeHeadInsert();
		System.out.print("后插法创建链表输出");
		list.pop(15);
		

	}

}
