package it.unipd.tos.model;

public class MenuItem {
	
	private Item itemType;
	private String name;
	private double price;
	public enum Item {Pizze, Primi};
	
	public MenuItem(Item _type, String _name, double _price) {
		itemType=_type;
		name=_name;
		price=_price;
	};
	public Item getType() {return itemType;};
	public double getPrice() {return price;};
	public String getName() {return name;};

}
