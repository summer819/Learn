package Learn;

public class Circle_Arr {  //分支结构 for循环
    public static void main(String[] args) {
//        for (int i = 0; i < 5 ; i++) { 格式 //初始化式,条件式,更改式i++,给i重新赋值成1
//            System.out.println("hello");
//        }*/
//
//        for (int i = 1; i <= 150; i++) {
//            String str = "";
//            str += i;
//            System.out.println();

// ****************** for循环 找出1-150之间被3/5/7整除的数字并打印  *********************

//        for (int i = 0; i <= 150; i++) {
//            String str = ""; //先声明 一个空的字符串
//            str += i;  //在用变量i 拼接到字符串
//            if (i % 3 == 0) {
//                str += "foo"; //字符串拼接需要展现的字符串
//                System.out.println(str);
//            }
//            if (i % 5 == 0) {
//                str += "biz";
//                System.out.println(str);
//            }
//            if (i % 7 == 0) {
//                str += "baz";
//                System.out.println(str);
//            }
//        }
//           System.out.println(str); //该print句写在外面时,不整除的情况下也打印出每次循环的数字,如1,2.
//
//************* for循环练习 打印出百位数的水仙花数(个位数,十位数,百位数的立方和等于次数字本身) ***********

//        for (int i = 100; i <=999 ; i++) {
//            int m = i/100; // 获取i的百位数字(int类 小数点部分舍去)
//            int n = (i - m*100)/10; //获取i的十位数字
//            int k = i - m*100 - n*10;//获取i的个位数字
//            int sum = m*m*m+n*n*n+k*k*k;//声明 各个位数的和
//            if (sum==i){
//                System.out.println(i);
//            }
//        }
////********** while循环练习: 求1-100间的所有偶数的和 **********

//        int res = 0; //先声明 一个为0的和res
//        int k = 1;
//        while (k<=100){ k++; //k++不能忘记!!!
//            if (k % 2==0){  //取偶数
//                res += k; //偶数相加
//            }
//        };
//        System.out.println(res); //print需在循环外,才能求到总和
//
//        for (;;)  while(true) //无限循环

//************** 嵌套循环  打印9*9乘法表 ***************
//
//        for (int i = 1; i < 10; i++) {  //外层 纵向乘1~9
//            for (int j = 1; j < 10; j++) { //里层 横向乘1~9
//                System.out.print(i+"*"+j+"="+i*j+"  ");
//            } System.out.println(); //里层不换行 到外层换行
//        }

//******** 输出 1~100间的所有 质数(大于1,且只能被1和其本身整除) ********

//        for (int i = 1; i < 101 ; i++) {
//            int k = 0;  // 声明一个k从0计数,k为整除次数
//            for (int j = 1; j <= i; j++) { //
//                if (i % j == 0){ //用i对1~i之间的数分别取模,
//                    k++;
//                }
//            }
//            if (k == 2){  //如果能被整除次数为2,则i值为质数.在外层for循环中计数!!
//                System.out.println(i);
//            }
//        }
//******************** 数组的声明 new type[] ***********************

//        int[]ii = new int[4];  //动态初始化 声明一个可存放4个int数据的数组
//        System.out.println(ii[1]); //取出ii数组的第1位元素,结果得到0,即数字型有默认值为0,对象类型默认为null.
//        int[]ii0 = new int[]{1,2,3,4}; //直接声明一个存放了1,2,3,4的数组
//        String[]s = new String[]{"c","a","b"};
//        System.out.println(s[1]); //数组元素的引用
//        System.out.println("数组的长度为:"+s.length);//数组长度 .length

//************* 多维数组 声明 ************

//        int[][]ii = new int[][]{ //静态初始化一个多维数组
//                {1,2,3},
//                {2,4,6}
//        };
//        int[][]i0 = new int[2][3]; //动态初始化,外层一维的数组长度为2,里面二维的数组长度为3

//********* 练习 求下列数组所有元素的和 ********
//
//        int[][]arr = new int[][]{
//                {3,8,2},
//                {2,7},
//                {9,0,1,6},
//        };
//
////解法一 :
//        int len1 = arr.length; //一维数组的长度3
//        int res = 0;// 先声明 结果的定义
//        for (int i = 0; i < len1; i++) {
//            int[] arr0 = arr[i]; // 声明 二维数组
//            int len2 = arr0.length;//二维数组的长度
//
//            for (int j = 0; j < len2; j++) { //遍历二维数组的各元素
//                res += arr0[j];  //  累加求和
//                System.out.println(arr0[j]);
//           }
//        }
//        System.out.println(res); //总和为38,在最外层循环结束后计算出 打印
//
////解法二:
//
//        int res = 0;  //声明一个结果变量
//        for (int i = 0; i < arr.length; i++) { //一维数组循环
//            for (int j = 0; j < arr[i].length ; j++) { //进入二维数组循环
//                res += arr[i][j];  // arr[i]=arr0, 二维数组元素 累加求和
//            }
//        }
//        System.out.println(res);

//************************* 数组的算法 ******************************

//      int[]arr = new int[]{2,3,7,1,3,5};
// 求数组内的最大,最小值:
//        int max = arr[0];// 先假设最大值在0位
// 复制数组:
//        for (int i = 0; i < arr.length; i++) {
//            copy[i] = arr[i];//遍历arr,按顺序把各元素赋值给copy,i是元素的下标
//        }
//        System.out.println(copy[i]);
//
////练习数组反转: for倒转遍历arr,顺序赋值给copy:
//
//        int[]arr = new int[]{4,2,7,1,3,5};
//        int[] copy1 = new int[arr.length];
//        int k = 0;  //copy中的元素下标
//        for (int i = arr.length-1; i >= 0; i--) { //arr中最后一个元素的下标是.len-1
//            copy1[k] = arr[i]; //初次循环时k=0,i=5即copy[0]=arr[5]. 最终循环到i=0,k=5 终止
//            k++;
//        }
//        for (int i = 0; i < arr.length; i++) {  //验证 打印copy
//            System.out.println(copy1[i]); //输出copy中的所有元素
//        }

    }//main

    public static class DataType { // 基础数据类型;基础运算
        public static void main(String[] args) { //数据类型

    //        char c = 'a';
    //        int i = 5;
    //        double d = .314;
    //        double re = c+i+d;
    //            System.out.println(re);
    //
    //        byte b = 3;
    //        b = (byte) (b+4);
    //        System.out.println(b);
    //        System.out.println( );
    //
    //******************** 数据类型转换 **********************
    //       %取模 :取余数 (对负数取模时,结果忽略-负号,如5%-2=1,但-5%2=-1)
    //        System.out.println(-5%2);
    //       '/' 除号, 整数间做除法时 自动忽略小数全部部分,如
    //         int x = 3510;
    //         x=x/1000*1000 ,此时x值为3000
    //********************* 算数运算符 ************************
    //        int i = 0;
    //        int k = i++;  // 自增:++在变量名后方:先赋值后运算,此时k为0
    //        int k = ++i; // ++在i前,则先运算+1 再赋值,此时k为1
    //        System.out.println(k);
    //
    //       int i1 =10, i2 = 20;
    //       int i = i1++; (i1本身+1,等于2步:i=i1,i1=i1+1)
    //        System.out.println("i="+i); //i=10
    //        System.out.println("i1="+i1);//i1=11
    //
    //        i = ++i1;
    //        System.out.println("i="+i);//i=12
    //        System.out.println("i1="+i1);//i1=12
    //
    //        i = i2--;
    //        System.out.println("i="+i);//i=20
    //        System.out.println("i2="+i2);//i2=19
    //
    //        int i = 1;
    //        i = i+2;//等同于扩展运算符:本身再加上 =后面的值
    //        i += 2;  // i=3
    //
    //        String s = "he"; // += 可用来拼接字符串
    //        s +="llo";
    //        System.out.println(s); //hello
    //********************* 赋值运算符 **********************
    //        int i = 1;
    //        i *= 0.1;
    //        System.out.println(i); //i=0,扩展赋值运算时,结果会被强制转化为i的当前类型int,只保留整数位,因此为0.
    //        i++;
    //        System.out.println(i);//i=1
    //
    //        //比较和逻辑运算符的结果 是boolean布尔类型: true/false
    //
    //********************* 逻辑运算符*判断 ********************
    //        //  &逻辑与  |逻辑或  !逻辑非  ^逻辑异或(求异:a,b的布尔值相异时为ture),无论真假,符号左右侧都需运算
    //        // &&短路与  ||短路或   (双符号短路: 符号左边为真时,符号右侧才能进行运算,否则右侧不运算)
    //        //即,在不需要两边都参与运算时,尽量使用双短路符号&&,||
    //        int x = 1;
    //        int y = 1;
    //        if (x++==2 & ++y==2){ x = 7;}  //f & t: 结果为false,因此不执行{x=7}
    //        //if (boolean){代码}: 当()中的布尔值为ture时,再执行后面大括号的代码
    //        System.out.println("x="+x+",y="+y);

    //******************** 位运算*二进制 ********************
    //    位运算是针对二进制进行的运算; <<左移: m<<n 即为 m*2ⁿ,m>>n 即为 m*2⁻ⁿ;
    //    &运算:同位上都是1时结果为1,其余情况都是0; |或运算时同位中有一个1时,结果即为1; ~是反码(0变1 1变0)
    //    逢二进一 : 1+0=1, 1+1=10(进一位),10+1=11,11+1=110(进一位)
    //    负数二进制: 正数的二进制➡反码(0变1,1变0)➡补码(末位加1);

    //******************** 三目/三元运算符 ********************

    //  格式:  条件式?表达式1:表达式2. 条件式为ture时运算结果为表达式1,false时结果为表达式2
    //        int i = 1;
    //        int k = i > 0 ? 1:0;
    //        System.out.println(k);
    //获取三个数中较大的:
            int m = 1;
            int n = 2;
            int k = 0;
            System.out.println(m > n ? (m > k ? m : k) : (n > k ? n : k));

    //运算符优先级:()最优先,可用来提高想要运算的优先等级. += -=等级靠后

    //******************** 分支结构 *********************
    //        int i = 3;
    //        if (i % 2 == 0) {
    //            System.out.println("偶数");
    //        }else{
    //            System.out.println("奇数");
    //        }
    //
    //        int i = 7;
    //        if (i==1){      //if-else分支语句
    //            System.out.println("周一");
    //        }else if (i==2){
    //            System.out.println("周二");
    //        }else if (i==3){
    //            System.out.println("周四");
    //        }else{
    //            System.out.println("不知道周几");
    //        }
    //    if-else结构可以多层嵌套来使用
    //********************* 分支结构 ********************
    //        int x = 4;
    //        int y = 4;
    //        if (x>2){
    //            if (y>1){
    //                System.out.println(x+y);
    //                System.out.println("unknown");
    //            }
    //        }else{
    //            System.out.println("x is"+x);
    //        }
    //****************** switch ***********************
    //        char c = 'a';
    //        switch (c){  //switch可与if-else分支对应,变量类型可以为byte short char int string 枚举,
    //            case 'a':
    //                System.out.println('A');
    //                break; //break是开关,不写的话,程序会接着向下执行全部到结尾
    //            case 'b':
    //                System.out.println('B');
    //                break;
    //            case 'c':
    //                System.out.println('C');
    //            default:
    //                System.out.println("不知道");
    //                break;
    //        }

            int i = 1;
            int j = i++ + ++i + i++ + ++i; // 1 + 3 + 3 +5
            System.out.println(j);// 12



        } //main
    }
}//Day


