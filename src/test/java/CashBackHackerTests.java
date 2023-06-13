
import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashBackHackerTests {
    @Test
    public void shouldBuyHowMuchMore() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldBuyHowMuchMoreIf0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldBuyHowMuchMoreIf1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}
