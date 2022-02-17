import java.awt.*;
import java.util.LinkedList;

public class Handler { //handles and updates the objects in render. individually update and render them to the screen

    LinkedList<Object> objects = new LinkedList<Object>();

    public void tick() {
        for (int i = 0; i < objects.size(); i++) {
            Object object = objects.get(i);
            object.tick();
        }
    }

    public void render(Graphics g) {
        for (int i = 0; i < objects.size(); i++) {
            Object object = objects.get(i);
            object.render(g);
        }

    }

    public void addObject(Object object) { //add the objects
        this.objects.add(object);

    }
    public void removeObject(Object object){ //remove the objects
        this.objects.remove(object);
    }

}




/*


 Vector<Object> object = new Vector<Object>();


    public void render(Graphics g){
        for (int i=0 ; i<object.size();i++){
            Object tempObject = object.get(i);
            tempObject.render(g);
        }
    }



 */