import java.awt.*;


public class Cell {
    private int row;
    private int col;
    private boolean highlighted;





    
    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.highlighted = false;
    }



    public void paint(Graphics g) {
        int x = 10 + col * 35;
        int y = 10 + row * 35;
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 35, 35);
        if (highlighted) {
            g.setColor(Color.GRAY);
            g.fillRect(x, y, 35, 35);
        } else {
            g.setColor(Color.WHITE);
            g.fillRect(x, y, 35, 35);
        }
    }





    public void setHighlighted(boolean highlighted) {
        this.highlighted = highlighted;
    }

    // check whether points given is inside cell boundaries
    public boolean containsPoint(int x, int y) {
        int cellX = 10 + col * 35;
        int cellY = 10 + row * 35;
        return x >= cellX && x <= cellX + 35 && y >= cellY && y <= cellY + 35;
    }
}