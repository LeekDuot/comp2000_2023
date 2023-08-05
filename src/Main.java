import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;




public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
        Main window = new Main();
    }
    
    class DrawPanel extends JPanel {
        private Grid grid;

        
        
        
        public DrawPanel(Grid grid) {
            this.grid = grid;
            setPreferredSize(new Dimension(720, 720));
            
            addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseMoved(MouseEvent e) {
                    for (int i = 0; i < grid.rows; i++) {
                        for (int j = 0; j < grid.cols; j++) {
                            Cell cell = grid.getCell(i, j);
                            cell.setHighlighted(cell.containsPoint(e.getX(), e.getY()));
                        }
                    }
                    repaint();
                }
             });



        }



        // painting the panel content
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            grid.paint(g);
        }



    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Grid grid = new Grid(20, 20);
        DrawPanel panel = new DrawPanel(grid);
        this.setContentPane(panel);
        this.pack();
        this.setVisible(true);
    }
}
