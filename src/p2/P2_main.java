package p2;

// Import der Array-Klasse:
import java.util.Arrays;

public class P2_main {

    // Objektattribut/Instanzvariable (Eigenschaft):
    public static int[][] grid = new int[3][3]; // -> weil primitiver Datentyp (default-Werte)
                                                // sonst null (für Objekte als Elemente)

    // Main-Methode:
    public static void main(String[] args) {

        grid[0][0] = -1;        // [-1][0][0]
        grid[1][1] = -1;        // [0][-1][0]   3x3-Array -> new int[3][3]
        grid[2][2] = -1;        // [0][0][-1]

        // 3x3 Array Grid zu Beginn:
        System.out.println(Arrays.deepToString(grid));
        printGrid();

        for(int row = 0; row < grid.length; row++) {    // row -> Zeile
            for(int col = 0; col < grid[row].length; col++) {  // column -> Spalte
                if(grid[row][col]== 0) {
                    grid[row][col] = countNeighbors(row, col);
                }
            }
        }

        // 3x3 Array Grid, nachdem die Nachbarn gezählt wurden:
        System.out.println();
        System.out.println(Arrays.deepToString(grid));
        printGrid();
    }

    public static int countNeighbors(int row, int column) {
        int counter = 0;

        // Im 3x3 Array um die übergebene Zelle grid[row][column] suchen:
        for(int i = row-1; i <= row+1; i++) {
            for(int j = column-1; j <= column+1; j++) {
                // Checken, dass man nicht außerhalb des 3x3 Arrays landet:
                if(i >= 0 && i < 3 && j >= 0 && j < 3) {
                    // Anzahl der Nachbarn mit Wert -1 zählen:
                    if(grid[i][j] == -1) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    public static void printGrid() {
        for(int[] i_array : grid) {
            System.out.println(Arrays.toString(i_array));
        }
    }

}
