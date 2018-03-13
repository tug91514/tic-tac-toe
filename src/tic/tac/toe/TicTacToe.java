/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

/**
 *
 * @author JimZa
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] board = createboard();
        char player = 'X';
       
        
    }//end main
    
    
    public static char[][] createboard(){
    char[][] board  = new char[3][3];
    for (int row =0;row < board.length; row++){
        for(int column =0; column< board[row].length;column++){
            board[row][column]= 'n';
            
        
        }//end for
    
    }//end for
    return board;
    }//end create board
    public static char currentplayer(char player){
        
        return player;
                                                }//end current player
    
    public static char changeplayer(char player){
        if(player == 'X'){
        player = 'O';
    
                         }//end if
        else{
        player = 'X';
                                }//end else if
        return player;
                                                }//end change player
    public static char[][] makemove(char player, char[][] board, int row, int column){
         board[row][column]= player;
         return board;
    
    
    
    
    
        }//end make move
    public static boolean spaceinuse(char[][]board, int row, int column){
        if(board[row][column]=='n'){
    return false;
                                    }//end if
    return true;
        
                                                                        }//end spacein use
}//end tic tac toe
