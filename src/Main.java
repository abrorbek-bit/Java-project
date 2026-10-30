import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tickets> myTickets = new ArrayList<>();

        myTickets.add(new Tickets("Toshkent", "Samarqand", 150000));
        myTickets.add(new Tickets("Buxoro", "Toshkent", 180000));
        System.out.println("===== MENING CHIPTALARIM =====");

        if (myTickets.isEmpty()) {

            System.out.println("Sizda hali chipta mavjud emas!");

        } else {

            for (int i = 0; i < myTickets.size(); i++) {

                Tickets ticket = myTickets.get(i);

                System.out.println("\nChipta: " + (i + 1));
                System.out.println("Qayerdan: " + ticket.from);
                System.out.println("Qayerga: " + ticket.to);
                System.out.println("Narxi: " + ticket.price + " so'm");

                System.out.println("--------------------------");
            }
        }
    }
}

class Ticket {

    String from;
    String to;
    double price;

    public Ticket(String from, String to, double price) {

        this.from = from;
        this.to = to;
        this.price = price;
    }
}


