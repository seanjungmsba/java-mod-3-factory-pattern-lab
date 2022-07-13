public class Photographer {
    Camera canonCamera;
    Camera sonyCamera;
    Camera nikonCamera;
    Camera fujifilmCamera;
    Camera panasonicCamera;

    public Photographer(){
        CameraFactory factory = new CameraFactory();
        canonCamera = factory.getCamera(CameraFactory.CameraManufacturer.Canon);
        sonyCamera = factory.getCamera(CameraFactory.CameraManufacturer.Sony);
        nikonCamera = factory.getCamera(CameraFactory.CameraManufacturer.Nikon);
        fujifilmCamera = factory.getCamera(CameraFactory.CameraManufacturer.Fujifilm);
        panasonicCamera = factory.getCamera(CameraFactory.CameraManufacturer.Panasonic);
    }

    public void takePhotographWithCanon(){
        canonCamera.takePhotograph();
    }

    public void takePhotographWithSony(){
        sonyCamera.takePhotograph();
    }

    public void takePhotographWithNikon(){
        nikonCamera.takePhotograph();
    }

    public void takePhotographWithFujifilm(){
        fujifilmCamera.takePhotograph();
    }

    public void takePhotographWithPanasonic(){
        panasonicCamera.takePhotograph();
    }

}