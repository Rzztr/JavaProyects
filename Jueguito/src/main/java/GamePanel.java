
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class GamePanel extends JPanel implements KeyListener, Runnable {
    private static final int PLAYER_WIDTH = 30;
    private static final int PLAYER_HEIGHT = 30;
    private static final int PLAYER_SPEED = 5;
    private static final int BULLET_SPEED = 10;
    private static final int MAX_BULLETS = 5;

    private boolean isRunning = true;
    private Thread gameThread;
    private Player player;
    private List<Bullet> bullets;

    public GamePanel() {
        setFocusable(true);
        addKeyListener(this);

        player = new Player(WIDTH / 2 - PLAYER_WIDTH / 2, HEIGHT - PLAYER_HEIGHT - 10);
        bullets = new ArrayList<>();

        startGameLoop();
    }

    private void startGameLoop() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        while (isRunning) {
            update();
            repaint();

            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void update() {
        player.move();

        for (int i = 0; i < bullets.size(); i++) {
            Bullet bullet = bullets.get(i);
            bullet.move();

            if (bullet.getY() < 0) {
                bullets.remove(i);
                i--;
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        player.draw(g);

        for (Bullet bullet : bullets) {
            bullet.draw(g);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            player.setLeft(true);
        }
        if (key == KeyEvent.VK_RIGHT) {
            player.setRight(true);
        }
        if (key == KeyEvent.VK_SPACE && bullets.size() < MAX_BULLETS) {
            bullets.add(new Bullet(player.getX() + PLAYER_WIDTH / 2, player.getY()));
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            player.setLeft(false);
        }
        if (key == KeyEvent.VK_RIGHT) {
            player.setRight(false);
        }
    }
}
