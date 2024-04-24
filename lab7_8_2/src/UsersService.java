import java.util.*;
import java.util.stream.Collectors;

interface UsersService {

    List<Privilege> getAllDistinctPrivileges() {

    }

    Optional<User> getUpdateUserWithAgeHigherThan(int age) {

    }

    Map<String, Long> getNumberOfLastNames() {
    }

    List<User> sortByAgeDescAndNameAsc() {

    }

    Map<Integer, List<User>> groupByCountOfPrivileges() {
    }

    Map<Privilege, List<User>> groupByPrivileges() {
    }
}
