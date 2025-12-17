package h2;

public class Passenger {
    // Objektattribute/Instanzvariablen (Eigenschaften):
    public String name;
    public int planned;
    public int visited;
    public boolean ticket;

    // Konstruktor:
    public Passenger(String name, int planned, boolean ticket) {
        this.name = name;
        this.planned = planned;
        visited = 0;
        this.ticket = ticket;
    }

    // Methoden:

    /*
    // Setter (falls Objektattribute private):

    public void increaseVisited() {
        this.visited++;
    }

    // Getter (falls Objektattribute private):
    public String getName() {
        return name;
    }
    public int getPlanned() {
        return planned;
    }
    public int getVisited() {
        return visited;
    }
    public boolean getTicket() {
        return ticket;
    }
    */

}
