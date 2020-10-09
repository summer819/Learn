package Learn;

public class SetGet {
    private int age;// private隐藏了age的信息.

    public void setAge(int a){ //把age属性封装在setAge方法中,且用if设定一个取值的范围.
        if (a <=150 && a >=0){
            age = a;
        }
        else{
            System.out.println("输入的年龄超过范围");
        }
    }
    public int getAge(int i){ //get-return来获取age属性
        return age;
    }

    public void printAge(){
        System.out.println("年龄是:"+age);
    }











}//person
