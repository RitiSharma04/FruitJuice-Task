import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for fruit juice:");
        System.out.print("Product code: ");
        int productCode = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Flavour: ");
        String flavour = scanner.nextLine();
        System.out.print("Pack type: ");
        String packType = scanner.nextLine();
        System.out.print("Pack size: ");
        int packSize = scanner.nextInt();
        System.out.print("Product price: ");
        float productPrice = scanner.nextFloat();

        FruitJuice juice = new FruitJuice(productCode, flavour, packType, packSize, productPrice);
        System.out.println("Fruit juice details:");
        System.out.println(juice);

        juice.discount();
        System.out.println("After applying discount:");
        juice.display();

        scanner.close();
    }
}
