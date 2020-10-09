package Learn;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        java.util.List<String> list = new ArrayList<String>();//实现类是ArrayList
        list.add("d");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        System.out.println(list); //按添加的顺序排列索引, 得到[d, b, c, a,d]允许元素重复

        System.out.println(list.get(2)); //c, 通过list.get(索引号),来访问集合中的元素
        list.add(1,"f"); //在索引下标1处 插入f,其他元素后移.

        java.util.List<String> l = new ArrayList<String>();
        l.add("123");
        l.add("456");
        list.addAll(2,l); //list的嵌套: 在list中用.addAll在指定索引下标 插入l集合
        System.out.println(list);

        list.indexOf("d");// indexOf()// 获取指定元素 第一次出现的索引下标位置
        list.lastIndexOf("d");//获取指定元素 最后一次出现的索引下标位置

        list.remove(2);// remove移除下标2的元素

        list.set(1,"ff");//.set 根据下标来修改元素

        java.util.List<String> sub= list.subList(2,4); //.sublist(索引) 截取list中的2~4位元素,
        System.out.println(sub); // 含2不含4(含左不含右)
        list.size(); // .size() 获取list的长度



    }//main
}
