package zlj.study.juc.blockququea.priority;

/**
 * @author zoulinjun
 * @title: Person
 * @projectName java_jichu
 * @description: TODO
 * @date 2021/2/9 17:27
 */
public class Person {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }


}
