package com.udemy;

import com.udemy.boardgame.Board;
import com.udemy.boardgame.Position;
import com.udemy.chess.ChessMatch;
import com.udemy.chess.ChessPosition;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}
