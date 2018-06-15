package util;

import javax.ws.rs.core.GenericEntity;
import java.util.List;

public class RestUtil
{
    public static  <T> GenericEntity convertGenericenetity(List<T> list)
    {
        return new GenericEntity<List<T>>(list) {};
    }
}
