import javax.swing.*;
import java.awt.*;

public class GameFrame extends JPanel {

    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    private static final String FRAME_NAME = "Game";

    Player player;

    GameFrame() {
        player = new Player();
        player.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));

        JFrame frame = new JFrame(FRAME_NAME);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(new KeyBoard(player));
        frame.getContentPane().add(player);
        frame.setVisible(true);
    }

}
