// Develop a role-based access control system for a software application. Design classes such as User, Role, and Permission, where a user can have multiple roles, and each role defines a set of permissions. Use interfaces to enforce access control policies, allowing or denying access based on the user's roles and permissions.
// Interface for Permission
interface Permission {
    boolean checkPermission(String permission);
}

// User class
class User {
    private String username;
    private Role[] roles;
    private int roleCount;

    public User(String username, int maxRoles) {
        this.username = username;
        this.roles = new Role[maxRoles];
        this.roleCount = 0;
    }

    public void addRole(Role role) {
        if (roleCount < roles.length) {
            roles[roleCount++] = role;
        } else {
            System.out.println("Cannot add more roles for user: " + username);
        }
    }

    public boolean hasPermission(String permission) {
        for (Role role : roles) {
            if (role != null && role.checkPermission(permission)) {
                return true;
            }
        }
        return false;
    }
}

// Role class
class Role implements Permission {
    private String roleName;
    private String[] permissions;
    private int permissionCount;

    public Role(String roleName, int maxPermissions) {
        this.roleName = roleName;
        this.permissions = new String[maxPermissions];
        this.permissionCount = 0;
    }

    public void addPermission(String permission) {
        if (permissionCount < permissions.length) {
            permissions[permissionCount++] = permission;
        } else {
            System.out.println("Cannot add more permissions for role: " + roleName);
        }
    }

    @Override
    public boolean checkPermission(String permission) {
        for (String perm : permissions) {
            if (perm != null && perm.equals(permission)) {
                return true;
            }
        }
        return false;
    }
}

// Example usage
public class Prac7 {
    public static void main(String[] args) {
        // Create roles and assign permissions
        Role adminRole = new Role("ADMIN", 2);
        adminRole.addPermission("READ");
        adminRole.addPermission("WRITE");

        Role userRole = new Role("USER", 1);
        userRole.addPermission("READ");

        // Create users and assign roles
        User user1 = new User("user1", 2);
        user1.addRole(adminRole);

        User user2 = new User("user2", 1);
        user2.addRole(userRole);

        // Check permissions
        System.out.println("User 1 has READ permission: " + user1.hasPermission("READ"));
        System.out.println("User 1 has WRITE permission: " + user1.hasPermission("WRITE"));
        System.out.println("User 2 has READ permission: " + user2.hasPermission("READ"));
        System.out.println("User 2 has WRITE permission: " + user2.hasPermission("WRITE"));
    }
}
