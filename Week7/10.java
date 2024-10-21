//Task10 random
public class Main{
    public static void main(String[] args){
        System.out.println("randon"+getRandomLowerCaseLetter());
        System.out.println("randon"+getRandomUpperCaseLetter());
    }
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }
}
