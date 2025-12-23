class Box{
   int length;
   int width;
   int height;


   public void setSize(int l, int w, int h){
       length = l;
       width = w;
       height = h;
   }
   public void printVolume(){
       int volume;
       volume=length*width*height;
       System.out.println("Volume of the box : "+volume);
   }


   public void printArea(){
       int area;
       area=2*length*width+2*length*height+2*width*height;
       System.out.println("Area of the Box : "+area);
   }


   public void setLength(int l){
       length = l;
   }
   public void setWidth(int w){
       width = w;
   }
   public void setHeight(int h){
       height = h;
   }


}


public class Example {
   public static void main(String[] args) {
       Box b1 = new Box();
       b1.setSize(12,5,3);
       b1.printVolume();
       b1.printArea();


       b1.setLength(120);
       b1.setWidth(50);
       b1.setHeight(30);


       b1.printVolume();
       b1.printArea();
   }
}
