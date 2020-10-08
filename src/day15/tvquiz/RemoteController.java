package day15.tvquiz;

public class RemoteController {
   TV tv;
   
   void power() { tv.power(); }
    void channelUp() { tv.channelUp(); }
    void channelDown() { tv.channelDown(); }
    void volumeUp() { tv.volumeUp(); }
    void volumeDown() { tv.volumeDown(); }
}