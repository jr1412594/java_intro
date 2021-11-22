public abstract class Crashable {
    boolean carDrivable = true;

    public void youCrashed() {
        this.carDrivable = false;
    }

    public abstract void setCarStength(int carStrength);

    public abstract int getCarStrength();
    
}