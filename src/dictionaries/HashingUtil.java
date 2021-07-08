package dictionaries;

public class HashingUtil {
    public static long hash(String input) {
        long hash = 7;
        int hashPrime = 11;
        for (char character : input.toCharArray()) {
            hash = hash * hashPrime + (character - 'a');
        }
        return hash;
    }
}
