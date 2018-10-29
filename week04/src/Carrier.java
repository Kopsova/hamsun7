import java.util.ArrayList;

public class Carrier {

    ArrayList<Aircrafts> aircrafts = new ArrayList<>();
    private int ammoAmount;
    public int healthPoint;
    private int requiredAmmo = 0;


    public Carrier(int ammoAmount, int healthPont) {
        this.ammoAmount = ammoAmount;
        this.healthPoint = healthPoint;
    }

    public void add(Aircrafts aircraft){
        aircrafts.add(aircraft);
        this.requiredAmmo += aircraft.maxAmmo;
    }

    public void fill() throws CarrierException {
        if (ammoAmount <= 0) {
            throw new CarrierException("Sorry, no more ammo");
        }
        if (this.requiredAmmo < this.ammoAmount) {
            for (Aircrafts aircraft : this.aircrafts) {
                this.ammoAmount = aircraft.refill(this.ammoAmount);
            }
        } else {
            // temporary list for f16s
            ArrayList<Aircrafts> f16s = new ArrayList<>();
            for (Aircrafts aircraft : this.aircrafts) {
                if (aircraft.isPriority()) {
                    this.ammoAmount = aircraft.refill(this.ammoAmount);
                    if (0 == this.ammoAmount) {
                        // there is no ammo at carrier I dont need to check rest of aircraft
                        break;
                    }
                } else {
                    // adding f16s to temporary list
                    f16s.add(aircraft);
                }
            }
            if (this.ammoAmount > 0 && f16s.size() > 0) {
                for (Aircrafts f16 : f16s) {
                    this.ammoAmount = f16.refill(this.ammoAmount);
                    if (0 == this.ammoAmount) {
                        break;
                    }
                }
            }
        }
    }

    public void fight (Carrier rival) {
        int rivalDamage = 0;
        for (Aircrafts aircraft : this.aircrafts){
            rivalDamage += aircraft.fight();
        }
        rival.healthPoint -= rivalDamage;
    }

    public String getStatus ()


















}
