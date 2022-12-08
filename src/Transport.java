import java.util.ArrayList;

public abstract class Transport {
    private final String brand;

    private final String model;

    public double engineVolume;

    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor<?>> sponsor = new ArrayList<>();

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.6;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void addDriver(Driver<?> driver) {
        drivers.add(driver);

    }
    public void addMechanic(Mechanic<?> mechanic) {
        mechanic.add(mechanic);
    }
    public void addSponsor(Sponsor<?> sponsor) {
       sponsor.add(sponsor);
    }

    public abstract void startMove();

    public abstract void stopMove();

    public abstract void printType();

    public abstract boolean diagnostics();

    public abstract boolean service();

    public abstract void repair();

    public List<Sponsor<?>> getSponsor() {
        return sponsor;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }
}


