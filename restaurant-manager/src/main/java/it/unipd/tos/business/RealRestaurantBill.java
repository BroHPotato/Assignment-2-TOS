////////////////////////////////////////////////////////////////////
// Giuseppe Vito Bitetti 1143329
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import java.util.List;

import it.unipd.tos.business.exception.RestaurantBillException;
import it.unipd.tos.model.MenuItem;

public class RealRestaurantBill implements RestaurantBill{
 public double getOrderPrice(List<MenuItem> itemsOrdered) throws RestaurantBillException{
  int totPizze=0;
  double lowerPricePizza=0;
  double totPrice=0;
  for (int i=0; i<itemsOrdered.size(); i++) {
   totPrice+=itemsOrdered.get(i).getPrice();
   if (itemsOrdered.get(i).getType()==it.unipd.tos.model.MenuItem.Item.Pizze) {
    totPizze++;
   if (totPizze==1) {
    lowerPricePizza=itemsOrdered.get(i).getPrice();}
   if (lowerPricePizza>itemsOrdered.get(i).getPrice()) {
    lowerPricePizza=itemsOrdered.get(i).getPrice();}
   }
  }
 if (totPizze>10) {
  totPrice-=lowerPricePizza;}
 if (totPrice>100) {
  totPrice=totPrice*0.95;}
 return totPrice;
 }
}
