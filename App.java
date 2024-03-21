import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    private final int SIZE = 5;
    private Button[][] board = new Button[SIZE][SIZE];
    private boolean playerXTurn = true;
    
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                Button button = new Button(" ");
                button.setPrefSize(100, 100);
                int finalI = i;
                int finalJ = j;
                button.setOnAction(e -> handleButtonClick(finalI, finalJ, button));
                board[i][j] = button;
                pane.add(button, j, i);
            }
        }
        
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void handleButtonClick(int row, int col, Button button) {
        if (!button.getText().equals(" ")) return;
        button.setText(playerXTurn ? "X" : "O");
        if (checkWin(row, col)) {
            System.out.println("Player " + (playerXTurn ? "X" : "O") + " wins!");
            // Implement a restart game functionality here
        } else {
            playerXTurn = !playerXTurn;
        }
    }
    
    private boolean checkWin(int row, int col) {
        // Implement the logic to check for a win horizontally, vertically, and diagonally
        return false; // Placeholder for compilation
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
