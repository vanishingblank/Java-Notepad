import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class menu {
    private fileOp file = new fileOp();
    public JMenuBar menubar;
    private JMenuItem item11,item12,item13,item14,item15,
            item21,item22,item23,item24,item25,item26, item27,
            item31,item32,item33,
    item311,item312,item313;
    private JMenu menu1,menu2,menu3,menu32;
    public menu(){
        menubar = new JMenuBar();
        item11 = new JMenuItem("新建文件");
        item12 = new JMenuItem("打开文件");
        item13 = new JMenuItem("保存");
        item14 = new JMenuItem("另存为");
        item21 = new JMenuItem("剪切");
        item22 = new JMenuItem("复制");
        item23 = new JMenuItem("粘贴");
        item24 = new JMenuItem("全选");
        item25 = new JMenuItem("时间/日期");
        item26 = new JMenuItem("字体");
        item31 = new JMenuItem("当前自动换行");
        item33 = new JMenuItem("作者");
//        menu32 = new JMenu("缩放");
//        item311 = new JMenuItem("放大");
//        item312 = new JMenuItem("缩小");
//        item313 = new JMenuItem("还原");
        menu1 = new JMenu("文件");
        menu2 = new JMenu("编辑");
        menu3 = new JMenu("查看");
        item11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                file.createNew();
            }
        });
        item12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                file.openFile();
            }
        });
        item13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                file.saveSelf();
            }
        });
        item14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                file.saveFile();
            }
        });
        item21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textJ.jta.cut();
            }
        });
        item22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textJ.jta.copy();
            }
        });
        item23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textJ.jta.paste();
            }
        });
        item24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textJ.jta.selectAll();
            }
        });
        item25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textJ.jta.append(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
            }
        });
        item26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FontDialog fontDialog = new FontDialog(new JFrame());
                fontDialog.setVisible(true);
                String selectedFont = fontDialog.getSelectedFont();
                if (selectedFont != null) {
                    textJ.jta.setFont(new Font(selectedFont, Font.PLAIN, 16));
                }
            }
        });
        item31.setSelected(true);
        item31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(item31.isSelected()){
                    textJ.jta.setLineWrap(false);
                    item31.setSelected(false);
                    item31.setText("当前不自动换行");
                }else {

                    textJ.jta.setLineWrap(true);
                    item31.setSelected(true);
                    item31.setText("当前自动换行");
                }

            }
        });
        item33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                me dialog = new me(new JFrame());
                dialog.setVisible(true);
            }
        });
        menubar.add(menu1);
        menubar.add(menu2);
        menubar.add(menu3);
        menu1.add(item11);
        menu1.add(item12);
        menu1.add(item13);
        menu1.add(item14);
        menu2.add(item21);
        menu2.add(item22);
        menu2.add(item23);
        menu2.add(item24);
        menu2.add(item25);
        menu2.add(item26);
        menu3.add(item31);
        menu3.add(item33);
//        menu3.add(menu32);
//        menu32.add(item311);
//        menu32.add(item312);
//        menu32.add(item313);
    }
}
