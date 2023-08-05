import java.awt.*;


public class Grid {
    public int rows;
    public int cols;
    public Cell[][] cells;
    
    
    
    
    public Grid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        cells = new Cell[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }
    }
    
    
    
    
    public void paint(Graphics g) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j].paint(g);
            }
        }
    }
    
    
    
    
    public Cell getCell(int row, int col) {
        return cells[row][col];
    }
}