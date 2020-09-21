package data.sort.list;

public class BubbleSort {


    //错误：这种方法如果有一段是有序的会导致重复判断
    public static void sort(Integer[] a)
    {
        //将a[]按升序排列
        int N=a.length;
        for (int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++) {
                if(a[i]>a[j]) {
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }

        }
    }


    // 冒泡排序，a表示数组，n表示数组大小，如果当某次冒泡没有发生数据交换，说明已经是有序的了
    public static void bubbleSort(Integer[] a, int n) {
        if (n <= 1) return;

        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (a[j] > a[j+1]) { // 交换
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;  // 表示有数据交换
                }
            }
            if (!flag) break;  // 没有数据交换，提前退出
        }
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
       //冒泡排序：1）每次比较都是相邻的两个元素 2）一次冒泡至少会让一个元素回到它该在的位置，所以每次冒泡后下一次都会少比较(i+1)个元素，集合末尾的（i+1）个都是排序好的
        // 3）冒泡排序属于原地排序，空间复杂度为1，也就是不需要额外的空间
        //4）冒泡排序属于稳定的排序算法也就是相同的元素之间相对位置不改变 5）时间复杂度最好是o(n)也就是元素本就是一个有序的集合，需要一次冒泡,最坏是o(n2)，刚好是倒序的

        Integer a[]={0,3,1,12,34,2,6,21,78,9};
        BubbleSort.bubbleSort(a,a.length);
        //BubbleSort.sort(a);//错误方式
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }



}
