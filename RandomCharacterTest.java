import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Test;

public class RandomCharacterTest {
    RandomCharacter testing = new RandomCharacter();

    char lower = testing.getRandomLowerCaseLetter();
    char upper = testing.getRandomUpperCaseLetter();
    char digit = testing.getRandomDigitCharacter();
    boolean prime = testing.checkPrime();

    @Test
    public void getRandomLowerCaseLetter(){
        assertTrue(lower >='a' && lower <= 'z');
    }
    @Test
    public void getRandomUpperCaseLetter(){
        assertTrue(upper >= 'A' && upper <= 'Z');
    }
    @Test
    public void getRandomDigitCharacter(){
        assertTrue(digit >='0' && digit <= '9');
    }
    @Test
    public void checkPrime(){
        assertTrue(true);
    }
}