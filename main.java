public class TaskSheet113 {
    public static void main(String[] args) {
        int check_number = 10;
        String message;

        for (int i = 0; i <= check_messages; i++) {
            message = (i % 2 == 0) ? i + " is even number" : i + " is odd number";
            System.out.println(message);
        }
    }
}

