import java.util.*;

public class BusReservationSystem {

    public static void main(String[] args) {

        // Creating LinkedList as Queue
        LinkedList<String> queue = new LinkedList<>();

        // Add passenger using offer()
        queue.offer("Rahul");
        queue.offer("Priya");

        // Add VIP passenger at beginning
        queue.offerFirst("VIP-Amit");

        // Add regular passenger at end
        queue.offerLast("Sneha");

        // Display complete passenger list
        System.out.println("Passenger List: " + queue);

        // Display passenger at front using peek()
        System.out.println("Front Passenger (peek): " + queue.peek());

        // Display first passenger using peekFirst()
        System.out.println("First Passenger (peekFirst): " + queue.peekFirst());

        // Display last passenger using peekLast()
        System.out.println("Last Passenger (peekLast): " + queue.peekLast());
    }
}