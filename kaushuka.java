import java.util.Stack;

public class kaushuka {
    public static String checkHTMLFormatting(String str) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                int endIndex = str.indexOf('>', i);
                if (endIndex == -1)
                    return str.substring(i); // Unmatched opening tag

                String tag = str.substring(i, endIndex + 1);
                i = endIndex;

                if (tag.startsWith("</")) {
                    if (stack.isEmpty() || !stack.pop().equals(tag.substring(2))) {
                        return tag.substring(1); // Unmatched closing tag
                    }
                } else {
                    stack.push(tag.substring(1));
                }
            }
        }

        return stack.isEmpty() ? "true" : stack.pop();
    }

    public static void main(String[] args) {
        String str1 = "<div><b><p>hello world</p></b></div>";
        System.out.println(checkHTMLFormatting(str1)); // Output: true

        String str2 = "<div><i>hello</i>world</b>";
        System.out.println(checkHTMLFormatting(str2)); // Output: div
    }
}
    

