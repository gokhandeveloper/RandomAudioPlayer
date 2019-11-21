import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class RandomNumberGEneratorTest {

    private List<String> strings;

    @Before

            public void setup() {
        String s1 = "1x";
        String s2 = "2x";
        String s3 = "3x";
        String s4 = "4x";
        String s5 = "5x";
        String s6 = "6x";
        String s7 = "7x";
        strings = new ArrayList();
        strings.add(s1);
        strings.add(s2);
        strings.add(s3);
        strings.add(s4);
        strings.add(s5);
        strings.add(s6);
        strings.add(s7);

    }

    @Test
    public void  test () {
        assertNotNull(strings);
        assertTrue(strings.contains("1x"));
    }


    @Test
    public void checkExistingNumbersInAList() {

      assertNotEquals("1x",alwaysReturnsAUniqueRandom());
        assertNotEquals("2x",alwaysReturnsAUniqueRandom());
        assertNotEquals("3x",alwaysReturnsAUniqueRandom());
        assertNotEquals("4x",alwaysReturnsAUniqueRandom());


    }
    private String alwaysReturnsAUniqueRandom() {
        List<String> randomNumbers = getAListOfRandomNumbers();
        System.out.println(randomNumbers);
        randomNumbers.removeAll(strings);
        System.out.println(randomNumbers.get(0));
        return randomNumbers.get(0);
    }


    private List<String> getAListOfRandomNumbers() {
        List<String> randomNumbers= new ArrayList();
        for(int i=0; i<=1000; i++) {
            String getRandom = getRandomNumberInts(1,4);
            randomNumbers.add(getRandom);
        }
        return randomNumbers;


    }
    public static String getRandomNumberInts(int min, int max){
        Random random = new Random();
        int x = random.ints(min,(max+1)).findFirst().getAsInt();
        return String.valueOf(x);
    }

}
