interface LightAction {
    void execute();
}

public class lamda_smarthome {
    public static void main(String[] args) {
        LightAction motionTrigger = () -> System.out.println("Lights ON due to motion detection");
        LightAction timeTrigger = () -> System.out.println("Lights dimmed for evening mode");
        LightAction voiceTrigger = () -> System.out.println("Voice command received: Turning lights OFF");

        motionTrigger.execute();
        timeTrigger.execute();
        voiceTrigger.execute();
    }
}
