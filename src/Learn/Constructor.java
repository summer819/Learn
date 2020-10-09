package Learn;//构造器可重载 灵活使用(同名不同参数),相当于提供多种不同需求的new对象的模板
// ****************  类的构造方法---构造器 *****************
public class Constructor {
    public Constructor(String n, int a) { //自定义构造器 需与class同名,可写入形参or不写.
        name = n;
        age = a;
    }
    public int age;
    public String name;

//练习:构造一个有x,y,z三个坐标的Point类
    public static class Point{
        Point(int m,int n,int k){ //生成具有三个坐标的point对象
            x = m;
            y = n;
            z = k;
        }
        int x;
        int y;
        int z;

        public void setPoint(int m,int n,int k){ //提供设置三个坐标的方法
            x = m;
            y = n;
            z = k;
        }


    }





}//class