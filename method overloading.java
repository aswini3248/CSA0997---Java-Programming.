class room{
    int length;
    int breadth;
    room(int x,int y){
        length=x;
        breadth=y;
    }
    room(int s){
        length=breadth=s;
    }
    int area(){
        return (length*breadth);
    }
}
class area{
    public static void main(String[] args){
        room rectarea=new room(4,5);
        room sqrarea=new room(6);
        int rectanglearea=rectarea.area();
        int squarearea=sqrarea.area();
        System.out.println("Rectangle Area is: "+rectanglearea);
        System.out.println("Square Area is: "+squarearea);
    }
}
