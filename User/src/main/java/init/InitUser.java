package init;

import service.UserService;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

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
        userService.addUser("user1");
        userService.addUser("user2");
        userService.addUser("user3");
        userService.addUser("user4");
        userService.addUser("user5");
        userService.addUser("user6");
        userService.addUser("user7");
        userService.addUser("user8");
    }
}
