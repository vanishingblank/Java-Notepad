import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FontDialog extends JDialog{
    private JComboBox<String> fontComboBox;
    private JLabel sampleLabel;
    private String selectedFont;
    public FontDialog(JFrame frame) {
        super(frame,"选择字体",true);
        setLayout(new BorderLayout());
        String[] fonts = fontFamily.getFonts();
        fontComboBox = new JComboBox<>(fonts);
        fontComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateSampleFont();
            }
        });
        sampleLabel = new JLabel("hello,大学生");
        sampleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        updateSampleFont();
        JButton yesButton = new JButton("Yes");
        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedFont = (String) fontComboBox.getSelectedItem();
                dispose();
            }
        });
        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedFont = null;
                dispose();
            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(yesButton);
        buttonPanel.add(cancelButton);
        add(fontComboBox, BorderLayout.NORTH);
        add(sampleLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        setBounds(600,300,300, 200);
    }
    private void updateSampleFont() {
        String fontName = (String) fontComboBox.getSelectedItem();
        sampleLabel.setFont(new Font(fontName, Font.PLAIN, 20));
    }
    public String getSelectedFont() {
        return selectedFont;
    }
}
