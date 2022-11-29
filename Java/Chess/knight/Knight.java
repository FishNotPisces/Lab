package Chess.knight;

import Chess.Chessboard;
import java.lang.Math;

public class Knight extends Chessboard {
    public Knight(String initialSquare) {
        this.initialSquare = initialSquare.toLowerCase();
    }

    public boolean isKnightReachableSquare(String new_square) {
        boolean isReachable = false;
        if (isChessValidSquare(new_square)) {
            if (
                (Math.abs(new_square.toLowerCase().charAt(0) - initialSquare.charAt(0)) == 2
                && Math.abs(new_square.toLowerCase().charAt(1) - initialSquare.charAt(1)) == 1)
                || (Math.abs(new_square.toLowerCase().charAt(0) - initialSquare.charAt(0)) == 1
                && Math.abs(new_square.toLowerCase().charAt(1) - initialSquare.charAt(1)) == 2)
            )
            {
                isReachable = true;
            }
        }
        else {
            System.out.println(":: NOT a valid square");
        }
        
        return isReachable;
    }

    public void moveToSquare(String new_square) {
        if (isKnightReachableSquare(new_square)) {
            initialSquare = new_square.toLowerCase();
        }
        else {
            System.out.println(":: [ " + new_square + " ] is NOT reachable");
        }
    }

    public String toString() {
        return "knight in " + initialSquare;
    }

    private String initialSquare;
}
