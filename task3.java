import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("🎉 Welcome! I'm your AI Assistant (type 'exit' to quit)");

        while (true) {
            System.out.print("\nYou: ");
            input = sc.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Bot: It was nice chatting with you. Have a great day! 🎉");
                break;

            } else if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Bot: Hello there! 👋 How can I assist you today?");

            } else if (input.contains("name")) {
                System.out.println("Bot: I'm your friendly Java Chatbot, created to assist you!");

            } else if (input.contains("how are you")) {
                System.out.println("Bot: I'm functioning perfectly! Thanks for asking 😊");

            } else if (input.contains("help")) {
                System.out.println("Bot: I can help with basic questions. Try asking about my name, greetings, or general help!");

            } else if (input.contains("bye")) {
                System.out.println("Bot: Goodbye! Take care 👋");
                break;

            } else {
                System.out.println("Bot: Hmm... I didn't quite get that 🤔. Can you try asking something else?");
            }
        }

        sc.close();
    }
}
