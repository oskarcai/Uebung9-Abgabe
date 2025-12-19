package h1;

// Importieren aus Java-Klassen
import java.util.ArrayList;

public class PrioListe {

    // Objektattribut/Instanzvariable (Eigenschaft):
    public ArrayList<Patient> myList = new ArrayList<>();

    // Konstruktor:
    // leerer Konstruktor ist default

    // Methoden (Fähigkeiten):
    public void addPatient(Patient p) {
        if(myList.isEmpty()) {  // <=> myList.size() == 0
            myList.add(p);
        } else {
            for(int i = 0; i < myList.size(); i++) {
                // Vergleiche Priorität des neuen Patienten mit der an Position i
                if(p.prio < myList.get(i).prio) {
                    myList.add(i, p);
                    return;     // Patient p eingefügt -> Schleife abbrechen
                }
            }
            // Falls keine kleinere Prio gefunden wurde: hinten anhängen
            myList.add(p);
        }
    }

    public Patient getNextPatient() {
        if(myList.isEmpty()) {  // exception vermeiden -> falls ArrayList myList leer ist
            return null;
        }
            return myList.remove(0);    // gibt sofort das Element zurück, das an Index 0 der Liste entfernt wird
    }

    public int getPosition(Patient p) {
        if(myList.contains(p)) {
            return myList.indexOf(p);   // auch nur return myList.indexOf(p) möglich
        } else {                        // return -1 ist default, wenn p
            return -1;                  // nicht in myList existiert
        }
    }

}