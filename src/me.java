import java.awt.*;
import javax.swing.*;
public class me extends JDialog{
    public me(JFrame frame){
        super(frame,"about me",true);
        setLayout(new BorderLayout());
        JLabel messageLabel = new JLabel("YTU 计231-1WYZ");
        add(messageLabel, BorderLayout.CENTER);
        setBounds(600,300,200,200);
    }

}
