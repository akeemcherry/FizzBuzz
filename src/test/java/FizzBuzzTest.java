import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    FizzBuzz fizzBuzzer = new FizzBuzz();

    @Test
    public void TestFizzBuzzThree() {
        String actual = fizzBuzzer.fizzBuzz(3);
        String expected = "Fizz";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestFizzBuzzFive() {
        String actual = fizzBuzzer.fizzBuzz(5);
        String expected = "Buzz";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestFizzBuzzFifteen() {
        String actual = fizzBuzzer.fizzBuzz(15);
        String expected = "FizzBuzz";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestFizzBuzzNineteen() {
        String actual = fizzBuzzer.fizzBuzz(19);
        String expected = "19";
        Assert.assertEquals(expected, actual);
    }
}
