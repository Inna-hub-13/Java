import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

// My FlappyBird inherites JPannel
public class FlappyBird extends JPanel implements ActionListener, KeyListener{

    int boardWidth = 340;
    int boardHeight = 640;

    // Image stores images
    Image backgrounImg;
    Image birdImg;
    Image topPipeImg;
    Image bottomPipeImg;


    // Pipe
    int pipeX = boardWidth;
    int pipeY = 0;
    int pipeWidth = 64;
    int pipeHeight = 512;

     class Pipe{

        int x = pipeX;
        int y = pipeY;
        int width = pipeWidth;
        int height = pipeHeight;
        Image img;
        boolean passed = false;

        Pipe(Image img){
            this.img = img;
        }
    }

    
    // Bird
    int birdX = boardWidth/8;
    int birdY = boardHeight/4;
    int birdWidth = 44;
    int birdHeight = 34;

    class Bird{

        int x = birdX;
        int y = birdY;
        int width = birdWidth;
        int height = birdHeight;
        Image img;

        Bird(Image img){
            this.img = img;
        }
    }

   

    // Game logic
    Bird bird;
    int velocityY = -5;
    // Every frame the bird will move down 1 pixel
    int gravity = 1;
    int velocityX = -4;

    ArrayList<Pipe> pipes;
    Timer placePipesTimer;
    Random random = new Random();

    Timer gameLoop;

    boolean gameOver = false;

    double score = 0;

    FlappyBird(){

        setPreferredSize(new Dimension(boardWidth, boardHeight));
        // Our JPanel is the one to take in the key events
        setFocusable(true);
        // Checks the three functions
        addKeyListener(this);

        // Loading images
        backgrounImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        birdImg = new ImageIcon(getClass().getResource("./flappybird0.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();

        bird = new Bird(birdImg);
        pipes = new ArrayList<Pipe>();

        // Place pipes timer
        placePipesTimer = new Timer(1500, new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e){
                placePipes();
            }
        });
        placePipesTimer.start();
    

        // Game timer 
        // Time in ms, this referes to the FlappyBird class
        // 60 times per second
        gameLoop = new Timer(1000/60, this);
        gameLoop.start();
    }

    public void placePipes() {

        // Math.random() - 0/1 
        int randomPipeY = (int)(pipeY - pipeHeight/4 - Math.random()*(pipeHeight/2));
        int openingSpace = boardHeight/4;

        Pipe topPipe = new Pipe(topPipeImg);
        pipes.add(topPipe);
        topPipe.y = randomPipeY;


        Pipe bottomPipe = new Pipe(bottomPipeImg);
        bottomPipe.y = topPipe.y + pipeHeight + openingSpace;
        pipes.add(bottomPipe);
    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){

        // Draw the backgroun
        g.drawImage(backgrounImg, 0, 0, boardWidth, boardHeight, null);

        // Draw bird
        g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);

        // Draw pipes
        for(int i = 0; i < pipes.size(); i++){

            Pipe pipe = pipes.get(i);
            g.drawImage(pipe.img, pipe.x, pipe.y, pipe.width, pipe.height, null);
        }

        // Draw score
        
        g.setColor(Color.WHITE);
        if(gameOver){

            g.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
            g.drawString("Game Over: " + String.valueOf((int)score), boardWidth/4, boardHeight/2);
        }
        else{

            g.setFont(new Font("Serif", Font.BOLD, 24));
            g.drawString("Score: " + String.valueOf((int)score), 10, 22);
        }
    }

    public void move(){

        // Bird move
        velocityY += gravity;
        bird.y += velocityY;
        // The bird stays withing the top border of the panel
        bird.y = Math.max(bird.y, 0);

        // Pipes move
        for(int i = 0; i < pipes.size(); i++){

            Pipe pipe = pipes.get(i);
            pipe.x += velocityX;

            // If the bird passes the rigth side of the pipe
            if(!pipe.passed && bird.x > pipe.x + pipe.width){

                pipe.passed = true;
                // Because there are two pipes
                score += 0.5;
            }

            if(collision(bird, pipe))
                gameOver = true;
        }

        if(bird.y > boardHeight){

            gameOver = true;
        }
    }

    public boolean collision(Bird a, Pipe b) {

        return a.x < b.x + b.width &&   //a's top left corner doesn't reach b's top right corner
               a.x + a.width > b.x &&   //a's top right corner passes b's top left corner
               a.y < b.y + b.height &&  //a's top left corner doesn't reach b's bottom left corner
               a.y + a.height > b.y;    //a's bottom left corner passes b's top left corner
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        move();
        repaint();
        if(gameOver){
            placePipesTimer.stop();
            // Stops repainting and updating frames of our game
            gameLoop.stop();
        }
    }

    
    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_SPACE){

            velocityY = -9;
           
        }
        if(e.getKeyCode() == KeyEvent.VK_ENTER){

            if(gameOver){

                bird.y = birdY;
                velocityY = 0;
                pipes.clear();
                score = 0;
                gameOver = false;
                gameLoop.start();
                placePipesTimer.start();
            }
        }
         
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
