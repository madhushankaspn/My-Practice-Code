
//Default Constructor

class Box {
   int length;
   int width;
   int height;
   
   Box(){
       length = 1;
       width = 1;
       height = 1;
       System.out.println("Default Constructor");
   }


   public void printVolume() {
       int volume;
       volume = length * width * height;
       System.out.println("volume : " + volume);
   }
}


public class Example {
   public static void main(String[] args) {
       Box box = new Box();
       box.printVolume();
      
       System.out.println(box.length);
       System.out.println(box.width);
       System.out.println(box.height);
   }
}
