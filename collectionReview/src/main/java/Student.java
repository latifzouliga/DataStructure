public class Student {

    String name;
    int id;

    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + id +
                '}';
    }
}
