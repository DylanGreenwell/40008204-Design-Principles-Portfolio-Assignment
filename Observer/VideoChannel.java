public class VideoChannel implements VideoUpload{ //creates new VideoChannel class using the VideoUpload interface
    private List<VideoShareObserver> viewers = new ArrayList<>(); //creates a new private list of viewers

    @Override //the parent class (VideoUpload) has the same method as below so this will override the parent class function with parameters from the child class
    public void addSubscriber(Observer viewer){ //defines a new addSubscriber method for adding new viewers
        viewers.add(viewer); //adds the viewer to the list/array
    }

    @Override //the parent class (VideoUpload) has the same method as below so this will override the parent class function with parameters from the child class
    public void removeSubscriber(Observer viewer){ //defines a new removeSubscriber method for removing viewers
        viewers.remove(viewer); //removes the viewer from the list/array
    }

    @Override //the parent class (VideoUpload) has the same method as below so this will override the parent class function with parameters from the child class
    public void notifySubscriber(){ //creates notifySubscriber method with no parameters
        System.out.println("A new video has been released, click here to check it out!"); //outputs the text
        for(Observer viewer: viewers){ //for each viewer in the "viewers" list
            viewer.update("Video viewed."); //updates to show that the video has been viewed by a viewer
        }
    }
}