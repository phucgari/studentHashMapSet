import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void testConstructorGetSet(){
        Student adam=new Student();
        Student eva=new Student("eva",10,"sky");
        assertEquals("eva",eva.getName());
        assertEquals(10,eva.getAge());
        assertEquals("sky",eva.getAddress());

        eva.setName("eva1");
        eva.setAge(20);
        eva.setAddress("skyline");

        assertEquals("eva1",eva.getName());
        assertEquals(20,eva.getAge());
        assertEquals("skyline",eva.getAddress());

        adam.setName("adam");
        adam.setAge(15);
        adam.setAddress("ground");

        assertEquals("adam",adam.getName());
        assertEquals(15,adam.getAge());
        assertEquals("ground",adam.getAddress());
    }
    @Test
    void testToString(){
        Student adam=new Student("adam",20,"sky");
        String result=adam.toString();
        String expected="Student@name=adam,age=20,address=sky";
        assertEquals(result,expected);
    }
}