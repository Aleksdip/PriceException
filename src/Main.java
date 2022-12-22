import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Price [] prices = new Price[2];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter product 1 name, store name, the price ");
        prices [0] = new Price(in.next(), in.next(), in.next());
        System.out.println("Enter product 2 name, store name, the price ");
        prices [1] = new Price(in.next(), in.next(), in.next());

        Comparator <Price> price = Comparator.comparing(Price :: getShop);
        Arrays.sort(prices, price);

        System.out.println("Enter store name for product information");
        String store = in.next();

        if (store.equals(prices[0].shop))
            System.out.println(prices[0]);
        else if (store.equals(prices[1].shop))
            System.out.println(prices[1]);
        else try {
                throw new Exception("No find this store");
            }
            catch (Exception e) {
                System.out.println("Exception:");
                System.out.println(e.getMessage());
            }
    }
}