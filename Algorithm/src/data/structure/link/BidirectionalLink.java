package data.structure.link;

public class BidirectionalLink {
	private int num;
	private Node head;
	public BidirectionalLink(int num,Node head) {
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
			p.pre=tail;
			tail=p;
		}
	}
	
	/*
	 * 前插法
	*/
	public void beforeHeadInsert() {
		Node tail=null;
		Node p=null;
		for(int i=0;i<num;i++) {
		    p=new Node();//创建一个新节点
			p.data=i;//设置数据域
			p.next=tail;
			if(tail!=null) {
				tail.pre=p;
			}
			tail=p;
		}
		
		head.next=tail;//最后一个插入的结点等于头节点的下一个
		tail.pre=head;//最后一个节点的前一个节点是头节点
	}
	
	/*
	 * 链表输出
	*/
	public void pop() {
		while(head!=null) {
			Node node=head.next;
			if(node!=null) {
				System.out.println("正向next输出"+node.data+"  反向pre输出"+node.pre.data);
				head=node;
			}else {
				break;
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node();
		BidirectionalLink list=new BidirectionalLink(10,head);
		System.out.println("前插法创建大小为10的一个链表:0 1 2 3 4 5 6 7 8 9");
		list.createHeadInsert();
		System.out.println("前插法创建链表输出");
		list.pop();
		
		System.out.println("\r后插法创建大小为10的一个链表:0 1 2 3 4 5 6 7 8 9");
		head=new Node();
		list=new BidirectionalLink(10,head);
		list.beforeHeadInsert();
		System.out.println("后插法创建链表输出");
		list.pop();
		

	}

}
