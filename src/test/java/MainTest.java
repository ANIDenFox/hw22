import static org.junit.Assert.assertEquals;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void testTask1Zero() {
        assertEquals("Помилка", Main.task1(0));
    }

    @Test
    public void testTask1() {
        assertEquals("Перша декада", Main.task1(3));
        assertEquals("Друга декада", Main.task1(14));
        assertEquals("Третя декада", Main.task1(26));
        assertEquals("Помилка", Main.task1(35));
    }
    @Test
    public void testTask1EdgeCases() {
        assertEquals("Помилка", Main.task1(-1));
        assertEquals("Помилка", Main.task1(0));
        assertEquals("Помилка", Main.task1(32));
    }

    @Test
    public void testTask2() {
        assertEquals("It`s winter", Main.task2(1));
        assertEquals("It`s winter", Main.task2(2));
        assertEquals("It`s winter", Main.task2(12));
        assertEquals("It`s spring", Main.task2(3));
        assertEquals("It`s summer", Main.task2(7));
        assertEquals("It`s autumn", Main.task2(9));
        assertEquals("error", Main.task2(15));
    }
    @Test
    public void testTask2EdgeCases() {
        assertEquals("error", Main.task2(0));
        assertEquals("error", Main.task2(13));
    }
    @Test
    public void testTask3() {
        assertEquals("Yes", Main.task3("abcde"));
        assertEquals("No", Main.task3("bcde"));
    }
    @Test
    public void testTask3EdgeCases() {
        assertEquals("Empty string", Main.task3(""));
        assertEquals("Yes", Main.task3("abc"));
    }

    @Test
    public void testTask4() {
        assertEquals("Yes", Main.task4("12345"));
        assertEquals("No", Main.task4("67890"));
    }
    @Test
    public void testTask4EdgeCases() {
        assertEquals("Empty string", Main.task4(""));
        assertEquals("No", Main.task4("abc"));
    }


    @Test
    public void testTask5() {
        assertEquals("Сума чисел: 6", Main.task5(123));
        assertEquals("Error", Main.task5(12));
    }
    @Test
    public void testTask5EdgeCases() {
        assertEquals("Error", Main.task5(1000));
        assertEquals("Error", Main.task5(99));
    }

    @Test
    public void testTask6() {
        assertEquals("No", Main.task6(784321));
        assertEquals("No", Main.task6(123456));
        assertEquals("Error", Main.task6(0));
    }
    @Test
    public void testTask6EdgeCases() {
        assertEquals("Error", Main.task6(99999));
        assertEquals("Error", Main.task6(1000000));
    }
    @Test
    public void testFibonacci() {
        assertEquals(144, Main.fibonacci(12));
        assertEquals(0, Main.fibonacci(0));
        assertEquals(1, Main.fibonacci(1));
    }
    @Test
    public void testFibonacciEdgeCases() {
        assertEquals(-1, Main.fibonacci(-1));
    }
}
