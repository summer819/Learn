package Learn;

public class IntegerPackage{
//基本类 转为 类类形称为: 封装类 ,通过new创建对象
    public static void main(String[] args) {
        int i = 5;
        Integer it = new Integer(i);

// 反之, 类类型转换成基本类型:直接用 = 赋值即可
        int i1 = it.intValue();

//装箱 : 类类型 = 基本类型
        Integer it2 = i; //左右不是相同类型

//拆箱: 基本类 = 类类型
        int i3 = it;

//最大最小值:
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


    }//main




}//Integer
