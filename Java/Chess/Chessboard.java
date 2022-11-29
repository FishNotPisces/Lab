package Chess;

public class Chessboard {
    public Chessboard() {}

    public boolean isChessValidSquare(String chess_square) {
        boolean isValidSquare = false;
        if (chess_square.toLowerCase().charAt(0) >= 'a' 
            && chess_square.toLowerCase().charAt(0) <= 'h'
            && chess_square.charAt(1)-48 >= 1
            && chess_square.charAt(1)-48 <= 8
            && chess_square.length() == 2)
        {
            isValidSquare = true;
        }
        
        return isValidSquare;
    }
}
