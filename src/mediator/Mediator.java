package mediator;

public class Mediator {
    private Mediator() {}

    private static Mediator mInstance;

    public static Mediator getInstance() {
        if (mInstance == null) {
            mInstance = new Mediator();
        }
        return mInstance;
    }

    private String mData;
    private String mAudio;
    private String mVideo;

    public void processFinished(Object object) {

        if(object instanceof CDReader) {
            mData = ((CDReader) object).getData();
            new CPUProcessor().spliteData(mData);
        }else if(object instanceof CPUProcessor) {
            mAudio = ((CPUProcessor) object).getAudio();
            mVideo = ((CPUProcessor) object).getVideo();
            MediaPlayer player = new MediaPlayer();
            player.PlayAudio(mAudio);
            player.PlayVideo(mVideo);
        }else {
            System.out.println("=====================");
        }
    }
}
