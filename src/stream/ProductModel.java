package stream;

public class ProductModel {

    private String productName;
    private String ProductType;

    public ProductModel(String productName, String productType) {
        this.productName = productName;
        ProductType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return ProductType;
    }

    public void setProductType(String productType) {
        ProductType = productType;
    }
}
