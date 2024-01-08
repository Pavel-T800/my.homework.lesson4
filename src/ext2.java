// Создать программу для раскраски шахматной доски с помощью цикла.

public class ext2 {
    public static void main(String[] args) {
        int size = 8;
        String[][] myArray = new String[size][size];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    myArray[i][j] = "W";
                } else {
                    myArray[i][j] = "B";
                }
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// не совсем разобрался в какую строку надо вписать System.out.println("The Chessboard"),
// что б вначале была надпись "The Chessboard", а снизу уже сам массив
