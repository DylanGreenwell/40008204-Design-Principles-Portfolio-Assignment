public class MainCode{ //creating a public class called MainCode
    public static void main(String[] args){ //creates a new main for the code to be run in

        VideoUpload gamingChannel = new VideoChannel(); //creates a new channel which can have observers
        Observer viewer1 = new ActiveViewer(); //creates a new observer with the "ActiveViewer" attribute
        Observer viewer2 = new OccasionalViewer(); //creates a new observer with the "OccasionalViewer" attribute
        Observer viewer3 = new ActiveViewer(); //creates a new observer with the "ActiveViewer" attribute


        gamingChannel.addSubscriber(viewer1); //viewer1 is now an observer of the gamingChannel
        gamingChannel.addSubscriber(viewer2); //viewer2 is now an observer of the gamingChannel
        gamingChannel.addSubscriber(viewer3); //viewer3 is now an observer of the gamingChannel

        gamingChannel.notifySubscriber(); //runs the notifySubscriber method which tells each observer that a new video has been uploaded

        gamingChannel.removeSubscriber(viewer2); //removes viewer2 from the active subscriber list (they may have clicked unsubscribe)

        gamingChannel.notifySubscriber(); //runs the notifySubscriber method again but this time it will only broadcast the notification to viewer 1 and 3 as viewer 2 unsubscsribed
    }
}