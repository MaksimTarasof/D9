import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shoulDincreaseVolume() {
        Radio vol = new Radio();

        vol.currentVolume = 10;
        int expected = 10;
        int actual = vol.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}
