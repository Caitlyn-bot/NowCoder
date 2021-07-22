package BasicExercise;

import java.util.Scanner;

/**
 * 描述
 *
 * 期中考试开始了，大家都想取得好成绩，争夺前五名。从键盘输入n个学生成绩（不超过40个），输出每组排在前五高的成绩。
 * 输入描述：
 * 两行，第一行输入一个整数，表示n个学生（>=5），第二行输入n个学生成绩（整数表示，范围0~100），用空格分隔。
 * 输出描述：
 * 一行，输出成绩最高的前五个，用空格分隔。
 * 示例1
 * 输入：
 *
 * 6
 * 99 45 78 67 72 88
 *
 * 输出：
 *
 * 99 88 78 72 67
 */
public class BC39 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0;j<n-1-i;j++){
                if(arr[j + 1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < 5; i++){
            if(i == 0){
                System.out.print(arr[i]);
            }else{
                System.out.print(" " + arr[i]);
            }
        }
    }
}
