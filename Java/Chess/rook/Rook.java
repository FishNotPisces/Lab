package Chess.rook;

import Chess.Chessboard;

public class Rook extends Chessboard{

    public Rook(String initialSquare) {
        this.initialSquare = initialSquare.toLowerCase();
    }

    public boolean isRookReachableSquare(String new_square) {
        boolean isReachable = false;
        if (isChessValidSquare(new_square)) {
            if (
                new_square.toLowerCase().charAt(0) == initialSquare.charAt(0)
                || new_square.toLowerCase().charAt(1) == initialSquare.charAt(1)
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
        if (isRookReachableSquare(new_square)) {
            initialSquare = new_square.toLowerCase();
        }
        else {
            System.out.println(":: [ " + new_square + " ] is NOT reachable");
        }
    }

    public String toString() {
        return "rook in " + initialSquare;
    }

    private String initialSquare;
}
