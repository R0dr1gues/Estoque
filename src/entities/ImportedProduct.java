package entities;

public class ImportedProduct extends Product{

	
	private Double customsFee;
	private Double totalPrice;
	
	
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public Double getCustomsFee() {
		return customsFee;
	}
	
	public void setCustomsFee(Double importedProduct) {
		this.customsFee = customsFee;
	}
	public double totalPrice (){
		return totalPrice = getPrice() + customsFee;
	}
	@Override
	public String priceTag() {
		return getName() + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
	}
}
