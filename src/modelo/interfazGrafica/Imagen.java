package modelo.interfazGrafica;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Imagen extends JPanel {
    int x, y;

    public Imagen(JPanel jPanel1) {
        this.x = jPanel1.getWidth();
        this.y = jPanel1.getHeight();
        this.setSize(x, y);
    }

    @Override
    public void paint(Graphics g) {
        ImageIcon Img = new ImageIcon(getClass().getResource("images\\iconoCV.png"));
        g.drawImage(Img.getImage(), 0, 0, x, y, null);
    }    

}
