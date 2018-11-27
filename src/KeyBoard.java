import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoard implements KeyListener {

    Player player;

    KeyBoard(Player playerObj) {
        player = playerObj;
    }

    public void keyPressed(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();

        if (keyCode == KeyEvent.VK_W) { player.y -= 5; }
        if (keyCode == KeyEvent.VK_S) { player.y += 5; }
        if (keyCode == KeyEvent.VK_D) { player.x += 5; }
        if (keyCode == KeyEvent.VK_A) { player.x -= 5; }
        if (keyCode == KeyEvent.VK_1) { player.playerColor = Color.RED; }
        if (keyCode == KeyEvent.VK_2) { player.playerColor = Color.GREEN; }
        if (keyCode == KeyEvent.VK_3) { player.playerColor = Color.BLUE; }
    }

    public void keyReleased(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();

        if (   keyCode == KeyEvent.VK_1
                || keyCode == KeyEvent.VK_2
                || keyCode == KeyEvent.VK_3) { player.playerColor = Color.BLACK; }
    }

    public void keyTyped(KeyEvent keyEvent) {}

}
