import java.io.*;
import javax.swing.*;

public class fileOp {
    static File currentFile=null;
    public static void createNew(){
        JFileChooser jfc = new JFileChooser();
        int fileinfo = jfc.showOpenDialog(null);
        if(fileinfo == JFileChooser.APPROVE_OPTION){
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(jfc.getSelectedFile()))){
                currentFile = jfc.getSelectedFile();
                textJ.jta.setText("");
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static void openFile(){
        JFileChooser jfc = new JFileChooser();
        int fileinfo = jfc.showOpenDialog(null);
        if(fileinfo == JFileChooser.APPROVE_OPTION){
            try(BufferedReader reader = new BufferedReader(new FileReader(jfc.getSelectedFile()))){
                currentFile = jfc.getSelectedFile();
                String line;
                while ((line = reader.readLine()) != null) {
                    textJ.jta.append(line+'\n');
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static void saveSelf(){
        if(currentFile!=null){
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(currentFile))){
                textJ.jta.write(writer);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        else
        {
            JFileChooser jfc = new JFileChooser();
            int fileinfo = jfc.showOpenDialog(null);
            if(fileinfo == JFileChooser.APPROVE_OPTION){
                try(BufferedWriter writer = new BufferedWriter(new FileWriter(jfc.getSelectedFile()))){
                    currentFile = jfc.getSelectedFile();
                    textJ.jta.write(writer);
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public static void saveFile(){
        JFileChooser jfc = new JFileChooser();
        int fileinfo = jfc.showOpenDialog(null);
        if(fileinfo == JFileChooser.APPROVE_OPTION){
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(jfc.getSelectedFile()))){
                textJ.jta.write(writer);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
