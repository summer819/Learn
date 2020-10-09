package Learn;

public class Parameter { //形参&实参
    public static void main(String[] args) {//基本数据类(8种)在参数传递中,就是把实参的值复制到形参之上
// java中用的...来传递可变个数的形参,...表示可传递个数0~N个,且需要放在所有参数的最后.
//        Person3 p3 = new Person3();
//        String[] xx = new String[]{"xiaXia","11"};
//        p3.printInfo(xx);  //xx为传入的实际参数, 即 实参
//        String[] xx1 = new String[]{"japan","dance"};
//        p3.printInfo(xx1);
//        p3.printInfo1(1,'a',"xiaXia","11");

        int i = 0; // 先执行i=0,在栈中开辟内存,存贮的值为0
        swap(i); // 调用,执行swap(0),再执行swap方法体中的i=6,使得i最终在栈中的值为6
        System.out.println("main方法中的参数i的值为:"+i);



    }//main

    public static void swap(int i){
        i = 6; // swap的方法体
            System.out.println("swap方法中的参数i的值为:"+i);
    }//swap









}//Day6
