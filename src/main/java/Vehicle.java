public class Vehicle implements IAttack {
    private String type;
    private int healthValue;

    public Vehicle(String type, int healthValue){
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public void attack(int damage){
        this.healthValue =- damage;
    }
}
