package com.ct.EH_Day8.ShoppingApppllication;

public class ShoppingApplication {
    public static void main(String[] args) {
        // Create sample products
        Product laptop = new Product(1, "Laptop", 999.99, 5);
        Product mouse = new Product(2, "Mouse", 19.99, 10);
        Product keyboard = new Product(3, "Keyboard", 49.99, 8);
        Product monitor = new Product(4, "Monitor", 199.99, 3);

        // Create shopping cart with capacity 3 (to test full cart scenario)
        ShoppingCart cart = new ShoppingCart(3);

        System.out.println("=== TEST CASE 1: Valid Product Addition ===");
        try {
            cart.addToCart(laptop, 1);
            cart.addToCart(mouse, 2);
            System.out.println("Total: $" + cart.calculateTotal()); // Expected: 999.99 + (19.99*2) = 1039.97
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== TEST CASE 2: Insufficient Quantity ===");
        try {
            cart.addToCart(monitor, 5); // Only 3 available
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); // Expected: Only 3 items available for Monitor
        }

        System.out.println("\n=== TEST CASE 3: Invalid Product Addition ===");
        try {
            cart.addToCart(null, 1); // Null product
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); // Expected: Cannot add null product to cart
        }

        System.out.println("\n=== TEST CASE 4: Full Cart ===");
        try {
            cart.addToCart(keyboard, 1); // 3rd item (cart capacity is 3)
            cart.addToCart(monitor, 1); // Should fail
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); // Expected: Cart is full (capacity: 3)
        }

        System.out.println("\n=== TEST CASE 5: Calculate Total with Empty Cart ===");
        ShoppingCart emptyCart = new ShoppingCart(5);
        System.out.println("Empty cart total: $" + emptyCart.calculateTotal()); // Expected: 0.0

        System.out.println("\n=== TEST CASE 6: Calculate Total with Mixed Products ===");
        ShoppingCart mixedCart = new ShoppingCart(10);
        try {
            mixedCart.addToCart(laptop, 2);
            mixedCart.addToCart(mouse, 3);
            mixedCart.addToCart(keyboard, 1);
            System.out.println("Total: $" + mixedCart.calculateTotal()); // Expected: (999.99*2) + (19.99*3) + 49.99 =
                                                                         // 2099.94
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}