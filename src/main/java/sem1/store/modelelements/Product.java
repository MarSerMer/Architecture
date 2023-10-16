package sem1.store.modelelements;

public class Product {
    //region Инициализатор и конструкторы
    {
        id = ++counter;
    }
    //endregion

    //region Обертки над полями = свойства


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    //endregion

    // region Поля
    private static int counter = 0;
    private int id;
    private String name;
    private Double price;
    private String category;
    //endregion
}
