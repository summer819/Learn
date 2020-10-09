package Learn;
// 这是一个 javaBean (构造器 + Getter&Setter )
public class Person {
    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Json{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }














}  // Json

