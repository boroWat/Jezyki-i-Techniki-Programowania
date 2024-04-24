import java.util.List;

public interface Figure {
    void move(double dx, double dy);
    void flip();
    boolean equals(Object o);
    String toString();
}