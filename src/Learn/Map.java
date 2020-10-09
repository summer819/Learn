package Learn;

import java.util.HashMap;
import java.util.Set;

//map用来保存有映射关系的数据,包含2组值,一组Key和一组Value.
public class Map {  //Key不可重复,通过key找到唯一确定的value,但value可相同.
    public static void main(String[] args) {

        java.util.Map<String, Integer> map = new HashMap<String,Integer>();//map实现HashMap类
        map.put("ren",21);   //map中用 .put 添加键值对
        map.put("Xia",30);
        map.put("Tong",20);
        map.put("summer",22);
        System.out.println(map);

        map.get("b"); // .get(k) 来取得对应value
        map.remove("c"); //.remove(key) 移除对应键值对
        System.out.println(map);

        map.size();//.size() 显示map长度
        map.containsKey("c"); //判断map集合中是否包含指定的key,返回true/false
        map.keySet(); //获取map的key集合,返回set[]key集合
        map.values();//获取map集合的所有value值集合set[]
        System.out.println(map.keySet());
        // map.clear(); 清空集合

    //方法一: 通过 .keySet() 遍历map集合:
      Set<String> keys = map.keySet(); // Set<>接口 来接收map的key集合
        for (String key :keys) { //for each循环遍历:( type变量名:集合数组名 )
            System.out.println("key:"+key+"  "+"value:"+map.get(key));
        }

    //方法二: 通过 map.enterSet() 遍历map集合:
//        Set<java.util.Map.Entry<String, Integer>> entries = map.entrySet();//Set集合里存入Entry集合
//        for (java.util.Map.Entry<String, Integer> en:entries) {
//            System.out.println("key:"+en.getKey()+"  "+"value:"+en.getValue());
//        }


    }//main
}
