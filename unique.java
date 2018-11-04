/**
元素去重：
  - 排序预处理
  - 设置左右边界
  注：输出的位置如果放在第二层循环中，会少判断一个元素；
**/
import java.util.*;
class Solution4{
    public void unique(int[] a){
        Arrays.sort(a);
        int L = 0;
        int R = 0;
        for(L = 0; L<a.length ; L=R){
            for(R=L+1; R<a.length; R++){
                if(a[L]!=a[R]){
                    break;
                }
            }//让R指向a[L]后的首个不同元素位置
            System.out.println(a[L]+";"+(R-L));
        }
    }
}
public class MyClass {
    public static void main(String args[]) {
        int[] a = new int[]{1,2,3,8,1,3,8,6,7};
        Solution4 so = new Solution4();
        so.unique(a);
    }
}
