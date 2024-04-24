import java.util.List;
import java.util.Map;
import java.util.Optional;

public class UsersServiceImpl implements UsersService{

    List<User> sourceUsers = List.of(
            new User(1L, "John", "Smith", 26, List.of(Privilege.UPDATE)),
            new User(2L, "Greg", "Jonson", 30,
                    List.of(Privilege.UPDATE, Privilege.CREATE, Privilege.DELETE)),
            new User(3L, "Alex", "Smith", 13, List.of(Privilege.DELETE)));

    @Override
    public List<Privilege> getAllDistinctPrivileges() {
        return null;
    }

    @Override
    public Optional<User> getUpdateUserWithAgeHigherThan(int age) {
        return Optional.empty();
    }

    @Override
    public Map<String, Long> getNumberOfLastNames() {
        return null;
    }

    @Override
    public List<User> sortByAgeDescAndNameAsc() {
        return null;
    }

    @Override
    public Map<Integer, List<User>> groupByCountOfPrivileges() {
        return null;
    }

    @Override
    public Map<Privilege, List<User>> groupByPrivileges() {
        return null;
    }
}
