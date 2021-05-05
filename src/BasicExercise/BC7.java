package BasicExercise;

/**
 * 题目描述
 *
 * 我们处理的整数通常用十进制表示，在计算机内存中是以二进制补码形式存储，但通常二进制表示的整数比较长，为了便于在程序设计过程中理解和处理数据，通常采用八进制和十六进制，缩短了二进制补码表示的整数，但保持了二进制数的表达特点。请输出十进制整数1234对应的八进制和十六进制。
 * 输入描述:
 *
 * 无
 *
 * 输出描述:
 *
 * 十进制整数1234对应的八进制和十六进制（字母大写），用空格分开，并且要求，在八进制前显示前导0，在十六进制数前显示前导0X。
 *
 * 备注:
 *
 * printf可以使用使用格式控制串“%o”、“%X”分别输出八进制整数和十六进制整数，并使用修饰符“#”控制前导显示
 */
public class BC7 {
    public static void main(String[] args) {
        int num = 1234;
        System.out.printf("0%o 0X%X",num,num);
    }
}