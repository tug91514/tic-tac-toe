/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JimZa
 */
public class TicTacToeTest {
    
    public TicTacToeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class TicTacToe.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TicTacToe.main(args);
        
        
    }

    /**
     * Test of createboard method, of class TicTacToe.
     */
    @Test
    public void testCreateboard() {
        System.out.println("* TicTacToeTest: testCreateboard()");
        char[][] expResult = new char [3][3];
        for (int row =0;row < expResult.length; row++){
        for(int column =0; column< expResult[row].length;column++){
            expResult[row][column]= 'n';}}
        char[][] result = TicTacToe.createboard();
        assertArrayEquals(expResult, result);
        
    }//end test createboard

    /**
     * Test of currentplayer method, of class TicTacToe.
     */
    @Test
    public void testCurrentplayer() {
        System.out.println("currentplayer");
        char player = 'X';
        char expResult = 'X';
        char result = TicTacToe.currentplayer(player);
        assertEquals(expResult, result);
       
    }
    
    /**
     * Test of currentplayer2 method, of class TicTacToe.
     */
    @Test
    public void testCurrentplayer2() {
        System.out.println("currentplayer2");
        char player = 'O';
        char expResult = 'O';
        char result = TicTacToe.currentplayer(player);
        assertEquals(expResult, result);
       
    }


    /**
     * Test of changeplayer method, of class TicTacToe.
     */
    @Test
    public void testChangeplayer() {
        System.out.println("changeplayer");
        char player = 'X';
        char expResult = 'O';
        char result = TicTacToe.changeplayer(player);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of makemove method, of class TicTacToe.
     */
    @Test
    public void testMakemove() {
        System.out.println("makemove");
        char player = 'X';
        char[][] board = new char [][]{
        {'n','n','n'},
        {'n','n','n'},
        {'n','n','n'}
        };

        int row = 1;
        int column = 1;
        char[][] expResult = new char [][]{
        {'n','n','n'},
        {'n','X','n'},
        {'n','n','n'}
        };
        char[][] result = TicTacToe.makemove(player, board, row, column);
        assertArrayEquals(expResult, result);
        
        
       
    }
    
        /**
     * Test of makemove2 method, of class TicTacToe.
     */
    @Test
    public void testMakemove2() {
        System.out.println("makemove2");
        char player = 'O';
        char[][] board = new char [][]{
        {'n','n','n'},
        {'n','X','n'},
        {'n','n','n'}
        };

        int row = 0;
        int column = 0;
        char[][] expResult = new char [][]{
        {'O','n','n'},
        {'n','X','n'},
        {'n','n','n'}
        };
        char[][] result = TicTacToe.makemove(player, board, row, column);
        assertArrayEquals(expResult, result);
        
        
       
    }

    /**
     * Test of spaceinuse method, of class TicTacToe.
     */
    @Test
    public void testSpaceinuse() {
        System.out.println("spaceinuse");
        char[][] board = new char [][]{
        {'n','n','n'},
        {'n','n','n'},
        {'n','n','n'}
        };

        int row = 0;
        int column = 0;
        boolean expResult = false;
        boolean result = TicTacToe.spaceinuse(board, row, column);
        assertEquals(expResult, result);
        
    }
    
}
