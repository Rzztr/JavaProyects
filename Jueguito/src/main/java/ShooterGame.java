import javax.swing.*;

public class ShooterGame extends JFrame {
    protected static final int WIDTH = 800;
    protected static final int HEIGHT = 600;

    public ShooterGame() {
        setTitle("Shooter Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        GamePanel gamePanel = new GamePanel();
        add(gamePanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ShooterGame());
    }
}
