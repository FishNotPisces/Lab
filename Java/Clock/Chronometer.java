package Clock;

public class Chronometer {
    public Chronometer() {
        reset();
    }

    public void start() {
        this.istant_start = System.nanoTime();
    }

    public void stop() {
        this.istant_stop = System.nanoTime();
    }

    public void reset() {
        this.istant_start = 0;
        this.istant_stop = 0;
    }

    public String getElapsedTime() {
        this.time_delta = this.istant_stop - this.istant_start;
        double time_delta_in_sec = this.time_delta/1E9;
        return "" + time_delta_in_sec;
    }

    public boolean isRunning() {
        boolean isRunning;
        if (this.istant_start > this.istant_stop) isRunning = true;
        else isRunning = false;
        return isRunning;
    }

    public boolean isTimeReady() {
        boolean isTimeReady;
        if (this.istant_start < this.istant_stop) isTimeReady = true;
        else isTimeReady = false;
        return isTimeReady;
    }

    public String toString() {
        String state = "off";
        if (this.isRunning()) {
            state = "running";
        }
        else if (this.isTimeReady()) {
            state = "ready " + getElapsedTime();
        }
        return state;
    }

    private long time_delta;
    private long istant_start;
    private long istant_stop;
}
