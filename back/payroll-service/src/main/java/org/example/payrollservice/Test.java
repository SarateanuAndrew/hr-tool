package org.example.payrollservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Test {
    final static List<User> users = new ArrayList<>(List.of(new User("1", "A"), new User("2", "B"), new User("3", "C")));

    public static Optional<User> getUser(String idnp) {
        if (Objects.isNull(idnp)) {
            return Optional.empty();
        }

        return users.stream()
                .filter(user -> user.id.equals(idnp))
                .findFirst();

//        if (first.isPresent()) {
//            return first.get();
//        }

//        return first;
    }

    public static void saveUser(String idnp, String name) {
        users.add(new User(idnp, name));
    }

    public static void main(String[] args) {
//        System.out.println(getUser("10").orElse(null).firstName);
        Optional<User> user = getUser("10");

        user.map(user1 -> user1.firstName).ifPresent(System.out::println);

    }
}
