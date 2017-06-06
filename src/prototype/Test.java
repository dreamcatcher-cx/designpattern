package prototype;

/**
 * Created by chengxiao on 2017/3/3.
 */
public class Test {
    public static void main(String []args) throws CloneNotSupportedException {
        Person friend = new Person();
        friend.setName("陆小凤");
        friend.setAge(20);
        Person newPerson = new Person();
        newPerson.setName("西门吹雪");
        newPerson.setAge(18);
        newPerson.setFriend(friend);
        Person newPerson2 = (Person) newPerson.clone();
        newPerson2.setAge(99);

        newPerson2.getFriend().setName("张三丰");
        System.out.println(newPerson);
        System.out.println(newPerson2);
        System.out.println(newPerson.getAge());
        System.out.println(newPerson2.getAge());
        System.out.println(newPerson.getFriend().getName());
        System.out.println(newPerson2.getFriend().getName());
    }
}
