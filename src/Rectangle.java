public class Rectangle {

    int length; //длинна
    int width; //ширина

    public int perimeter(){ //периметр
        return ((length+width)*2);
    }
    public int area(){ //площадь
        return (length*width);
    }

    @Override
    public String toString() {
        return "Rectangle\n" +
                "length = " + length +
                ", width = " + width;
    }
}
