package Learn;

public class Oop { // 类的写法,面向对象编程

    public static void main(String[] args) {

//    //声明一个Person类的变量,变量名为person. 并且给变量person赋值为new Day5.Person.
//    // new Day5.Person()就是实例化Person类的对象
//        Person person = new Person();
//        person.name = "张三";  // . 给person对象的 name属性变量赋值.
//        person.showName();   // . 调用 person对象的方法
//
//        person.age = 11;  //给person对象的age属性 赋值
//        int age = person.showAge(); // 有返回值的方法,会得到一个返回值,用对应的变量int来接收赋值.
//        int a = person.addAge(2); //赋值后 调用方法 age=age+i.
//        System.out.println("a:"+a+" "+"age:"+person.age); //此时的age已经加过2了
//    //实例化Animal类对象: new Day5.Animal()
//        Animal ani = new Animal();
//        ani.eat("竹子");
//        ani.moveType("飞行");
//
//    //实例化Students类 变量stu
//        Day01.Day5_Class.Students stu = new Day01.Day5_Class.Students();
//        stu.name = "summer";
//        stu.age = 26;
//        stu.course = "java";
//        stu.interest = "dance";
//        stu.showInfo(); // 对该类的全局变量进行赋值后,再调用类中的方法;
//
//    //实例化Day5的对象:
//        Day5 d5 = new Day5();
//        int area = d5.getArea(2, 3);
//        System.out.println(area);

//  //练习 计算圆的面积 s=3.14:r:r
//        Double area = new Circle().getArea(2);//匿名对象
//        System.out.println("半径为2的面积为:"+ area);

    //Test4,定义三个名为mOL的重载方法并调用,
        Test4 t4 = new Test4();
//        t4.mOL(2);
//        t4.mOL(2,3);
//        t4.mOL("方法的重载");
//        t4.max(3,6);
        t4.max(0,1);
        t4.max(9.1,2.2,4.5);

    } //main方法


//****************** 创建类变量 static修饰 ********************

    //Test4,定义三个名为mOL的重载方法并调用,
    public static class Test4{

        public void mOL(int i){
            System.out.println(i*i);
        };
        public void mOL(int x,int y){
            System.out.println(x*y);
        };
        public void mOL(String s){
            System.out.println(s);
        };

    //Test4,定义三个名为mOL的重载方法并调用,
        public void max(int a,int b){
            if (a>b){
                System.out.println("最大值为:"+a);
            }
            else {
                System.out.println("最大值为:"+b);
            }
        }
    // 练习,重载方法max,判断三个数的大小:
        public void max(double a,double b,double c){
            double res = 0; //先声明一个0结果
            if (a>b){
                if (a>c) { res = a; }
                else{ res = c; }
            }
            else {
                if (b>c){res = b;}
                else {res = c;}
            }
            System.out.println("最大值为:"+ res);
        }

    }//class Test4


    //计算圆的面积 s=3.14:r:r
        public static class Circle{
            double r;    //声明半径
            double area; //声明面积;

            public double getArea(double r){
                return 3.14*r*r;
            }
        }

    public static class Person {
    //首先 声明类的成员变量(属性)
        String name; //str默认值为null
        int age; //int默认值为0
        int sex;

        public void showName() {
            System.out.println("姓名:"+name);
        }

        public int showAge() {
            return age;//return后面接方法的返回值
        }

        public int addAge(int i){
            age += i;
            return age;
        }
    }


    //*********** Animal类 *************

    public static class Animal {

        public void eat(String food){  //  ()内填变量名
            System.out.println("该动物的食物为:"+food);
        }

        public void moveType(String move) {
            System.out.println("该动物的运动方式为:"+move);
        }
    }

    public static class Students {
        String name;
        String course;
        String interest;
        int age;

        //******** 方法
        public void showInfo(){
            System.out.println("姓名:"+name);
            System.out.println("年龄: "+age);
            System.out.println("课程:"+course);
            System.out.println("兴趣:"+interest);

        }



    } //Student
} //Day5.java
