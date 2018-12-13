////////////////////////////////////////////////////////////////////
// Giuseppe Vito Bitetti 1143329
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import java.util.List;

import it.unipd.tos.business.exception.RestaurantBillException;
import it.unipd.tos.model.MenuItem;

public class RealRestaurantBill implements RestaurantBill{
 public double getOrderPrice(List<MenuItem> itemsOrdered) throws RestaurantBillException{
  double totPrice=0;
  for (int i=0; i<itemsOrdered.size(); i++) {
   totPrice+=itemsOrdered.get(i).getPrice();
  }
  return totPrice;
 }
}
