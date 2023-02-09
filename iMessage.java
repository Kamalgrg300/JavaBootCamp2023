public class iMessage {
    public static void main(String[] args) {

        Message myMessage = new Message();

        byte y = 10;
        byte rN = 50;
      long number = 1235L;


      myMessage.image("  :KAMAL");
      myMessage.image(y);
      myMessage.image();
      myMessage.image(rN,number);
      myMessage.image(number, rN);
    }
}
class Message{
    void image(){
        System.out.println("Displaying picture");
    }
    void image(String Name){
        System.out.println("Name"+ Name);

    }
    void image(int pictureNumber ){
        System.out.println("pictureNumber: " + pictureNumber);
    }

    void image(long referenceNumber ){
        System.out.println("referenceNumber: "+ referenceNumber);

    }
    void image(byte referenceNumber,long item ){
        System.out.println("registerNumber: "+ referenceNumber +  "   item: "+item);
    }
    void image(long item, byte registerNumber){
        System.out.println("registerNumber: "+ registerNumber + "    item : "+item);
    }
}
