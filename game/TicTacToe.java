import java.util.Scanner;

/**
 * TicTacToe
 */
public class TicTacToe {
    public static void main(String[] args) {
        char [][]board=new char[3][3];
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                board[r][c]=' ';
            }
        }

        char player='X';
        boolean gameOver=false;

        Scanner scanner=new Scanner(System.in);
        while(!gameOver){
            printBoard(board);
            System.out.println("player "+player+" enter: ");
            int row=scanner.nextInt();
            int col=scanner.nextInt();

            if(board[row][col]==' '){
                board[row][col]=player;
                gameOver=haveWon(board,player);
                if(gameOver){
                    System.out.println("Player "+player+" has won: ");
                }else{
                    //   if(player=='X')
                    //   player='O';
                    //   else
                    //   player='X';
                    player=(player=='X')?'O':'X';
                }


            }else{
                System.out.println("Invalid move. Try again!");
            }
        }
        printBoard(board);
    }
    public static boolean haveWon(char[][]board,char player){
        //check the rows
        for(int r=0;r<board.length;r++){
            if(board[r][0]==player && board[r][1]==player&&board[r][2]==player){
                return true;
            }
        }
        for(int c=0;c<board.length;c++){
            if(board[0][c]==player && board[1][c]==player&&board[2][c]==player){
                return true;
            }
        }
        if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player){
            return true;
        }
        if(board[0][2]==player&&board[1][1]==player&&board[2][0]==player){
            return true;
        }
        return false;

    }
    public static void printBoard(char [][] board){
        System.out.println("______________");
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                System.out.print(board[r][c]+" | ");
            }
            System.out.println();
        }
        System.out.println("______________");
    }

    
}