package org.example;
import java.util.Scanner;

public class Pizza {
    private Integer price;
    private Boolean composition;
    private final Integer extraCheesePrice = 100;
    private final Integer extraToppingsPrice = 120;
    private final Integer backpackPrice = 20;
    private final Scanner scanner = new Scanner(System.in);



    public Pizza(Boolean composition) {
        this.composition = composition;
        if (this.composition) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        informationAboutAdds();
    }

    public void informationAboutAdds() {
        printCurrentPrice();
        System.out.println();
        System.out.println("1. Extra cheese - " + extraCheesePrice + '\n'
                + "2. Extra toppings - " + extraToppingsPrice + '\n'
                + "3. Take away - " + backpackPrice + '\n'
                + "4. No, take bill");
        System.out.println("Choose: ");
        String clientChoice = scanner.nextLine();
        handleClientChoice(clientChoice);
    }
    public void handleClientChoice(String choice) {
        switch (choice) {
            case "1" -> addExtraCheese();
            case "2" -> addExtraToppings();
            case "3" -> takeAway();
            case "4" -> getBill();
            default -> {
                System.out.println("Incorrect input, try again.");
                informationAboutAdds();
            }
        }

    }

    public void printCurrentPrice() {
        System.out.println("Current price - [" + this.price + ']');
        System.out.println("Would you like to add something extra?");
    }

    public void addExtraCheese() {
        System.out.println("Extra cheese added!");
        this.price += extraCheesePrice;
        informationAboutAdds();
    }
    public void addExtraToppings() {
        System.out.println("Extra toppings added");
        this.price += extraToppingsPrice;
        informationAboutAdds();
    }

    public void takeAway() {
        System.out.println("Taked away!");
        this.price += backpackPrice;
        informationAboutAdds();
    }

    public void getBill() {
        System.out.println("Bill: " + this.price);
    }
}
