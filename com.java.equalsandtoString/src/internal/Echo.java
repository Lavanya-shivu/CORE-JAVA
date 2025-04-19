package internal;

import java.util.Objects;

public class Echo {
    private String source;
    private String pitch;
    private int duration; // in seconds
    private boolean isLoud;

    public void setSource(String source) {
        this.source = source;
    }

    public void setPitch(String pitch) {
        this.pitch = pitch;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setLoud(boolean isLoud) {
        this.isLoud = isLoud;
    }

    @Override
    public String toString() {
        return "Echo{" + "source='" + source +", pitch='" + pitch + ", duration=" + duration + ", isLoud=" + isLoud + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Echo) {
            Echo echo = (Echo) obj;
            if (Objects.equals(this.source, echo.source) &&
                    Objects.equals(this.pitch, echo.pitch) &&
                    Objects.equals(this.duration,echo.duration) &&
            Objects.equals(this.isLoud,echo.isLoud)) {
                System.out.println("Echo objects are matching");
                return true;
            }
            System.err.println("Echo objects are not matching");
            return false;
        }
        System.out.println("Invalid object passed for comparison");
        return false;
    }
}
