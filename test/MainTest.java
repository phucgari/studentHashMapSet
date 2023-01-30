import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Map<Integer,Student> map=new HashMap<>();
    @BeforeEach
    void init(){
        Main.generateStudents(map);
    }
    @Test
    void testGeneratorUsingToString(){
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Ha",22, "HN");
        String result =map.get(1).toString();
        String expected=student1.toString();
        assertEquals(expected,result);

        result =map.get(2).toString();
        expected=student2.toString();
        assertEquals(expected,result);

        result =map.get(3).toString();
        expected=student3.toString();
        assertEquals(expected,result);

        result =map.get(4).toString();
        expected=student1.toString();
        assertEquals(expected,result);
    }
}