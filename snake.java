import java.util.Scanner; 
public class Main
{
    public static int width = 10;
    public static int height = 10;
	public static char[][] field = new char[height][width];

	public static int snakeX = 1;
	public static int snakeY = 1;
	public static int appleX = 8;
	public static int appleY = 7;


    public static void drawField(){
        for(int i = 0; i < height; i++){
		    for(int j = 0; j < width; j++){
		        System.out.print(field[i][j]);
		        System.out.print(" ");
		    }
		    System.out.println("");
		}        
    }
    public static void drawApple(){
		field[appleY][appleX] = 'O';
    }

    public static void clearField(){
        for(int i = 0; i < height; i++){
		    for(int j = 0; j < width; j++){
		        field[i][j] = '.';
		    }
		}
		drawApple();
    }
	public static void main(String[] args) {
		clearField();
		field[snakeY][snakeX-1] = '#';
		field[snakeY][snakeX] = '>';
		
		field[appleY][appleX] = 'O';
		drawField();
		while(true){
    		Scanner sc = new Scanner(System.in);
    		char dir = sc.next().charAt(0);
    		if(dir == 'd'){
        		clearField();
    		    snakeX++;
        		field[snakeY][snakeX-1] = '#';
        		field[snakeY][snakeX] = '>';
    		}
    		if(dir == 's'){
        		clearField();
    		    snakeY++;
        		field[snakeY-1][snakeX] = '#';
        		field[snakeY][snakeX] = 'v';
    		}
    		drawField();
		}
	}
}