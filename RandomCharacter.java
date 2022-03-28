/**
 * RandomCharacter
 */
public class RandomCharacter {
    /**
     * getRandomLowerCaseLetter()
     */
    public char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }
    
    /**
     * getRandomUpperCaseLetter()
     */
    public char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    /**
     * getRandomDigitCharacter()
     */
    public char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    /**
     * getRandomCharacter()
     */
    public char getRandomCharacter(char min, char max) {

        return (char) ((Math.random() * (max - min + 1))+ min);

    }

    public boolean checkPrime(){
        int n = 0;
        if (n <= 1){
            return false;
        }
        for (int i =2; i<Math.sqrt(n);i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        RandomCharacter rand = new RandomCharacter();
        System.out.println("Random Lower Case Letter (a to z): ");
        for (int i = 0; i < 15; i++){
            System.out.print(rand.getRandomLowerCaseLetter());
        }

        System.out.println("\nRandom Upper Case Letter (A to Z): ");
        for (int i = 0; i < 15; i++){
            System.out.print(rand.getRandomUpperCaseLetter());
        }

        System.out.println("\nRandom Digit Character (0 to 9): ");
        for (int i = 0; i < 15; i++){
            System.out.print(rand.getRandomDigitCharacter());
        }
    }
}