import java.awt.*;

public class fontFamily {
    public static String[] getFonts(){
        return GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    }
}
