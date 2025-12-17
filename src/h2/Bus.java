package h2;

// Importieren aus Java-Klassen:
import java.util.ArrayList;
import java.util.Arrays;

public class Bus {
    // Objektattribut/Instanzvariable (Eigenschaft):
    public ArrayList<Passenger> passengers;

    // Konstruktor:
    public Bus() {
        passengers = new ArrayList<>();
    }

    // Methoden (Fähigkeiten):
    public void enterBus(Passenger p) {
        passengers.add(p);  // Passenger p an das Ende der Liste passengers anfügen
    }

    private void exitBus() {
        for(int i = passengers.size()-1; i >=0; i--) {  // von hinten durch die Liste gehen,
                                                        // damit beim Entfernen keine Elemente übersprungen werden
                                                        // durch Indexverschiebung
            if (passengers.get(i).planned == passengers.get(i).visited) {
                passengers.remove(i);   // Passenger-Objekt an Index i entfernen, wenn value == visited
            }
        }
    }

    public void nextStop(Passenger[] boarding) {
        for(int i = 0; i < passengers.size(); i++) {
            passengers.get(i).visited++;               // den Wert visited um 1 erhöhen
        }
        exitBus();  // Methode exitBus() ausführen
        for(int i = 0; i < boarding.length; i++) {  // alle Passenger-Objekte aus dem Array boarding
            passengers.add(boarding[i]);            // an die Liste passengers anfügen
        }
    }

    public void nextStop() {    // Methode nextStop() überladen
        for(int i = 0; i < passengers.size(); i++) {
            passengers.get(i).visited++;
        }
        exitBus();
    }

    public ArrayList<Passenger> findPassengersWithoutTickets() {
        ArrayList<Passenger> removed_passengers = new ArrayList<>();

        for(int i = passengers.size()-1; i >= 0; i--) { // von hinten durch die Liste gehen,
                                                        // damit beim Entfernen keine Elemente übersprungen werden
                                                        // durch Indexverschiebung
            if(passengers.get(i).ticket == false) {
                removed_passengers.add(0, passengers.get(i));
                passengers.remove(i);
            }
        }
        return removed_passengers;
    }

    public void transferPassengers(Bus otherBus, String[] passengerNames) {
        for(int i = passengers.size()-1; i >= 0; i--) {
            if(Arrays.asList(passengerNames) .contains(passengers.get(i).name)) {
                otherBus.passengers.add(0, passengers.get(i));
                passengers.remove(i);
            }
        }
    }

}
