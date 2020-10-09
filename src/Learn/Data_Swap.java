package Learn;

public class Data_Swap {  //参数的传递;可变的多个形参(循环 数组arr);

// ************* 用数组来传递 可变个数的形参 **************
//    public void printInfo(String[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//// ********** 用java中的...来传递可变个数的形参 使用同上***********
//
//    public void printInfo1(int i,String... args){
//        for (int j = 0; j < args.length; j++) {
//            System.out.println(i+a+args[j]);
//        }//参数类型,个数可变,...需放在参数的最后方
//    }
//*******引用对象ds和ds1 ,实际上操作的都是堆内存中的对象:new DataSwap **********

    public static void main(String[] args) {
 //******** 参数的传递 实参的值复制给形参 ********************
//        DataSwap ds = new DataSwap();
//        System.out.println("调用swap前ds.a的值为:"+ds.a);
//        Test7.swap(ds);
//        System.out.println("调用swap之后ds.a的值为:"+ds.a);

//***************** 封装 隐藏成员变量属性 ********************
        SetGet p = new SetGet();//调用同一个包中的类时,可以不需要import(默认)
        p.setAge(-10); //把age属性封装在setAge方法中,且用if设定一个取值的范围.private隐藏了age的信息.


    }//main

    public static class Test7{
        public static void swap(DataSwap ds1){
            ds1.a = 6;
            System.out.println("swap方法中ds1.a的值为:"+ds1.a);
        }
    }

    public static class DataSwap {
        public int a;
    }














}// Day06.Test
