package chapter3;

import javax.xml.ws.BindingType;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet的使用
 * Comparator：实现定制比较
 */
public class Demo13 {

    public static void main(String[] args) {

        //创建集合，并指定比较规则
        TreeSet<Person> persons = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int n1 = o1.getAge() - o2.getAge();
                int n2 = o1.getName().compareTo(o2.getName());
                return n1 == 0 ? n2 : n1;
            }
        });

        //1.添加元素
        Person p1 = new Person("Jay",18);
        Person p2 = new Person("Stephen",34);
        Person p3 = new Person("Kobe",42);

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        System.out.println(persons.size());
        System.out.println(persons);
    }
}
