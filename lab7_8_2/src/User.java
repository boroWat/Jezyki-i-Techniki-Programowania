import java.util.*;

record User(Long id, String firstName, String lastName,
            Integer age, List<Privilege> privileges) {

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User user) {
            Objects.equals(this.id, user.id);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }
}

enum Privilege {
    CREATE, UPDATE, READ, DELETE
}