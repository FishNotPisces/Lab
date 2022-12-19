package Tris;

import java.util.Scanner;

public class Tris {
    public static void main(String[] args) {
        boolean endgame = false;
        Board board = new Board();
        Scanner in = new Scanner(System.in);

        board.printBoard();
        while (!endgame) {
            byte pos;
            do {
                pos = in.nextByte();
            }while(!board.isPosEmpty(pos));
            board.getNextPos(pos);
            board.printBoard();
            if (board.isLastTurn()) endgame = true; 
            
        }
        in.close();
    }

}

class Board {
    public Board() {
        values = new byte[9];
        turn = false;
        turnCount = 1;
    }

    public void printBoard() {
        for (int i=0; i<9; i+=3) {
            System.out.println("\n" + this.getCharAtPos(i) + " | " + this.getCharAtPos(i+1) + " | " + this.getCharAtPos(i+2));
            if (i==0 || i==3) System.out.print("---------");
        }

        System.out.println("Turn: Player " + (turn ? 2 : 1));
    }

    public void getNextPos(int pos) {
        this.values[pos-1] = (byte)(turn ? 2 : 1);
        turn = !turn;
        turnCount++;
    }

    public boolean isLastTurn() {
        return turnCount > 9;
    }

    public boolean isPosEmpty(int pos) {
        return this.values[pos-1] != 1 && this.values[pos-1] != 2;
    }

    public void winCon() {
        if (turnCount < 5) return;
        
    }
    
    private char getCharAtPos(int pos) {
        switch(this.values[pos]) {
            case 1:
                return 'x';
            case 2:
                return 'o';
            default:
                return ' ';
        }
    }
    
    
    private byte[] values;
    private boolean turn;
    private byte turnCount;
}