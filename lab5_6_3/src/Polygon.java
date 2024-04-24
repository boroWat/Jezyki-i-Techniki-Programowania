import java.util.List;


class Polygon implements Figure {
    private List<Point> ListaP;

    public Polygon(List<Point> ListaP) {
        this.ListaP = ListaP;
    }

    public List<Point> getListaP() {
        return ListaP;
    }

    @Override
    public void move(double dx, double dy) {
        for (Point point: ListaP) {
            point.move(dx, dy);
        }
    }

    @Override
    public void flip() {
        for (Point point: ListaP) {
            point.flip();
        }
    }

    @Override
    public boolean equals(Object o) {
        Point p1;
        Point p2;
        Polygon polygon = (Polygon) o;
        List<Point> polygonList = polygon.getListaP();
        if (ListaP.size() != polygonList.size()) {
            return false;
        }
        for (int i = 0; i < polygonList.size(); i++) {
            p1 = polygonList.get(i);
            p2 = ListaP.get(i);
            if (!p1.equals(p2)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String tekst = "";
        int counter = 1;
        for (Point point: ListaP) {
            tekst += "Punkt" + counter + " " + point.toString();
            tekst += "\n";
            counter += 1;
        }
        return tekst;
    }
}