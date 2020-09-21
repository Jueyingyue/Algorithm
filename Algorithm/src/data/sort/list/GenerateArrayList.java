package data.sort.list;

public class GenerateArrayList<T> {
     
	public T data[];//存储数据的数组
	public int size=15;//数组的大小,默认初始化大小为15
	public int count;//当前数组中元素的个数
	
	//构造有初始化大小数组
	public GenerateArrayList(int initialCapacity) {
		this.size=initialCapacity;
		data=(T[]) new Object[initialCapacity];//强制向下转型
		count=0;
	}
	
	//没有指定大小默认初始化大小为15
	public GenerateArrayList() {
		data=(T[]) new Object[size];//强制向下转型
		count=0;
	}
	
	
	
	//向数组中添加元素
	//1.判断当前数组是否还有空余存储空间存放
	//2.如果空间足够，直接加入，数组中元素个数增加1
	//3.如果空间不够，对数组空间进行扩容，然后进行数据元素的拷贝移位，数组中元素个数增加1
	public boolean add(T t) {
        if(count<size) {
			data[count++]=t;
		}else {
			createBigArray();
			data[count++]=t;
		}
		return true;
	}
	
	//如果空间不够，对数组空间进行扩容，然后进行数据元素的拷贝移位，数组中元素个数增加1
	public void createBigArray() {
		size=size+(size>>1);
		T temp[]=(T[]) new Object[size];
		copyOf(data,temp);
	}
	
	//数组的复制  data旧数组  temp新数组
	public void copyOf(T data[],T temp[]) {
		for(int i=0;i<data.length;i++) {
			temp[i]=data[i];
		}
		data=temp;
	}
	
	
	//向数组的某个位置添加某个元素
	public boolean add(T t,int index) {
		if(count<size) {
			
		}
		return true;
	}
	
	//返回数组中元素个数的大小
	public int size() {
      return count;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
