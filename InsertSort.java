class Solution5{
    public int[] insertSort(int[] a){
        for(int i = 0; i < a.length; i++){
            int key = a[i];
            int j = i-1;
            while(j>=0 && a[j] > key){
                a[j+1] = a[j];
                j--;
            }//找到排好序的小于等于当前key值的index，将key值插入之后的位置
            a[j+1] = key;
        }
        return a;
    }
}
public class MyClass {
    public static void main(String args[]) {
        int[] a = new int[]{1,2,3,8,1,3,8,6,7};
      
        Solution5 so = new Solution5();
        int[] c = so.insertSort(a);
       for(int i = 0; i < c.length;i++){
              System.out.println(c[i]);
        
       }
    }
}
