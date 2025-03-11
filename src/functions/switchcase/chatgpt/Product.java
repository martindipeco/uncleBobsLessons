package functions.switchcase.chatgpt;

public class Product {
    private ProductCategory productCategory;
    private double price;
    private DiscountStrategy discountStrategy;

    public ProductCategory getCategory() {
        return productCategory;
    }

    public double getPrice() {
        return price;
    }

    public double getFinalPrice() {
        return discountStrategy.applyDiscount(price);
    }

    public Product (ProductCategory productCategory, double price) {
        this.productCategory = productCategory;
        this.price = price;
        this.discountStrategy = DiscountStrategyFactory.getStrategy(productCategory);
    }

}
