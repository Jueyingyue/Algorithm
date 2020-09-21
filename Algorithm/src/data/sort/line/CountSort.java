package data.sort.line;

public class CountSort {
	
	
	public static int[] countSort(int b[]) {
		int maxSize=b[0];
		int c[]=new int[b.length];
		//1）找出数据中的最大数
		for(int i=1;i<b.length;i++) {
			if(b[i]>maxSize) {
				maxSize=b[i];
			}
		}	
		
		//确定桶的数量,创建一个maxSize+1的桶数组，桶下标代表数值，桶中存放值代表重复数据的数量
		int bubble[]=new int[maxSize+1];
		//2）把值相等的数据放入到同一个桶中，统计每个桶的数量
		for(int j=0;j<b.length;j++) {
		    bubble[b[j]]++;
		}
		
		//把桶的数组顺序求和，那么这时候每个桶中的值就是包括桶下标在内的小于等于它的数量
		for(int i=1;i<bubble.length;i++) {
			bubble[i]=bubble[i-1]+bubble[i];
		}
		
		/*
		 * 这种方式会多执行很多次，自己手写第一遍就是这样实现的，这样bubble中的值会被当作
		 * bubble下标值重复的次数，最后也能得到正确的结果
		*/
		/*for(int k=bubble.length-1;k>=0;k--) {
			while(bubble[k]>0) {
				c[bubble[k]-1]=k;
				bubble[k]--;
			}
		}*/
		
		//正确实现
		for(int i=b.length-1;i>=0;i--) {
			int realIndex=--bubble[b[i]];//值在正确排序数组中的位置
			c[realIndex]=b[i];
		}
		
		return c;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//计数排序：
		//1）找出数据中的最大数，确定桶的数量,创建一个maxSize+1的桶数组，桶下标代表数值，桶中存放值代表重复数据的数量
		//2）把值相等的数据放入到同一个桶中，统计每个桶的数量
		//3）把桶的数组顺序求和，那么这时候每个桶中的值就是包括桶下标在内的小于等于它的数量
		//4）从后向前依次循环数组，桶中存储的值就是桶下标值应该在的正确位置（第几个），每循环一次桶中值减1
		int a[]= {3,4,2,1,4,4};
		a=CountSort.countSort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
