import java.util.List;
class Group implements Figure {
    private List<Polygon> ListaPoly;

    public Group(List<Polygon> ListaPoly) {
        this.ListaPoly = ListaPoly;
    }

    public List<Polygon> getListaPoly() {
        return ListaPoly;
    }

    @Override
    public void move(double dx, double dy) {
        for (Polygon polygon: ListaPoly) {
            polygon.move(dx, dy);
        }
    }

    @Override
    public void flip() {
        for (Polygon polygon: ListaPoly) {
            polygon.flip();
        }
    }

    @Override
    public boolean equals(Object o) {
        Polygon poly1;
        Polygon poly2;
        Group group = (Group) o;
        List<Polygon> objectPolygonList = group.getListaPoly();
        if (ListaPoly.size() != objectPolygonList.size()) {
            return false;
        }
        for (int i = 0; i < ListaPoly.size(); i++) {
            poly1 = ListaPoly.get(i);
            poly2 = objectPolygonList.get(i);
            if (!poly1.equals(poly2)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String tekst = "";

        int counter = 1;
        for (Polygon polygon: ListaPoly) {
            tekst += "Wielokat "  + counter + "\n" + polygon.toString();
            tekst += "\n";
            counter += 1;
        }
        return tekst;
    }
}