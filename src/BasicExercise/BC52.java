package BasicExercise;

import java.util.Scanner;

/**
 * 描述
 * 在计算BMI（BodyMassIndex ，身体质量指数）的案例基础上，判断人体胖瘦程度。BMI中国标准如下表所示。
 *
 *
 * 输入描述：
 * 多组输入，每一行包括两个整数，用空格隔开，分别为体重（公斤）和身高（厘米）。
 * 输出描述：
 * 针对每行输入，输出为一行，人体胖瘦程度，即分类。
 * 示例1
 * 输入：
 *
 * 80 170
 * 60 170
 * 90 160
 * 50 185
 *
 * 输出：
 *
 * Overweight
 * Normal
 * Obese
 * Underweight
 */
public class BC52 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            double a = input.nextDouble();
            double b = input.nextDouble();
            double bmi=a*10000/(b*b);
            if(bmi<18.5) System.out.println("Underweight");
            if(bmi<=23.9&&bmi>18.5) System.out.println("Normal");
            if(bmi<=27.9&&bmi>23.9) System.out.println("Overweight");
            if(bmi>27.9) System.out.println("Obese");
        }
    }
}
