/**
 * Author: komiloff.doniyor2505@gmail.com
 * Date: 10/30/2026
 * Time: 3:01 PM
 * Project Name: MyProject
 */
import java.util.ArrayList;
public class MyTickets {

    public static void showTickets(ArrayList<Tickets> tickets) {

        System.out.println("==== MENING CHIPTALARIM ====");

        if (tickets.isEmpty()) {
            System.out.println("Sizda hali chipta yoq!");
            return;

        }
        for (int i = 0; i < tickets.size(); i++) {

            Tickets ticket = tickets.get(i);

            System.out.println("Chipta: " + (i + 1));
            System.out.println("Qayerdan: " + ticket.from);
            System.out.println("Qayerga: " + ticket.to);
            System.out.println("Narxi: " + ticket.price + " so'm");

            System.out.println("=========================================");

        }
    }
}
