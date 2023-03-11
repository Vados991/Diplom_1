import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

@RunWith(Parameterized.class)
public class BunTest {
    private String name;
    private float price;
    private Bun bun;

    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }
    @Parameterized.Parameters(name = "Название булочки: {0}, Цена булочки: {1}")
    public static Object[][] getData() {
        return new Object[][]{
                {"black bun", 100},
                {"white bun", 200},
                {"red bun", 300}
        };
    }
    @Before
    public void createBun() {
        bun = new Bun(name, price);
    }
    @Test
    public void correctNameBun() {
        Assert.assertEquals("Неправильное название булочки", name, bun.getName());
    }
    @Test
    public void correctPriceBun() {
        Assert.assertEquals("Неправильная цена булочки", price, bun.getPrice(), 0.0f);
    }
}
