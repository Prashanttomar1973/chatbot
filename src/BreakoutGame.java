import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BreakoutGame {
    private static final int BOARD_WIDTH = 800;
    private static final int BOARD_HEIGHT = 600;
    private static final int PADDLE_WIDTH = 100;
    private static final int PADDLE_HEIGHT = 20;
    private static final int BALL_SIZE = 20;
    private static final int BRICK_ROWS = 5;
    private static final int BRICK_COLUMNS = 10;
    private static final int BRICK_WIDTH = 75;
    private static final int BRICK_HEIGHT = 30;

    private JFrame frame;
    private JPanel gamePanel;
    private Rectangle paddle;
    private Rectangle ball;
    private int ballDirectionX = 1, ballDirectionY = -1;
    private int ballSpeed = 5;
    private int paddleSpeed = 30;
    private boolean gameOver = false;
    private Rectangle[] bricks;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BreakoutGame::new);
    }

    public BreakoutGame() {
        initGame();
    }

    private void initGame() {
        // Create game window
        frame = new JFrame("Breakout Game");
        frame.setSize(BOARD_WIDTH, BOARD_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        // Create the game panel
        gamePanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawGame(g);
            }
        };
        gamePanel.setBackground(Color.BLACK);
        frame.add(gamePanel);

        // Set up key listener for paddle movement
        gamePanel.setFocusable(true);
        gamePanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                handleKeyPress(e);
            }
        });

        // Initialize game state
        paddle = new Rectangle(BOARD_WIDTH / 2 - PADDLE_WIDTH / 2, BOARD_HEIGHT - PADDLE_HEIGHT - 30, PADDLE_WIDTH, PADDLE_HEIGHT);
        ball = new Rectangle(BOARD_WIDTH / 2 - BALL_SIZE / 2, BOARD_HEIGHT - PADDLE_HEIGHT - BALL_SIZE - 40, BALL_SIZE, BALL_SIZE);
        bricks = new Rectangle[BRICK_ROWS * BRICK_COLUMNS];

        int brickIndex = 0;
        for (int row = 0; row < BRICK_ROWS; row++) {
            for (int col = 0; col < BRICK_COLUMNS; col++) {
                bricks[brickIndex] = new Rectangle(col * BRICK_WIDTH + 20, row * BRICK_HEIGHT + 50, BRICK_WIDTH, BRICK_HEIGHT);
                brickIndex++;
            }
        }

        // Set up game timer to control the game loop
        Timer gameTimer = new Timer(10, e -> gameLoop());
        gameTimer.start();

        frame.setVisible(true);
    }

    private void handleKeyPress(KeyEvent e) {
        if (gameOver) return;

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (paddle.x > 0) paddle.x -= paddleSpeed;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (paddle.x < BOARD_WIDTH - PADDLE_WIDTH) paddle.x += paddleSpeed;
        }
    }

    private void gameLoop() {
        if (gameOver) return;

        // Move ball
        ball.x += ballDirectionX * ballSpeed;
        ball.y += ballDirectionY * ballSpeed;

        // Ball collision with the walls
        if (ball.x <= 0 || ball.x >= BOARD_WIDTH - BALL_SIZE) ballDirectionX = -ballDirectionX;
        if (ball.y <= 0) ballDirectionY = -ballDirectionY;

        // Ball collision with the paddle
        if (ball.intersects(paddle)) {
            ballDirectionY = -ballDirectionY;
        }

        // Ball collision with bricks
        for (int i = 0; i < bricks.length; i++) {
            if (bricks[i] != null && ball.intersects(bricks[i])) {
                ballDirectionY = -ballDirectionY;
                bricks[i] = null; // Remove brick
                break;
            }
        }

        // Ball falls below the paddle (game over condition)
        if (ball.y >= BOARD_HEIGHT) {
            gameOver = true;
            JOptionPane.showMessageDialog(frame, "Game Over! You lost.", "Game Over", JOptionPane.INFORMATION_MESSAGE);
        }

        // Redraw the game panel
        gamePanel.repaint();
    }

    private void drawGame(Graphics g) {
        // Draw the paddle
        g.setColor(Color.GREEN);
        g.fillRect(paddle.x, paddle.y, paddle.width, paddle.height);

        // Draw the ball
        g.setColor(Color.RED);
        g.fillRect(ball.x, ball.y, ball.width, ball.height);

        // Draw the bricks
        g.setColor(Color.YELLOW);
        for (Rectangle brick : bricks) {
            if (brick != null) {
                g.fillRect(brick.x, brick.y, brick.width, brick.height);
            }
        }

        // Draw game over text
        if (gameOver) {
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("Game Over!", BOARD_WIDTH / 2 - 100, BOARD_HEIGHT / 2);
        }
    }
}
