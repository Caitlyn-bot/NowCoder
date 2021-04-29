package BasicExercise;

/**
 * 题目描述
 * 每个人都想成为大V (VIP：Very Important Person)，但要一点一点积累才行，先从小v做起。要求输出由小写字母v组成的大V。
 * 输入描述:
 *
 * 无
 *
 * 输出描述:
 *
 * v   v
 *
 *  v v
 *
 *   v
 *
 * 备注:
 *
 * 换行使用转义字符‘\n’
 */
public class BC2 {
    public static void main(String[] args) {
        int n = 3;
        for(int i = 1;i <= n ; i++){//控制行数
            for(int j = 1;j < i;j++){//控制每行开头的空格数
                System.out.print(" ");
            }
            for(int k =1;k <=(2*(n+1-i)-1);k++){
                if(k == 1 || k == (2*(n+1-i)-1)){
                    System.out.print("v");
                }else{
                    System.out.print(" ");
                }
            }
            //输出换行
            System.out.print("\n");
        }
    }
}
