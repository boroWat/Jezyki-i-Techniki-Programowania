public class Anchor {
    Element first;

    Anchor() {
        this.first = null;
    }

    public void insertAtTheFront(int x) {
        Element newElement = new Element(x);
        newElement.next = first;
        first = newElement;
    }

    public void insertAtTheEnd(int x) {
        Element newElement = new Element(x);
        if (first == null) {
            first = newElement;
        } else {
            Element current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newElement;
        }
    }

    public void removeFirst() {
        if (first != null) {
            first = first.next;
        }
    }

    public void removeLast() {
        if (first != null) {
            if (first.next == null) {
                first = null;
            } else {
                Element current = first;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Element current = first;
        while (current != null) {
            sb.append(current.val).append(" ");
            current = current.next;
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Anchor other = (Anchor) o;
        Element currentThis = first;
        Element currentOther = other.first;
        while (currentThis != null && currentOther != null) {
            if (currentThis.val != currentOther.val) {
                return false;
            }
            currentThis = currentThis.next;
            currentOther = currentOther.next;
        }
        return currentThis == null && currentOther == null;
    }
}
