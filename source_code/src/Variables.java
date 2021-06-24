import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class Variables {
    private JFileChooser JBUSCA;
    private File arquivo;
    private ImageIcon icon;
    private BufferedImage processada;
    
    public JFileChooser getJBUSCA() {
        return JBUSCA;
    }
    
    public void setJBUSCA(JFileChooser JBUSCA) {
        this.JBUSCA = JBUSCA;
    }
    
    public File getArquivo() {
        return arquivo;
    }

    public void setArquivo(File arquivo) {
        this.arquivo = arquivo;
    }
    
    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
    
    public BufferedImage getProcessada() {
        return processada;
    }

    public void setProcessada(BufferedImage processada) {
        this.processada = processada;
    }
}