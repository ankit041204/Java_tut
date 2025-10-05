// Step 1: Create an interface
interface ChessPiece {
    void move();   // abstract method (every piece moves differently)
}

// Step 2: Classes implement the interface

class King implements ChessPiece {
    public void move() {
        System.out.println("King moves one step in any direction");
    }
}

class Queen implements ChessPiece {
    public void move() {
        System.out.println("Queen moves in any direction any number of steps");
    }
}

class Rook implements ChessPiece {
    public void move() {
        System.out.println("Rook moves straight horizontally or vertically");
    }
}

class Pawn implements ChessPiece {
    public void move() {
        System.out.println("Pawn moves one step forward");
    }
}

// Step 3: Main class
public class ChessGame {
    public static void main(String[] args) {
        ChessPiece king = new King();
        ChessPiece queen = new Queen();
        ChessPiece rook = new Rook();
        ChessPiece pawn = new Pawn();

        king.move();
        queen.move();
        rook.move();
        pawn.move();
    }
}
