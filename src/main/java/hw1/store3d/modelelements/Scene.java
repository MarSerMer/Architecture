package hw1.store3d.modelelements;

import java.util.Collection;

public class Scene {
    // region Методы
    public void AddSceneToGame(Scene scene){
        System.out.println("New scene added to game");
    }

    public void AskMoneyForUsingScene(Scene scene){
        System.out.println("Using of this scene is not free. Please pay for it or avoid using it.");
    }
    //endregion

    //region Инициализатор и конструкторы
    {
        id = ++counter;
    }

    public Scene(Collection<PoligonalModel> models, Collection<Flash> flashes, Collection<Camera> cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public Scene(Collection<PoligonalModel> models, Collection<Camera> cameras) {
        this.models = models;
        this.cameras = cameras;
    }

    //endregion

    //region Cвойства

    public int getId() {
        return id;
    }

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public void setModels(Collection<PoligonalModel> models) {
        this.models = models;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public void setFlashes(Collection<Flash> flashes) {
        this.flashes = flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(Collection<Camera> cameras) {
        this.cameras = cameras;
    }
//endregion

    // region Поля
    private static int counter = 0;
    private int id;
    private Collection<PoligonalModel> models;
    private Collection<Flash> flashes;
    private Collection<Camera> cameras;
    //endregion
}
