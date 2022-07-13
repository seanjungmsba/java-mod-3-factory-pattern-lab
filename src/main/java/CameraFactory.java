public class CameraFactory {

    public enum CameraManufacturer {
        Canon,
        Nikon,
        Sony,
        Fujifilm,
        Panasonic
    }

    public Camera getCamera(CameraManufacturer manufacturer){

        switch (manufacturer) {
            case Canon:
                return new Canon();
            case Nikon:
                return new Nikon();
            case Sony:
                return new Sony();
            case Fujifilm:
                return new Fujifilm();
            case Panasonic:
                return new Panasonic();
            default:
                return null;
        }

    }
    
}

class Canon implements Camera {
    @Override
    public void takePhotograph() {
        System.out.println("Canon camera takes a snap!");
    }
}

class Nikon implements Camera {
    @Override
    public void takePhotograph() {
        System.out.println("Nikon camera takes a snap!");
    }
}

class Sony implements Camera {
    @Override
    public void takePhotograph() {
        System.out.println("Sony camera takes a snap!");
    }
}

class Fujifilm implements Camera {
    @Override
    public void takePhotograph() {
        System.out.println("Fujifilm camera takes a snap!");
    }
}

class Panasonic implements Camera {
    @Override
    public void takePhotograph() {
        System.out.println("Panasonic camera takes a snap!");
    }
}
