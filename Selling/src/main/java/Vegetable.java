
public class Vegetable {
	private int id;
	private String description;
	private int quantity;
	private float rate;
	
	
	
	public Vegetable(int id, String description, int quantity, float rate) {
		super();
		this.id = id;
		this.description = description;
		this.quantity = quantity;
		this.rate = rate;
	}
	
	
	public Vegetable() {
		super();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}

}
