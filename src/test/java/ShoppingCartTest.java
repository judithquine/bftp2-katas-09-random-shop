import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ShoppingCartTest {

    @Test
    void calculatePriceForMagicCards_red() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(3.5));
    }

    @Test
    void calculatePriceForMagicCards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(5.0));
    }

    @Test
    void calculatePriceForMagicCards_blue_WithDiscount() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(2.5));
    }

    @Test
    void calculatePriceForWine() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, null, null, "el tio juanillo", null);


        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(100.0));
    }

    @Test
    void calculatePriceForCheese() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, true, null, null, "French Camembert", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(50.0));
    }

    @Test
    void calculatePriceForRedFish() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", new BigDecimal("2.5"), "nemo", null);

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(2.5));
    }


}
