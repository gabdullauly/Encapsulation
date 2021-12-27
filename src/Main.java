/*
Создайте класс Ingredient, у которого есть параметры и методы:
- String name;
- double calories;
Constructors (default and parameterized)
Getters and Setters
+ String toString(); // Этот метод возвращает строку ингредиентов
Создайте класс Food, у которого есть параметры и методы:
- String name
- int price;
- Ingredient ingredients[];
Constructors (default and parameterized)
Getters and Setters
+ String toString(); // Этот метод возвращает String всех параметров
+ double getTotalCalories(); // Этот метод возвращает общее ккал всех ингрендиентов
Example: Food:
Manty, price: 500 KZT
_________
Ingredients:
Meat 400 kcal
 Onion 50 kcal
 Potato 20 kcal
Dough 200 kcal
_________
Total calories: 670 kcal
 */


public class Main{
    public static void main(String[] args) {
        Ingredient ingredient1 = new Ingredient();
        ingredient1.setName("Meat");
        ingredient1.setCalories(400);

        Ingredient ingredient2 = new Ingredient("Onion", 50);
        Ingredient ingredient3 = new Ingredient("Potato", 20);
        Ingredient ingredient4 = new Ingredient("Dough", 200);
        Ingredient ingredient5 = new Ingredient("Cheese", 100);

        Ingredient ingredient6 = new Ingredient("Eggs", 250);
        Ingredient ingredient7 = new Ingredient("Meat", 450);
        Ingredient ingredient8 = new Ingredient("Tomato", 80);
        Ingredient ingredient9 = new Ingredient("Специи", 50);
        Ingredient ingredient10 = new Ingredient("Cheese", 120);

        Ingredient ingredient11 = new Ingredient("Лепешки", 160);
        Ingredient ingredient12 = new Ingredient("Капуста", 40);
        Ingredient ingredient13 = new Ingredient("Фарш", 380);
        Ingredient ingredient14 = new Ingredient("Сыр", 80);
        Ingredient ingredient15 = new Ingredient("Лук", 90);

        Ingredient[] ingredients = {ingredient1, ingredient2, ingredient3, ingredient4, ingredient5};
        Ingredient[] ingredients1 = {ingredient6, ingredient7, ingredient8, ingredient9, ingredient10};
        Ingredient[] ingredients2 = {ingredient11, ingredient12, ingredient13, ingredient14, ingredient15};

        Food food1 = new Food();
        food1.setName("Manty");
        food1.setPrice(500);
        food1.setIngredients(ingredients);

        Food food2 = new Food("Burger", 600, ingredients1);
        Food food3 = new Food("McDonalds", 1200, ingredients2);

        Food[] foods = {food1, food2, food3};

        for (int i=0; i< foods.length; i++){
            System.out.print(foods[i].toString());
            System.out.println("Total calories "+ foods[i].getName()+": "+foods[i].getTotalCalories());
            System.out.println("-----------------------\n");
        }
    }
}