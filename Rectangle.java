//rectangle class with two methods. set values and get area
class Rectangle {
    
    private int length;
    private int breadth;
    
    public void setLB(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    public int getArea(){
        return length * breadth;
    }
    
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLB(10,4);
        int area = r.getArea();
        System.out.println(area);
    }
}
