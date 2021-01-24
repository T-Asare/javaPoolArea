public class Cuboid extends Rectangle {
    double height;
    public Cuboid (double height, double width, double length) {
        super(width, length);
        if (height < 0) {
            this.height = 0; // set height value to 0 if less than 0
        } else {
            this.height = height;// otherwise if height value is positive, maintain value.
        }
    }
        public double getHeight(){
            return height;
        }
    public double getVolume(){
        return (getArea()*this.height);
    }

}

