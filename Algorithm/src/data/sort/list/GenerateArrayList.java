package data.sort.list;

public class GenerateArrayList<T> {
     
	public T data[];//存储数据的数组
	public int size=10;//数组的大小,默认初始化大小为10
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
		try {
			  if(count<size) {
					data[count++]=t;
			   }else {
					createBigArray();
					data[count++]=t;
				}
				return true;
		}catch (StackOverflowError e) {
			// TODO: handle exception
			System.out.println("栈溢出");
			return false;
		}catch(Exception e) {
			System.out.println("未知错误");
			return false;
		}
	}
	
	//如果空间不够，对数组空间进行扩容，然后进行数据元素的拷贝移位，数组中元素个数增加1
	public void createBigArray(){
		size=size+(size>>1);
		System.out.println("数组进行扩容到大小为"+size);
		T temp[]=(T[]) new Object[size];
		copyOf(data,temp);
	}
	
	//数组的复制  data旧数组  temp新数组
	public void copyOf(T data[],T temp[]) {
		System.out.println("数组进行拷贝");
		for(int i=0;i<data.length;i++) {
			temp[i]=data[i];
		}
		data=temp;
	}
	
	
	//向数组的某个位置添加某个元素，为了保证数组有序连续，添加位置之后的元素都向后移动一个位置，然后再加入
	public boolean add(T t,int index) {
		 if(count<size) {
				if(index==size-1) {//如果插入位置是最后一个，那么就直接插入
					data[count++]=t;
				}else {//否则先把插入位置以后的元素整体向后移动一位再插入
					if(index>=size) {
						throw new ArrayIndexOutOfBoundsException(index);
					}else {
						for(int i=count-1;i>=index;i++) {
							data[i]=data[i+1];
						}
						data[index]=t;
						count++;
						return true;
					}
				}
			 
			}else {
				createBigArray();
				data[count++]=t;
			}
			return true;
	}
	
	//返回数组中元素个数的大小
	public int size() {
      return count;
	}
	
	//删除某个元素
	public boolean remove(Object object) {
		if(object==null) {
			for(int index=0;index<count;index++) {
				if(data[index]==null) {
					fastRemove(index);
					return true;
				}
			}
		}else {
			for(int index=0;index<count;index++) {
				if(object.equals(data[index])) {
					fastRemove(index);
					return true;
				}
			}
		}
		return false;
	}
	
	//移除元素
	public void fastRemove(int index) {
		 int numMoved=size-index-1;//需要移动的元素个数
	     if(numMoved>0) {//把移除位置后的元素整体向前移动一位
	    	 System.arraycopy(data, index+1, data, index,
                     numMoved);
	     }
	     data[--size]=null;//clear to let GC do its work
    	 count--;//元素个数减去1
	}
	
	//删除位置index上的元素
     public boolean remove(int index) {
	     if(index>size-1) {
	    	 throw new ArrayIndexOutOfBoundsException(index);
	     }else {
	    	 fastRemove(index);
	     }
    	 return true;
	 }
     
     
     //获取index处的元素
     public Object get(int index) {
    	 if(index>size-1) {
	    	 throw new ArrayIndexOutOfBoundsException(index);
	     }
    	 return data[index];
     }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateArrayList list=new GenerateArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("数组中元素个数："+list.size());
		list.remove(new Integer(1));
		list.remove(2);
		System.out.println("数组中元素个数："+list.get(0));
		System.out.println("数组中元素个数："+list.get(2));
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13, 13);
		System.out.println("数组中元素个数："+list.size());
	}

}
