package circularlinkedlist.onlineticketreservationsystem;

public class TicketReservationSystem {
    private Ticket head; // Head of the circular linked list
    private int ticketCount; // Counter to keep track of total tickets

    // Constructor
    public TicketReservationSystem() {
        head = null;
        ticketCount = 0;
    }

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(int ticketID, String customerName, String movieName, String seatNumber) {
        Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber);
        if (head == null) {
            head = newTicket;
            newTicket.next = head; // Circular reference
        } else {
            Ticket temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head; // Maintain circular structure
        }
        ticketCount++;
        System.out.println("Ticket added successfully. Ticket ID: " + ticketID);
    }

    // Remove a ticket by Ticket ID
    public void removeTicketByID(int ticketID) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket temp = head;
        Ticket prev = null;

        // If the ticket to be removed is the head node
        if (temp.ticketID == ticketID) {
            if (temp.next == head) { // Only one ticket in the list
                head = null;
            } else {
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
            ticketCount--;
            System.out.println("Ticket with ID " + ticketID + " removed.");
            return;
        }

        // Traverse the circular list to find the ticket by Ticket ID
        prev = temp;
        temp = temp.next;
        while (temp != head) {
            if (temp.ticketID == ticketID) {
                prev.next = temp.next;
                ticketCount--;
                System.out.println("Ticket with ID " + ticketID + " removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        }
        System.out.println("Ticket with ID " + ticketID + " not found.");
    }

    // Display all tickets in the list
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets in the system.");
            return;
        }

        Ticket temp = head;
        System.out.println("Current Tickets:");
        do {
            System.out.println("Ticket ID: " + temp.ticketID +
                    ", Customer: " + temp.customerName +
                    ", Movie: " + temp.movieName +
                    ", Seat: " + temp.seatNumber +
                    ", Booking Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head); // Loop until we return to the head
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String query) {
        if (head == null) {
            System.out.println("No tickets in the system.");
            return;
        }

        Ticket temp = head;
        boolean found = false;
        System.out.println("Search Results for \"" + query + "\":");
        do {
            if (temp.customerName.equalsIgnoreCase(query) || temp.movieName.equalsIgnoreCase(query)) {
                System.out.println("Ticket ID: " + temp.ticketID +
                        ", Customer: " + temp.customerName +
                        ", Movie: " + temp.movieName +
                        ", Seat: " + temp.seatNumber +
                        ", Booking Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tickets found for the query: " + query);
        }
    }

    // Calculate the total number of booked tickets
    public void totalTickets() {
        System.out.println("Total Tickets Booked: " + ticketCount);
    }
}
