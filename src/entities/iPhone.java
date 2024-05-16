package entities;

public class iPhone implements Phone, iPod, InternetBrowser{

    public iPhone() {
    }

    //Phone
    @Override
    public void makeCall(long number) {
    }
    @Override
    public void answerCall() {
    }
    @Override
    public void leaveVoiceMail() {
    }

    //iPod
    @Override
    public void playMusic() {
    }
    @Override
    public void pauseMusic() {
    }
    @Override
    public void selectMusic() {
    }

    //InternetBrowser
    @Override
    public void displayPage() {
    }
    @Override
    public void addNewTab() {
    }
    @Override
    public void updatePage() {
    }

    @Override
    public String toString() {
        return "Current version: iPhone 15";
    }
}
