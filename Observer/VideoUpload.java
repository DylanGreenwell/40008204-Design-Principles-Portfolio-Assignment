public interface VideoUpload{ //creating the video upload interface which is the thing we will be observing
    public void addSubscriber(Observer observer); //creates the addSubscriber method using observers

    public void removeSubscriber(Observer observer); //creates the removeSubscriber method using observers

    public void notifySubscriber(); //creates the notifySubscriber method
}