public class Pen {

    private String colour;
    private String thickness;



    public Pen(String colour,String thickness){
        this.colour = colour;
        this.thickness = thickness;
    }


    @Override
    public String toString() {
        return "This pen is "+this.colour+" and it is "+this.thickness;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getThickness() {
        return thickness;
    }

    public void setThickness(String thickness) {
        this.thickness = thickness;
    }
}
