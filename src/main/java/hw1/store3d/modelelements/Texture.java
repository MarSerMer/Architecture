package hw1.store3d.modelelements;

public class Texture {
    //region Constructors

    public Texture(int id, String name) {
        this.id = id;
        this.name = name;
    }


    //endregion

    //region Public Properties

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    //endregion

    //region Fields
    private int id; //идея втом, что мы берем текстуру из некоторой БД текстур
    private String name;
    //endregion

}
