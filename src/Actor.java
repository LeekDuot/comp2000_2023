import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Polygon;

public abstract class Actor {
  Color color;
  Cell loc;
  ArrayList<Polygon> polygons; // ArrayList to hold the polygons


  public Actor(Cell loc) {
    this.loc = loc;
    polygons = new ArrayList<>();
}

public void paint(Graphics g) {
    // g.setColor(color);
    // g.fillRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    // g.setColor(Color.GRAY);
    // g.drawRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);



    for (Polygon polygon : polygons) {
      g.setColor(color);
      g.fillPolygon(polygon);
      g.setColor(color);
      g.drawPolygon(polygon);
    }
  }
}
