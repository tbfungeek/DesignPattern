package mediator;

public class CPUProcessor {

    private String video = null;
    private String audio = null;

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public void spliteData(String data) {
        String datas[] = data.split(":");
        video = datas[1];
        audio = datas[0];
        Mediator.getInstance().processFinished(this);
    }

}
