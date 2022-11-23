public class OccasionalViewer implements VideoUploadObserver{ //creates OccasionalViewer class implenenting the VideoUploadObserver interface

    @Override //overrides the parent class' method with child class parameters
    public void update(String message){ //creates update method with a string parameter
        processMessage(message); //runs the "processMessage method with a parameter of "message"
    }

    private void processMessage(String message){ //creates a method called processMessage with a string parameter
        System.out.println("Occasional viewer might watch your video but it is not likely."); //outputs this text when an occasional viewer gets a notification for a video upload
    }
}