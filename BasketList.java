package groupAssignment;

public class BasketList {
	String type;
	String product;
	int price;
	int quantity;

	public BasketList() {
		this.type = "";
		this.product = "";
		this.price = 0;
		this.quantity = 0;
	}

	public BasketList(String t,String pr, int p, int q) {

		this.type = t;
		this.product=pr;
		this.price = p;
		this.quantity = q;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
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

