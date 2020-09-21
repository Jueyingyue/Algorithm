package data.sort.list;

public class InsertSort {

    public static void sort(Integer[] a)
    {
        //将a[]按升序排列
        int N=a.length;
        for (int i=1;i<N;i++)
        {
            int value=a[i];
            int j=i-1;
            for(;j>=0;j--) {
                if(a[j]>value) {
                    a[j+1]=a[j];
                }else{
                    break;
                }
            }
            a[j+1]=value;
        }
    }




    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //插入排序：1）一个元素的集合是有序的，新插入元素时，从有序集合的最大值开始比较 2）如果插入值小于有序集合中当前的比较值，那就把当前集合中的当前比较值后移一位
        //继续向后比较其余元素和插入元素的大小，重复2的操作，保证插入新元素后的集合仍然有序
        //插入排序之所以比冒泡排序受欢迎是因为其效率比冒泡会高一点，插入排序判断条件成立后只做一个移动操作，然而冒泡交换两个元素的位置，需要做三步，如果逆序度为k的数组
        //那么插入这里执行k次移动，而冒泡进行3k次交换的操作
        Integer a[]={0,3,1,12,34,2,6,21,78,9,65};
        //下标从1开始
        //{0}
        //{0，3}
        //{0，1，3}  开始把3和插入值1比较，3>1 ,把当前插入值1临时保存到value,3后移到1的位置，插入值1大于0，终止比较
        //{0，1，3，12，34} 开始把34和插入值2比较，34>2 ,把当前插入值2临时保存到value,34后移到2的位置，继续重复比较，到插入值2和1比较，不再小于比较值时终止

        InsertSort.sort(a);
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }

}
