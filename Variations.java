import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
 
public class Variations {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");
        Arrays.sort(input);
 
        StringBuilder builder = new StringBuilder();
 
        for (int i = 0; i < input.length; i++) {
            builder.append(input[i]);
        }
        variation(builder.toString(), n, new StringBuffer());
    }
    static void variation(String input, int depth, StringBuffer output) {
        if (depth == 0) {
            System.out.println(output);
        } else {
            for (int i = 0; i < input.length(); i++) {
                output.append(input.charAt(i));
                variation(input, depth - 1, output);
                output.deleteCharAt(output.length() - 1);
            }
        }
    }
}
