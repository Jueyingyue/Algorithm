package data.sort.link;

import data.structure.link.Node;

import java.util.Random;

public class BubbleLinkSort {
    private int num;
    private static Node head;
    public BubbleLinkSort(int num,Node head) {
        this.num=num;
        this.head=head;
    }

    /*
     * 尾插法
     */
    public void createHeadInsert() {
        Node tail=head;
        Random random=new Random(1);
        for(int i=1;i<=num;i++) {
            int data=random.nextInt((i)*num);
        	System.out.print(data+",");
            Node p=new Node();//创建一个新节点
            p.data=data;//设置数据域
            p.next=null;
            tail.next=p;
            tail=p;
        }

        System.out.println("\n使用冒泡排序");
        bubbleSort(head.next,num);
    }


    // 冒泡排序，a表示数组，n表示数组大小，如果当某次冒泡没有发生数据交换，说明已经是有序的了
    public static void bubbleSort(Node sort,int n) {
        if(n<=1)
            return;
        boolean flag=false;
        Node tail=sort;
        Node pre=null;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++) {
                  if(tail!=null&&tail.next!=null){
                	  Node nodeNext=tail.next;//指针所在位置的下一个节点
                      int data1=tail.data;
                      int data2=nodeNext.data;
                      if(data1>data2){
                    	  Node nodeNextnext=nodeNext.next;
                    	  pre.next=nodeNext;
                    	  nodeNext.next=tail;
                    	  tail.next=nodeNextnext;
                          flag=true;
                      }else{
                    	  pre=tail;//记录当前指针的上一个节点
                    	  tail=tail.next;
                      }
                  }else{
                      break;
                  }
            }

            if(!flag){
                break;
            }
        }
    }


    /*
     * 链表输出
     */
    public static void pop() {
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
        BubbleLinkSort list=new BubbleLinkSort(10,head);
        System.out.println("前插法创建大小为10的一个链表");
        list.createHeadInsert();
        System.out.print("前插法创建链表输出");
        pop();

    }

}
