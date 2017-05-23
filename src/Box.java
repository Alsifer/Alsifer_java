import java.util.Objects;

public class Box {

    double width;
    double height;
    double depth;

    public Box(double width,double height,double depth){
        if(width > 0 && height > 0 && depth > 0){
            this.depth = depth;
            this.height = height;
            this.width = width;
        }
    }

    public double getVolume(){
        return this.depth * this.height * this.width;
    }

    @Override
    public String toString(){
        return String.format("Ящик размером %.2f м * %.2f м * %.2f м",this.width,this.height,this.depth);
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Box)){
            return false;
        }

        Box b = (Box) obj;

        if(this.width == b.width && this.height == b.height && this.depth == b.depth){
            return true;
        }else{
            return false;
        }

    }

}
