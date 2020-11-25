package groupExercises.ex05;

public interface WebDriver {
    void open();
    void close();

    String getTitle();
}

interface RemoteWebDriver extends WebDriver{
    void navigate();
}

interface TakesScreenShot{
    void getScreenShot();
}

class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
    }
    @Override
    public void close() {

    }
    @Override
    public String getTitle() {
        return null;
    }
    @Override
    public void navigate() {
    }
}

