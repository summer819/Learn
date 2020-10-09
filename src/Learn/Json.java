package Learn;

import com.google.gson.Gson;
import org.junit.Test;

//java 和 json的转换 :
public class Json {
    // ************* 1.javaBean & json的转换 *************
    @Test
    public void test1() {
        Person person = new Person("summer", 666);

// ******** 用Gson包中的.toJson()方法,将javaBean转为json(序列化) *********
        Gson gson = new Gson();  //实例化Gson类
        String personToJson = gson.toJson(person);
        System.out.println(personToJson);
// ************* json转为Java对象(反序列化) *************


    }


} //JsonTest
