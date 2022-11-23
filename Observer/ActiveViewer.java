public class ActiveViewer implements VideoUploadObserver{ //creates ActiveViewer class implenenting the VideoUploadObserver interface

    @Override //overrides the parent class' method with child class parameters
    public void update(String message){ //creates update method with a string parameter
        processMessage(message); //runs the "processMessage method with a parameter of "message"
    }

    private void processMessage(String message){ //creates a method called processMessage with a string parameter
        System.out.println("Active viewer will be binge-watching your videos."); //outputs this text when an active viewer gets a notification for a video upload
    }
}