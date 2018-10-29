public abstract class  Aircrafts {

    protected String type;
    protected int currentAmmo = 0;
    protected int maxAmmo;
    protected int baseDamage;


    public int fight () {
        currentAmmo = 0;
        return this.baseDamage * this.currentAmmo;
    }

    public int refill (int newAmmo) {
        this.currentAmmo += newAmmo;
        if (this.maxAmmo < this.currentAmmo) {
            this.currentAmmo = this.maxAmmo;
        }
        int remainingAmmo = newAmmo - this.currentAmmo;
        if (0 <= remainingAmmo){
            return remainingAmmo;
        }
        return 0;
    }

    public String getType(){
        return this.type;

    }

    public String getStatus (){
        return "Type "+ this.type + ", Ammo: "+this.currentAmmo+ ", Base Damage: "+this.baseDamage+ ", All Damage: "
                + (this.baseDamage * this.currentAmmo);
    }
    public boolean isPriority () {
        if (this instanceof F35 ){
            return true;
        }
        else {
            return false;
        }
    }
}
