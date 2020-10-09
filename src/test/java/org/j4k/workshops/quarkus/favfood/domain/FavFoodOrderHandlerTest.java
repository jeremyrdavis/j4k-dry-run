package org.j4k.workshops.quarkus.favfood.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.UUID;

import org.j4k.workshops.quarkus.domain.*;
import org.junit.jupiter.api.Test;

public class FavFoodOrderHandlerTest {
    

    @Test
    public void testFavFoodOrder(){

        FavFoodOrder favFoodOrder = new FavFoodOrder();
        favFoodOrder.setCustomerName("Lemmy");
        favFoodOrder.setFavFoodLineItems(Arrays.asList(new FavFoodLineItem(UUID.randomUUID().toString(), "COFFEE_BLACK", 1)));
        OrderInCommand expectedOrderInCommand = new OrderInCommand();
        expectedOrderInCommand.addBeverage(new LineItem("COFFEE_BLACK", "Lemmy"));

        OrderInCommand resultingOrderInCommand = FavFoodOrderHandler.createFromFavFoodOrder(favFoodOrder);

        assertEquals(expectedOrderInCommand.getBeverages().size(), resultingOrderInCommand.getBeverages().size());
        assertEquals(expectedOrderInCommand.getBeverages().get(0).getName(), resultingOrderInCommand.getBeverages().get(0).getName());
        assertEquals(expectedOrderInCommand.getBeverages().get(0).getItem(), resultingOrderInCommand.getBeverages().get(0).getItem());
        
    }
}
