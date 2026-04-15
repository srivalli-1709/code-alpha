import java.util.*;
class Stock {
    String name;
    double price;
    Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
    class User {
    double balance = 10000;
    HashMap<String, Integer> portfolio = new HashMap<>();
    void buyStock(Stock stock, int qty) {
        double cost = stock.price * qty;
        if (cost <= balance){
            balance -= cost;
            portfolio.put(stock.name, portfolio.getOrDefault(stock.name, 0) + qty);
            System.out.println("Bought " + qty + " shares of " + stock.name);
        } 
        else {
            System.out.println("Insufficient balance!");
        }
    }

    void sellStock(Stock stock, int qty) {
        if (portfolio.getOrDefault(stock.name, 0) >= qty) {
            balance += stock.price * qty;
            portfolio.put(stock.name, portfolio.get(stock.name) - qty);
            System.out.println("Sold " + qty + " shares of " + stock.name);
        } else {
            System.out.println("Not enough shares!");
        }
    }

    void showPortfolio() {
        System.out.println("\nPortfolio: " + portfolio);
        System.out.println("Balance: " + balance);
    }
}

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stock s1 = new Stock("TCS", 3500);
        Stock s2 = new Stock("Infosys", 1500);
        User user = new User();while (true) {
            System.out.println("\n1. View Market");
            System.out.println("2. Buy");
            System.out.println("3. Sell");
            System.out.println("4. Portfolio");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. TCS - 3500");
                    System.out.println("2. Infosys - 1500");
                    break;
                case 2:
                    System.out.print("Choose stock (1/2): ");
                    int b = sc.nextInt();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    if (b == 1) user.buyStock(s1, qty);
                    else user.buyStock(s2, qty);
                    break;
                case 3:
                    System.out.print("Choose stock (1/2): ");
                    int s = sc.nextInt();
                    System.out.print("Quantity: ");
                    int q = sc.nextInt();
                    if (s == 1) user.sellStock(s1, q);
                    else user.sellStock(s2, q);
                    break;
                case 4:
                    user.showPortfolio();
                    break;
                 case 5:
                    return;
            }
        }
    }
}
