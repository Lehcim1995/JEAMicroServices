package init;

import domain.User;
import service.UserService;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;

@Startup
@Singleton
public class InitUser
{

    @Inject
    private UserService userService;

    public InitUser() {
    }

    @PostConstruct
    public void init()
    {
        User u = new User("user1", Arrays.asList(1,2));
        User u1 = new User("user2", Arrays.asList(1,2));
        User u2 = new User("user3", Arrays.asList(1,2));

        userService.addUser(u);
        userService.addUser(u1);
        userService.addUser(u2);
        userService.addUser("user4");
        userService.addUser("user5");
        userService.addUser("user6");
        userService.addUser("user7");
        userService.addUser("user8");
    }
}
