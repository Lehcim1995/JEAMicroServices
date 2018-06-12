package init;

import service.DLCService;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Startup
@Singleton
public class InitDLC
{
    @Inject
    private DLCService dlcService;

    @PostConstruct
    public void init()
    {
        dlcService.addDLC("dlc1", 1);
        dlcService.addDLC("dlc2", 1);
        dlcService.addDLC("dlc3", 1);
        dlcService.addDLC("dlc4", 2);
        dlcService.addDLC("dlc5", 2);
        dlcService.addDLC("dlc6", 2);
    }
}
