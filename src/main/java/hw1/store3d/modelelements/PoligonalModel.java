package hw1.store3d.modelelements;

import java.util.Collection;

public class PoligonalModel {

    //region Constructors

    public PoligonalModel(Collection<Poligon> poligons, Collection<Texture> textures) {
        this.poligons = poligons;
        this.textures = textures;
    }

    public PoligonalModel(Collection<Poligon> poligons) {
        this.poligons = poligons;
    }

    //endregion

    //region Public Properties

    public Collection<Poligon> getPoligons() {
        return poligons;
    }

    public Collection<Texture> getTextures() {
        return textures;
    }

    public void setTextures(Collection<Texture> textures) {
        this.textures = textures;
    }
    //endregion

    //region Fields

    private Collection<Poligon> poligons;
    private Collection<Texture> textures;
    //endregion
}
