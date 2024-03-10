import java.util.Scanner;

public class FruitJuice {
    private int productCode;
    private String flavour;
    private String packType;
    private int packSize;
    private float productPrice;

    public FruitJuice(int productCode, String flavour, String packType, int packSize, float productPrice) {
        this.productCode = productCode;
        this.flavour = flavour;
        this.packType = packType;
        this.packSize = packSize;
        this.productPrice = productPrice;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getPackType() {
        return packType;
    }

    public void setPackType(String packType) {
        this.packType = packType;
    }

    public int getPackSize() {
        return packSize;
    }

    public void setPackSize(int packSize) {
        this.packSize = packSize;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "FruitJuice{" +
                "productCode=" + productCode +
                ", flavour='" + flavour + '\'' +
                ", packType='" + packType + '\'' +
                ", packSize=" + packSize +
                ", productPrice=" + productPrice;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product code: ");
        productCode = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter flavour: ");
        flavour = scanner.nextLine();
        System.out.print("Enter pack type: ");
        packType = scanner.nextLine();
        System.out.print("Enter pack size: ");
        packSize = scanner.nextInt();
        System.out.print("Enter product price: ");
        productPrice = scanner.nextFloat();
    }

    public void discount() {
        productPrice *= 0.9;
    }

    public void display() {
        System.out.println("Product Code: " + productCode);
        System.out.println("Flavour: " + flavour);
        System.out.println("Pack Type: " + packType);
        System.out.println("Pack Size: " + packSize);
        System.out.println("Product Price: " + productPrice);
    }
}
