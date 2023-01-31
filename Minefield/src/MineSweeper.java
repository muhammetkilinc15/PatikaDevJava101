import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int col;
    Random random = new Random();
    Scanner input = new Scanner(System.in);

    MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void Run() {
        String[][] checkMines = DisplayTheMinesLocationAndReturn();
        String[][] mines = new String[this.row][this.col];
        for (int i = 0; i < mines.length; i++) {
            for (int j = 0; j < mines[0].length; j++) {
                mines[i][j] = "-";
            }
        }
        int i1;
        int i2;
        System.out.println("Welcome to minesfield game ");
        try {
            do {
                do {
                    System.out.print("Enter a row : ");
                    i1 = input.nextInt();
                    System.out.print("Enter a column: ");
                    i2 = input.nextInt();
                } while ((i1 < 0 || i1 >= this.row) || (i2 < 0 || i2 >= this.col));
                if (GameOver(checkMines, i1, i2)) {
                    mines = ReturnTheNumber(checkMines,mines, i1, i2);
                    PrintTheMatrix(mines);
                } else {
                    System.out.println("Game Over :((");
                }
                System.out.println("====================");
            } while (GameOver(checkMines, i1, i2));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String[][] DisplayTheMinesLocationAndReturn() {
        String[][] arr = new String[row][col];
        int minesNumber = (this.row * this.col) / 4;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = "-";
            }
        }
        for (int i = 0; i < minesNumber; i++) {
            int row = random.nextInt(0, this.row);
            int col = random.nextInt(0, this.col);
            arr[row][col] = "*";
        }
        System.out.println("Mayınların konumu");
        for (String[] strings : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();
        }
        System.out.println("==================");
        return arr;
    }

    boolean GameOver(String[][] arr, int row, int col) {
        return !arr[row][col].equals("*");
    }

    String[][] ReturnTheNumber(String[][] minesMatris,String[][] returnMatrix, int row, int column) {

        int count = 0;
        int mineRow = minesMatris.length;
        int mineColumn = minesMatris[0].length;
        if ((row - 1) >= 0 && (column - 1) >= 0 && minesMatris[row - 1][column - 1].equals("*")) {
            count++;
        }
        if ((row - 1) >= 0 && minesMatris[row - 1][column].equals("*")) {
            count++;
        }
        if ((row - 1) >= 0 && (column + 1) < mineColumn && minesMatris[row - 1][column + 1].equals("*")) {
            count++;
        }
        if ((column - 1) >= 0 && minesMatris[row][column - 1].equals("*")) {
            count++;
        }
        if ((column + 1) < mineColumn && minesMatris[row][column + 1].equals("*")) {
            count++;
        }
        if ((column - 1) >= 0 && (row + 1) < mineRow && minesMatris[row + 1][column - 1].equals("*")) {
            count++;
        }
        if ((row + 1) < mineRow && minesMatris[row + 1][column].equals("*")) {
            count++;
        }
        if ((row + 1) < mineRow && (column + 1) < mineColumn && minesMatris[row + 1][column + 1].equals("*")) {
            count++;
        }
        if (minesMatris[row][column].equals("*"))
        {
            returnMatrix[row][column]="*";
        }
        returnMatrix[row][column] = "" + count;
        return returnMatrix;
    }

    void PrintTheMatrix(String[][] mines) {
        for (int i = 0; i < mines.length; i++) {
            for (int j = 0; j < mines[0].length; j++) {
                System.out.print(mines[i][j] + " ");
            }
            System.out.println();
        }
    }
}
