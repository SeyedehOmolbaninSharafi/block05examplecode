package RoleplayPlatform;

/**
 * Created by Niklas on 2016-02-02.
 *
 * Block 2-2: Inheritance, when and how?
 */
public class Player {

    private User parent;

    public Player(User parent) {
        this.parent = parent;
    }

    public String getUsername() {
        return parent.getUsername();
    }
}
