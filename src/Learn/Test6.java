package Learn;

public class Test6 {  //构造器重载
    public static void main(String[] args) {
        Constructor con = new Constructor("Summer",20);//定义构造器 初始化属性
        System.out.println(con.name+con.age);

//练习:构造一个有三个坐标的Point类
        Constructor.Point po = new Constructor.Point(1,2,3);
//        po.setPoint(4,5,6);
        System.out.println(po.x+","+po.y+","+po.z);


    }//main


}//class
