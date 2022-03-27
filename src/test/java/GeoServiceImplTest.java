import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;
import ru.netology.entity.Country;

public class GeoServiceImplTest {

    @Test
    void testByIp() {
        GeoService geoService = new GeoServiceImpl();
        Location actual = geoService.byIp("127.0.0.1");
        Location expected = new Location("New York", Country.USA, null, 0);

        Assertions.assertEquals(expected, actual);

    }

}
