package Week5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

class TripleSortingTest {

    @Test
    public void basicTest() {
        List<TripleSorting.Student> students = new ArrayList<>();
        students.add(new TripleSorting.Student(23, 88, "David Goodman"));
        students.add(new TripleSorting.Student(25, 82, "Mark Rose"));
        students.add(new TripleSorting.Student(22, 90, "Jane Doe"));
        students.add(new TripleSorting.Student(25, 90, "Jane Dane"));

        assertEquals("Jane Doe,Jane Dane,David Goodman,Mark Rose",
                TripleSorting.sort(students));
    }

}