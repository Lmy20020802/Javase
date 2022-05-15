/**
 * @ClassName Book
 * @Description TODO
 * @Author lmy
 * @Date 2022/5/6 10:47
 **/
public class Book<T> {
    String name;
    Integer age;

    public Book() {

    }

    public Book(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void show(T t){
        System.out.println(t);
    }
}
