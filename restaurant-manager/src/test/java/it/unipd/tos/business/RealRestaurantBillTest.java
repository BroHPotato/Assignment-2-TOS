////////////////////////////////////////////////////////////////////
// Giuseppe Vito Bitetti 1143329
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import it.unipd.tos.business.exception.RestaurantBillException;
import it.unipd.tos.model.MenuItem;

public class RealRestaurantBillTest {
	
	private RealRestaurantBill bill=new RealRestaurantBill();
	
	
	
	@Test
	public void testGetOrderPriceTotalPrice() throws RestaurantBillException {
		List<MenuItem> order= new ArrayList<MenuItem>();
		order.add(new MenuItem(MenuItem.Item.Pizze, "Margherita", 3.50));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Margherita", 3.50));
		order.add(new MenuItem(MenuItem.Item.Primi, "Luinguine", 7.00));
		order.add(new MenuItem(MenuItem.Item.Primi, "Bucatini", 5.50));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Diavola", 4.00));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Diavola", 4.00));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Capriciosa", 5.00));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Diavola", 3.50));
		assertEquals(36.00,bill.getOrderPrice(order),0);
	}

	@Test
	public void testGetOrderPriceDiscountedPizzePrice() throws RestaurantBillException {
		List<MenuItem> order= new ArrayList<MenuItem>();
		order.add(new MenuItem(MenuItem.Item.Pizze, "Margherita", 3.50));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Margherita", 3.50));
		order.add(new MenuItem(MenuItem.Item.Primi, "Luinguine", 7.00));
		order.add(new MenuItem(MenuItem.Item.Primi, "Bucatini", 5.50));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Diavola", 4.00));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Diavola", 4.00));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Capriciosa", 5.00));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Capriciosa", 5.00));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Capriciosa", 5.00));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Margherita", 3.50));
		order.add(new MenuItem(MenuItem.Item.Primi, "Luinguine", 7.00));
		order.add(new MenuItem(MenuItem.Item.Primi, "Bucatini", 5.50));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Diavola", 4.00));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Diavola", 4.00));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Diavola", 3.50));
		assertEquals(66.50,bill.getOrderPrice(order),0);
	}
	
	@Test
	public void testGetOrderPriceDiscountedHighPrice() throws RestaurantBillException {
		List<MenuItem> order= new ArrayList<MenuItem>();
		order.add(new MenuItem(MenuItem.Item.Pizze, "Margherita", 3.50));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Margherita", 3.50));
		order.add(new MenuItem(MenuItem.Item.Primi, "Luinguine", 7.00));
		order.add(new MenuItem(MenuItem.Item.Primi, "Bucatini", 5.50));
		order.add(new MenuItem(MenuItem.Item.Primi, "Luinguine", 7.00));
		order.add(new MenuItem(MenuItem.Item.Primi, "Bucatini", 5.50));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Diavola", 4.00));
		order.add(new MenuItem(MenuItem.Item.Primi, "Luinguine", 7.00));
		order.add(new MenuItem(MenuItem.Item.Primi, "Luinguine", 7.00));
		order.add(new MenuItem(MenuItem.Item.Primi, "Bucatini", 5.50));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Diavola", 4.00));
		order.add(new MenuItem(MenuItem.Item.Primi, "Luinguine", 7.00));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Diavola", 4.00));
		order.add(new MenuItem(MenuItem.Item.Primi, "Luinguine", 7.00));
		order.add(new MenuItem(MenuItem.Item.Primi, "Bucatini", 5.50));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Diavola", 4.00));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Diavola", 4.00));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Diavola", 4.00));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Diavola", 4.00));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Diavola", 3.50));
		order.add(new MenuItem(MenuItem.Item.Pizze, "Diavola", 3.50));
		assertEquals(97.375,bill.getOrderPrice(order),0);
	}
}