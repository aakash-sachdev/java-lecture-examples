package chapter03;

public class Practice {

        public static void main(String[] args) {
            int x = 10;
            if (x > 5) {
                int y = 20;
                System.out.println(x + y);
            }
            System.out.println(x);

            String original = "hello";
            String reversed = "";

            // Loop through the string starting from the last character
            for (int i = original.length() - 1; i >= 0; i--) {
                reversed += original.charAt(i);  // Append each character in reverse order
            }

            // Output the reversed string
            System.out.println("Reversed string: " + reversed);
        }


}
