package data.structure.recursive;

public class StepMethod {

    public static void sort(Integer[] a)
    {
        //将a[]按升序排列
        int N=a.length;
        for (int i=1;i<N;i++)
        {
          for(int j=i;j>0;j--) {
             if(a[j]<a[j-1]) {
                  int temp=a[j-1];
                  a[j-1]=a[j];
                  a[j]=temp;
             }
          }
        }
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //题目：假如这里有 n 个台阶，每次你可以跨 1 个台阶或者 2 个台阶，请问走这 n 个台阶有多少种走法？
        //1.递归公式 f(n)=f(n-2)+f(n-1)  2.边界 n=2和n=1 f(2)=2 f(1)=1  3.避免重复计算，如f(110)=f(8)+f(9)  f(8)=f(7)+f(6) f(9)=f(8)+f(7) f(7)就出现重复计算了  4.避免递归很深出现内存溢出
        Integer a[]={1,3,0,12,34,2,6,21,78,9};
        StepMethod.sort(a);
        for (int i=0;i<a.length;i++)
        {
          System.out.println(a[i]);
        }

    }

}
