import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map<Integer,Student> map=new HashMap<>();
        generateStudents(map);
        Set set=map.keySet();
        for (Object key:set) {
            System.out.println(map.get(key));
        }
        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        generateStudents(students);
        for(Student student:students){
            System.out.println(student.toString());
        }
    }

    public static void generateStudents(Map<Integer,Student> map) {
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Ha",22, "HN");
        map.put(1,student1);
        map.put(2,student2);
        map.put(3,student3);
        map.put(4,student1);
    }
    public static void generateStudents(Set<Student> set){
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Ha",22, "HN");
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student1);
    }
}