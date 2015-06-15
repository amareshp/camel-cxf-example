package com.visitamaresh.ws.demo;

import java.util.Collection;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class UserService {

    // use a tree map so they become sorted
    private final Map<String, User> users = new TreeMap<String, User>();

    private Random ran = new Random();

    public UserService() {
        users.put("1", new User(1, "Amaresh Pattanaik"));
        users.put("2", new User(2, "Tom Cruise"));
        users.put("3", new User(3, "John Doe"));
        users.put("4", new User(4, "Donald Duck"));
        users.put("5", new User(5, "Slow Turtle"));
    }

    /**
     * Gets a user by the given id
     *
     * @param id  the id of the user
     * @return the user, or <tt>null</tt> if no user exists
     */
    public User getUser(String id) {
        if ("789".equals(id)) {
            // simulate some cpu processing time when returning the slow turtle
            int delay = 500 + ran.nextInt(1500);
            try {
                Thread.sleep(delay);
            } catch (Exception e) {
                // ignore
            }
        }
        return users.get(id);
    }

    /**
     * List all users
     *
     * @return the list of all users
     */
    public Collection<User> listUsers() {
        return users.values();
    }

    /**
     * Updates or creates the given user
     *
     * @param user the user
     */
    public void updateUser(User user) {
        users.put("" + user.getId(), user);
    }
}