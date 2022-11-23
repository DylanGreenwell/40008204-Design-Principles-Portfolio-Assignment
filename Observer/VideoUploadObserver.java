public interface VideoUploadObserver{ //creates the actual observer interface
    public void update(String message); //update method to notify other observers when there is a change
}