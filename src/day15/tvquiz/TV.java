package day15.tvquiz;

public class TV{
    boolean power;//전원
    int channel;//채널
    int volume;//볼륨
    void power() { power = !power; }
    void channelUp() { channel++; }
    void channelDown() { channel--; }
    void volumeUp() { volume++; }
    void volumeDown() { volume--; }
    void disp(){
        if(power) 		System.out.print("전원 : 켜짐 ");
        else 		System.out.print("전원 : 꺼짐 ");
        System.out.print("채널 : "+ channel);
        System.out.println("볼륨 : "+ volume);
    }
}