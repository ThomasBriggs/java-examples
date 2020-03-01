/**
 * Car
 */
public class Car {

    private String name;
    private String colour;
    private int reg;

    Car(String name, String colour, int reg) {
        setName(name);
        setColour(colour);
        setReg(reg);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getReg() {
        return this.reg;
    }

    public void setReg(int reg) {
        this.reg = reg;
    }


}