package headFirst.iterator;

public class RestaurantDemo {
  public static void main(String[] args) {
    MenuComponent allMenus = new Menu(
      "Unified Menu",
      "Welcome to the restaurant"
    );
    MenuComponent dinerMenu = DinerMenu.createMenu();
    MenuComponent pancakeHouseMenu = PancakeHouseMenu.createMenu();
    MenuComponent steakHouseMenu = SteakHouseMenu.createMenu();
    MenuComponent dessertMenu = DessertMenu.createMenu();

    allMenus.add(pancakeHouseMenu);
    allMenus.add(dinerMenu);
    allMenus.add(steakHouseMenu);
    steakHouseMenu.add(dessertMenu);

    Waitress waitress = new Waitress(allMenus);
    waitress.print();

    waitress.printVegetarianMenu();
  }
}
