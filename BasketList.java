package groupAssignment;

public class BasketList {
	String type;
	int price;
	int quantity;

	public BasketList() {
		this.type = "";
		this.price = 0;
		this.quantity = 0;
	}

	public BasketList(String t, int p, int q) {

		this.type = t;
		this.price = p;
		this.quantity = q;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
