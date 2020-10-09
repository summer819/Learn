package Learn;
//关键字This,表示当前 类的 成员变量或方法,与形参名区分,增强阅读性,还可以用于调用构造器(必须写在首行)
public class This {



    public static class Person7{ //重载多个构造器模板:
        Person7(){};
        Person7(int age){
            this.age = age;
        };
        Person7(String name){
            this(); //等同于调用 Person7() 构造,必须放在构造器内首行处
            this.name = name;

        }
        Person7(int age,String name){ // 当形参名也为age,name重名时
            this(1);//等同于调用 Person7(int age)构造
            this.age = age; //可以用 this. 来表示当前的 类
            this.name = name;
        }
        //(全局)类成员变量 field var.
        int age;
        String name;

        public void setName(String name){
            this.name = name;  //类成员变量name 赋值给 形参name
        }

        public String getName(String name){
           return this.name;   //get方法
        }

        public void setInfo(){
            System.out.println(this.name+this.age);
        }
    }











}//class


