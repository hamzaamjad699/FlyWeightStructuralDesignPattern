package FlyWeightDesignPattern2;

import java.awt.Color;
import java.awt.Graphics;

public interface IMyShape {
    public String draw (Graphics g, 
            int x, int y, 
            int width, int height,
            Color color, boolean fill, 
            String font);
}


