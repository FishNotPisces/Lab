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
            board.printTurn();
            do {
                pos = in.nextByte();
            }while(!board.isPosEmpty(pos));
            board.getNextPos(pos);
            board.printBoard();
            if (board.isLastTurn()) {
                endgame = true;
                System.out.println("It's a tie");
            }
            if (board.doWeHaveWinner()) {
                endgame = true;
                board.printWinner();
            } 
            
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
        for (byte i=0; i<9; i+=3) {
            System.out.println("\n" + this.getCharAtPos(i) + " | " + this.getCharAtPos((byte)(i+1)) + " | " + this.getCharAtPos((byte)(i+2)));
            if (i==0 || i==3) System.out.print("---------");
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
    
    public void printTurn() {
        System.out.println("Turn: Player " + (turn ? 2 : 1));
    }

    public void getNextPos(byte pos) {
        this.values[pos-1] = (byte)(turn ? 2 : 1);
        turn = !turn;
        turnCount++;
    }

    public boolean isLastTurn() {
        return turnCount > 9;
    }

    public boolean isPosEmpty(byte pos) {
        return this.values[pos-1] != 1 && this.values[pos-1] != 2;
    }

    public boolean doWeHaveWinner() {
        if (turnCount < 5) return false;

        if (values[0] != 0 && (values[1] == values[0] && values[1] == values[2] || values[3] == values[0] && values[3] == values[6])) {
            return true;
        }
        if (values[4] != 0 && (values[4] == values[3] && values[4] == values[5] || values[4] == values[1] && values[4] == values[7])) {
            return true;
        }
        if (values[8] != 0 && (values[7] == values[6] && values[7] == values[8] || values[5] == values[2] && values[5] == values[8])) {
            return true;
        }

        if (values[4] != 0 && (values[0] == values[4] && values[4] == values[8] || values[2] == values[4] && values[4] == values[6])) {
            return true;
        }

        return false;
    }

    public void printWinner() {
        if (doWeHaveWinner() || turnCount < 9) {
            System.out.println("The winner is: " + (turn ? 1 : 2));
        }
    }
    
    private char getCharAtPos(byte pos) {
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