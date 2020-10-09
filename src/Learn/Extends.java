package Learn;
// 重写的方法权限必须宽松于父类方法的权限.
public class Extends { //类的继承 关键字extends.先把子类的所有共性汇总,写在父类中,再在子类中写其特有的代码
    int age;
    String name;
    int Sex;

    public void showInfo(){
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.Sex);
    }

    public static class students extends Extends{ //继承了父类Extends中的成员变量
        String school;  //子类中的特有属性和方法,是对父类的扩展

        @java.lang.Override  // Override重写父类方法,
        public void showInfo() {
            super.showInfo();
        }
//        public void showInfo(){
//            System.out.println(this.age);
//        }
    }//students

//practice:多层继承关系

    public static class ManKind{
        ManKind(){
            System.out.println("ManKind");
        };
        int sex;
        int salary;

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public void manOrWoman(){
            if (this.sex == 0){
                System.out.println("man");
            }
            else {
                System.out.println("woman");
            }
        }

        public void employed(){
            if (this.salary == 0){
                System.out.println("not work");
            }
            else {
                System.out.println("working");
            }
        }
    } //Mankind

    public static class Kids extends ManKind{
        int yearsOld;

        public int getYearsOld() {
            return yearsOld;
        }

        public void setYearsOld(int yearsOld) {
            this.yearsOld = yearsOld;
        }

        public void printAge(){
            System.out.println(this.yearsOld);
        }

        public void employed(){
            super.employed();  //super.调用所有上级父类的方法
            System.out.println("调用父类方法再输出");
        }
        public static void main(String[] args) { //在main方法中实例化Kids,继承并调用父类的方法

            Kids somekid = new Kids();
            somekid.setSex(1);
            somekid.setSalary(999999);

            somekid.manOrWoman();
            somekid.employed();
        }//main
    }//kids

    public static class Kk extends Kids{
        public void test(){
            super.salary = 1000;
        }


    }// Kk



}//class

