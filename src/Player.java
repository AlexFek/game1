import javax.swing.*;
import java.awt.*;

public class Player extends JPanel {

    private static final int PLAYER_WIDTH = 20;
    private static final int PLAYER_HEIGHT = 20;

    int x = 20;
    int y = 20;
    Color playerColor = Color.BLACK;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(playerColor);
        g.fillOval(x, y, PLAYER_WIDTH, PLAYER_HEIGHT);
        repaint();
    }

}
