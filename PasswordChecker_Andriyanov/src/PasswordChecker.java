import java.util.HashMap;
import java.util.Map;
public class PasswordChecker {
    String yourPass;
    Map<Character, Integer> repetitions = new HashMap<>();
    private Integer minLength = null;
    private Integer maxRepeats = null;

    int minSym;
    int maxRepts;
    int setMinLength(int setMinLgth){
        if (setMinLgth > 0){
            minSym = setMinLgth;
        } else {throw new IllegalArgumentException("Минимальная длина не может быть отрицательной (передано: " + setMinLgth + ")");
        }
        return minSym;
    }
    int setMaxRepeats(int setMaxRepts) throws IllegalArgumentException{
    this.maxRepts = maxRepts;
    if (setMaxRepts <= 0){
    }
    return maxRepts;
    }
    int currentRepeatCount = 1;
    boolean verify(String yourPass){
        this.yourPass = yourPass;
        if (minLength == null || maxRepeats == null) {
            throw new IllegalStateException("Не заданы критерии проверки пароля. Вызовите setMinLength() и setMaxRepeats().");
        }
        if (yourPass.length() < minLength) {
            return false;}
    for (int i = 1; i < yourPass.length(); i++) {
        char currentChar = yourPass.charAt(i);
        char previousChar = yourPass.charAt(i - 1);

        if (currentChar == previousChar) {
            currentRepeatCount++;
            if (currentRepeatCount > maxRepts) {
                return false;
            }
        } else {
            currentRepeatCount = 1;
        }
    }
        return true;
}}
