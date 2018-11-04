/**
基数排序的思想做元素去重：
     - 新建数组：键值在区间[0,Max)
     - 原始数组的最大值为：Max-1
**/
class Solution4{
    public static final int MAX = 10;
    public int[] radixSort(int[] a){
        int[] c = new int[MAX];
        for(int j = 0; j < a.length; j++){
            c[a[j]]++;
            //System.out.println(c);
        }
        return c;
    }
}
public class MyClass {
    public static void main(String args[]) {
        int[] a = new int[]{1,2,3,8,1,3,8,6,7};
      
        Solution4 so = new Solution4();
        int[] c = so.radixSort(a);
       for(int i = 0; i < c.length;i++){
           if(c[i]!=0){
              System.out.println(i +":"+c[i]);
           }
       }
    }
}
