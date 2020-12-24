import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose = 0;
        List<Product> listProduct = createListProduct();
        // Print listProduct
        for (Product p: listProduct) {
            System.out.println(p.toString());
        }

        while (choose != 9){
            // Show options and return the choose
            choose = showOption();

            switch (choose){
                case 1: // Edit product by ID
                    editProduct(input, listProduct);
                    break;

                case 2: // Delete product by ID
                    delProduct(input, listProduct);
                    break;

                case 3: // Search product by name
                    showProduct(input, listProduct);
                    break;

                case 4: // Sort product list by price

                    compareProduct(listProduct);
                    break;
                case 5:
                    // Print product list
                    for (Product p: listProduct) {
                        System.out.println(p.toString());
                    }
                    break;
                case 9:
                    System.exit(0);

            }
        }


    }

    private static int showOption() {
        Scanner input = new Scanner(System.in);
        int choose;
        System.out.println("1. Edit Product by ID");
        System.out.println("2. Delete Product by ID");
        System.out.println("3. Show Product by Name");
        System.out.println("4. Sort Product by Price");
        System.out.println("5. Show product list");
        System.out.println("9. Exit");
        System.out.print("Enter your choice: ");
        choose = input.nextInt();
        return choose;
    }

    private static List<Product> createListProduct() {
        // Create Products
        Scanner input = new Scanner(System.in);
        Product product = new Product("D101", "Laptop", 10);
        Product product1 = new Product("D102", "PC", 20);
        Product product2 = new Product("D103", "TV", 50);
        Product product3 = new Product("D104", "Screen", 40);
        Product product4 = new Product("D105", "Sound", 10);

        // Create List and add product to list

        List<Product> listProduct = new ArrayList<Product>();
        listProduct.add(product);
        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);
        return listProduct;
    }

    private static void compareProduct(List<Product> listProduct) {
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(listProduct, priceComparator);
    }

    private static void showProduct(Scanner input, List<Product> listProduct) {
        System.out.print("Enter name of product you want to show: ");
        String showName = input.next();
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getName().equals(showName)){
                System.out.println(listProduct.get(i).toString());
            }
        }
    }

    private static void delProduct(Scanner input, List<Product> listProduct) {
        // Delete product by ID
        System.out.print("Enter ID of product you want to delete: ");
        String delID = input.next();
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getID().equals(delID)){
                listProduct.remove(listProduct.get(i));
            }
        }
    }

    private static void editProduct(Scanner input, List<Product> listProduct) {
        // Edit Product by ID
        System.out.print("Enter ID of product you want to edit: ");
        String editID = input.nextLine();
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getID().equals(editID)){
                System.out.print("Enter new name: ");
                String newName = input.nextLine();
                listProduct.get(i).setName(newName);
            }
        }
    }
}
