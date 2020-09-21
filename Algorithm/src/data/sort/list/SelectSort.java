package data.sort.list;

public class SelectSort {

    public static void sort(Integer[] a)
    {
        //将a[]按升序排列
        int N=a.length;
        for (int i=0;i<N;i++)
        {
            int minValue=a[i];
            for (int j=i+1;j<N;j++)
            {
               if(a[i]>a[j]){
                   minValue=a[j];
               }
            }
            a[i]=minValue;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //选择排序：1）也分为有序区间和无序区间 2）每次从无序区间中找出最小值和有序区间末尾值交换
        Integer a[]={0,3,1,12,34,2,6,21,78,9};

        InsertSort.sort(a);
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }

}
