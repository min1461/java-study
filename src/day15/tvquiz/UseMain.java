package day15.tvquiz;

public class UseMain {
   public static void main(String[] args){
        TV t;
        t = new TV();
        t.disp();
        t.power();
        t.channelUp();
        t.volumeDown();
        t.disp();
        
        RemoteController rc = new RemoteController();
        rc.tv = t;
        rc.channelUp();
        rc.channelUp();
        rc.channelUp();
        
        t.disp();
    }
}