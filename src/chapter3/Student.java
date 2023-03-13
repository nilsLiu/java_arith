package chapter3;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        //1.判断是否是同一对象
        if (this == obj){
            return true;
        }
        //2.判断是否为空
        if (this == null){
            return false;
        }
        //3.判断是否是Student类型
        if (obj instanceof Student){
            Student s = (Student) obj;
            //4.比较属性
            if (this.name.equals(s.getName()) && this.age == s.getAge()){
                return true;
            }
        }
        return false;
    }
}
