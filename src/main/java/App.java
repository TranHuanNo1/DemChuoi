import java.util.Scanner;

public class App {
    public class StringExample1 {
        public static final char SPACE = ' ';
        public static final char TAB = 't';
        public static final char BREAK_LINE = 'n';
        
        public static void main(String[] args) {
            String str = "You Only Live Once. But if You do it right. once is Enough";
            System.out.print("Số từ của chuỗi đã cho là: " + countWords(str));
        }

        public static int countWords(String input) {
            if (input == null) {
                return -1;
            }
            int count = 0;
            int size = input.length();
            boolean notCounted = true;
            for (int i = 0; i < size; i++) {
                if (input.charAt(i) != SPACE && input.charAt(i) != TAB && input.charAt(i) != BREAK_LINE) {
                    if (notCounted) {
                        count++;
                        notCounted = false;
                    }
                } else {
                    notCounted = true;
                }
            }
            return count;
        }
    }
}

