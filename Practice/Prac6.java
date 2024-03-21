// Remote Control Interface:
// Design a remote control system using interfaces. Define an interface RemoteControl with methods powerOn(), powerOff(), volumeUp(), and volumeDown(). Implement this interface in classes representing different types of remote controls, such as TVRemote, StereoRemote, etc.
// Define the RemoteControl interface
interface RemoteControl {
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}

// Implement TVRemote class
class TVRemote implements RemoteControl {
    @Override
    public void powerOn() {
        System.out.println("TV is powered on");
    }

    @Override
    public void powerOff() {
        System.out.println("TV is powered off");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume up on TV");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume down on TV");
    }
}

// Implement StereoRemote class
class StereoRemote implements RemoteControl {
    @Override
    public void powerOn() {
        System.out.println("Stereo is powered on");
    }

    @Override
    public void powerOff() {
        System.out.println("Stereo is powered off");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume up on Stereo");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume down on Stereo");
    }
}

// Main class to test the remote controls
public class Prac6 {
    public static void main(String[] args) {
        RemoteControl tvRemote = new TVRemote();
        RemoteControl stereoRemote = new StereoRemote();

        // Using TV Remote
        tvRemote.powerOn();
        tvRemote.volumeUp();
        tvRemote.volumeDown();
        tvRemote.powerOff();

        // Using Stereo Remote
        stereoRemote.powerOn();
        stereoRemote.volumeUp();
        stereoRemote.volumeDown();
        stereoRemote.powerOff();
    }
}

