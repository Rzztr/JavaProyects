import java.awt.*;

public class Player {
    private int x;
    private int y;
    private int dx;
    private boolean isMovingLeft;
    private boolean isMovingRight;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        this.dx = 0;
    }

    public void setLeft(boolean isMovingLeft) {
        this.isMovingLeft = isMovingLeft;
        if (isMovingLeft) {
            this.dx = -200;
        } else if (!this.isMovingRight) {
            this.dx = 0;
        }
    }

    public void setRight(boolean isMovingRight) {
        this.isMovingRight = isMovingRight;
        if (isMovingRight) {
            this.dx = 200;
        } else if (!this.isMovingLeft) {
            this.dx = 0;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move() {
        x += dx;
        if (x < 0) {
            x = 0;
        }
        if (x > ShooterGame.WIDTH - 30) {
            x = ShooterGame.WIDTH - 20;
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 30, 20);
    }
}
