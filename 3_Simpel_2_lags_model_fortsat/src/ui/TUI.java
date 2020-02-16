package ui;

import data.IData;
import exception.IngredientNotFoundException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TUI implements IUI {
    private IData data;
    private Scanner scanner;

    public TUI(IData data) {
        this.data = data;
        scanner = new Scanner(System.in);
    }

    @Override
    public void showMenu() {
        scanner = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("1 Vis alle ingredienser");
        System.out.println("2 Vis ingrediens");
        System.out.println("3 Ændr ingrediens");
        System.out.println("4 Opret ingrediens");
        System.out.println("5 Afslut program");

        System.out.print("Indtast valg: ");
        int menuItem;
        try {
            menuItem = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Indtast venligst et nummer. Prøv igen.");
            return;
        }
        finally {
            System.out.print("\n");
        }

        switch (menuItem) {
            case 1:
                showIngredients();
                break;
            case 2:
                showIngredient();
                break;
            case 3:
                changeIngredient();
                break;
            case 4:
                createIngredient();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Indtast et gyldigt nummer. Prøv igen.");
        }
    }

    @Override
    public void showIngredients() {
        System.out.println("Liste af ingredienser:");
        for (String s : data.getAllIngredients()) {
            System.out.println(s);
        }
    }

    @Override
    public void showIngredient() {
        System.out.print("Indtast id: ");

        int id;
        try {
            id = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Indtast venligst et nummer. Prøv igen.");
            return;
        }

        try {
            String ingredient = data.getIngredientName(id) + " (" + data.getIngredientAmount(id) + " gram)";
            System.out.println(ingredient);
        } catch (IngredientNotFoundException e) {
            System.out.println("Ingrediens med id " + id + " blev ikke fundet.");
            return;
        }
    }

    @Override
    public void changeIngredient() {
        System.out.print("Indtast id: ");

        int id;
        try {
            id = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Indtast venligst et nummer. Prøv igen.");
            return;
        }

        try {
            String ingredientName = data.getIngredientName(id);
            System.out.println("Du har valgt ingrediens: " + ingredientName);
            System.out.println("1 Ændr navn");
            System.out.println("2 Ændr mængde");
            System.out.println("3 Annullér");

            System.out.print("Indtast valg: ");
            int menuItem = scanner.nextInt();
            switch (menuItem) {
                case 1:
                    System.out.print("Indtast navn: ");
                    data.setIngredientName(id, scanner.next());
                    break;
                case 2:
                    System.out.print("Indtast mængde: ");
                    data.setIngredientAmount(id, scanner.nextInt());
                    break;
                default:
            }
        } catch (IngredientNotFoundException e) {
            System.out.println("Ingrediens med id " + id + " blev ikke fundet.");
            return;
        }
    }

    @Override
    public void createIngredient() {
        int id;
        try {
            System.out.print("Indtast id: ");
            id = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Intast venligst et nummer. Prøv igen.");
            return;
        }
        scanner.nextLine(); //Smid '\n' fra scanner.nextInt() væk
        System.out.print("Indtast navn: ");
        String name = scanner.nextLine();

        int amount;
        try {
            System.out.print("Indtast mængde: ");
            amount = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Intast venligst et heltal. Prøv igen.");
            return;
        }

        data.createIngredient(id, name, amount);
    }
}
