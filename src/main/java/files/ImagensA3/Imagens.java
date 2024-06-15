package files.ImagensA3;

import java.io.File;

import javax.swing.ImageIcon;

public class Imagens {

    public ImageIcon getLogo() {
        File imglog = new File("src\\main\\java\\files\\ImagensA3\\Logo3.png");

        ImageIcon imgg = new ImageIcon(imglog.getPath());
        return imgg;
    }

    public ImageIcon getTools() {
        File imglog = new File("src\\main\\java\\files\\ImagensA3\\Ferramentas.png");

        ImageIcon imgg = new ImageIcon(imglog.getPath());
        return imgg;
    }

    public ImageIcon getFriends() {
        File imglog = new File("src\\main\\java\\files\\ImagensA3\\Amigos.png");

        ImageIcon imgg = new ImageIcon(imglog.getPath());
        return imgg;
    }

}