import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        // The size of the game window is exact same as the background picture size
        // Size in pixels        
        int boardWidth = 340;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird Project Java");
        
        frame.setSize(boardWidth, boardHeight);

        // This places the window relative to our screen
        frame.setLocationRelativeTo(null);
        // The user can not resize the window
        frame.setResizable(false);
        // When the user clicks the close button, the program terminates
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}
