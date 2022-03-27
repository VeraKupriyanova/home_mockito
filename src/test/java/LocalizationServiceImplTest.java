import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;
import static org.junit.jupiter.api.Assertions.*;
public class LocalizationServiceImplTest {
    @Test
    void testLocalRus() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        String actual = localizationService.locale(Country.RUSSIA);
        String expected = "Добро пожаловать";
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testLocalEng() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String actual = localizationService.locale(Country.USA);
        String expected = "Welcome";

        assertEquals(expected,actual);

    }
}
