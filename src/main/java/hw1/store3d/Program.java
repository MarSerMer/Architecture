package hw1.store3d;

import hw1.store3d.inmemorymodel.CustomService1;
import hw1.store3d.inmemorymodel.CustomService2;
import hw1.store3d.inmemorymodel.CustomService3;
import hw1.store3d.inmemorymodel.ModelStore;
import hw1.store3d.modelelements.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        //region Создадим наблюдателей
        CustomService1 observer1 = new CustomService1();
        CustomService2 observer2 = new CustomService2();
        CustomService3 observer3 = new CustomService3();
        //endregion

        //region Создадим точки, углы, текстуры, цвета
        Point3D point1 = new Point3D();
        Point3D point2 = new Point3D();
        Point3D point3 = new Point3D();
        Point3D point4 = new Point3D();
        Point3D point5 = new Point3D();

        Angle3D angle1 = new Angle3D(12.2F);
        Angle3D angle2 = new Angle3D(45.7F);
        Angle3D angle3 = new Angle3D(15.0F);

        Texture texture1 = new Texture(1, "Stone");
        Texture texture2 = new Texture(2, "Sand");
        Texture texture3 = new Texture(3, "Moon");

        Color color1 = new Color("Red");
        Color color2 = new Color("Grey");
        Color color3 = new Color("Yellow");
        //endregion

        //Создадим полигоны, полигональные модели, свет, камеры

        Poligon poligon1 = new Poligon(List.of(point1,point2,point3));
        Poligon poligon2 = new Poligon(List.of(point4,point2,point3));
        Poligon poligon3 = new Poligon(List.of(point5));
        Poligon poligon4 = new Poligon(List.of(point2,point5));

        PoligonalModel polMod1 = new PoligonalModel(List.of(poligon1,poligon2),List.of(texture1));
        PoligonalModel polMod2 = new PoligonalModel(List.of(poligon2,poligon3),List.of(texture2));
        PoligonalModel polMod3 = new PoligonalModel(List.of(poligon3,poligon4),List.of(texture1,texture2));

        Flash flash1 = new Flash(point1,angle1,color1,12F);
        Flash flash2 = new Flash(point2,angle2,color2,17.8F);
        Flash flash3 = new Flash(point3,angle3,color3,29F);

        Camera camera1 = new Camera(point1,angle3);
        Camera camera2 = new Camera(point3,angle2);
        //endregion

        //Создадим сцены:
        Scene scene1 = new Scene(List.of(polMod1,polMod2),List.of(flash1),List.of(camera2));
        Scene scene2 = new Scene(List.of(polMod1,polMod3),List.of(flash2,flash3),List.of(camera1));
        //endregion

        // Создадим ModelStore и можно дать ему некоторые команды
        List<PoligonalModel> pm = new ArrayList<>();
        pm.add(polMod1);
        pm.add(polMod2);
        List<Scene> sc = new ArrayList<>();
        sc.add(scene1);
        sc.add(scene2);
        List<Flash> fl = new ArrayList<>();
        fl.add(flash1);
        fl.add(flash2);
        fl.add(flash3);
        List<Camera> cams = new ArrayList<>();
        cams.add(camera1);
        cams.add(camera2);
        ModelStore modelStore = new ModelStore(pm,sc,fl,cams);
        modelStore.registerModelChanger(observer1);
        modelStore.registerModelChanger(observer2);
        modelStore.registerModelChanger(observer3);

        modelStore.updateModelStore(polMod3);
    }
}
