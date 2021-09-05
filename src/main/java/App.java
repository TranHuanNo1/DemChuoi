import java.util.Scanner;
//        Đếm số từ viết in hoa trong chuỗi
//        Viết in hoa toàn bộ chữ đầu của các từ trong chuỗi đó
//        Chuyển ký tự đầu tiên của chuỗi hoặc ký tự đầu tiên của từ sau dấu chấm là viết in hoa,
//        các chữ con lại viết thường

public class App {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
    public static final char DOT = '.';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("\nNhập vào chuỗi: ");
        message = sc.nextLine();

        int KyTuInHoa = 0;
        for (int i = 0; i < message.length(); i++) {
            // hàm isUpperCase() là hàm dùng để kiểm tra ký tự tại vị trí i
            // có phải là ký tự in hoa hay không.
            if (Character.isUpperCase(message.charAt(i))) {
                KyTuInHoa++;
            }
        }
        char[] charArray = message.toCharArray();
        boolean foundSpace = true;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                if (foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        message = String.valueOf(charArray);
        System.out.println("Trong chuỗi có " + KyTuInHoa + " ký tự in hoa,");
        System.out.println("Chuỗi sau khi đổi: \n" + message);
    }
}
