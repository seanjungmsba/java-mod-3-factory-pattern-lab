/*
You'll model a photographer who will manage the camera and use it to take pictures. Here is what you will need:
1. A private Camera object.
2. A constructor that initializes the internal instance of Camera with the right type of camera from our Enum in CameraManufacturer -
for now, you can choose which manufacturer you want to use - in reality the decision could be made by an user (by gathering input from them) or even by configuration.
3. A takePhotograph() method that calls the takePhotograph() method of the Camera class.
We will then model a studio, which will be our runner class and will create an instance of Photographer and call its takePhotograph() method.
 */
public class Photographer extends Camera {

    public Photographer(FilmOperations filmOps, ShutterOperations shutterOps, MirrorOperations mirrorOps) {
        super(filmOps, shutterOps, mirrorOps);
    }

    public void takePhotograph(double shutterSpeed) {
    }

    @Override
    public String getName() {
        return null;
    }

}
