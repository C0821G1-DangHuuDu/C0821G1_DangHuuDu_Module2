package s06_inheritance_polymophism.thuc_hanh;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color="green";
        this.filled=true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString(){
        if(this.filled) {
            return "A Shape with color of " + this.color + " and filled";
        }else {
            return "A Shape with color of " + this.color + " and not filled";
        }
    }
}
