package com.udemy;

import com.udemy.boardgame.Board;
import com.udemy.boardgame.Position;
import com.udemy.chess.ChessMatch;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}
