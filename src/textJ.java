import java.awt.*;
import javax.swing.*;

public class textJ extends JFrame{
    JFrame jf ;
    static JTextArea jta;
    JPanel jp;
    JScrollPane jsp;
    menu menuMaster = new menu();
    public textJ(){
        jf = new JFrame();
        jta = new JTextArea(24,28);
        jsp = new JScrollPane(jta);
        jta.setLineWrap(true);
        jta.setFont(new Font("微软雅黑",Font.BOLD,16));
        jf.setTitle("是记事本吗？是记事本！");
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.setLayout(new BorderLayout());
        jf.setBounds(600,100,500,600);
        jf.add(jsp,BorderLayout.CENTER);
        jf.setJMenuBar(menuMaster.menubar);
    }
}
