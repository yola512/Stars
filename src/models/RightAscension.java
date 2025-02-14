package src.models;

import java.io.Serializable;

public class RightAscension implements Serializable {
    private int xx;
    private int yy;
    private double zz;

    // constructor
    public RightAscension(int xx, int yy, double zz) {
        // xx - hours
        if (xx < 0 || xx > 24) {
            throw new IllegalArgumentException("Hours must be values between 0 and 24");
        }
        this.xx = xx;
        // yy - minutes
        if (yy < 0 || yy >= 60) {
            throw new IllegalArgumentException("Minutes must be values between 0 and 60");
        }
        this.yy = yy;
        // zz - seconds
        if (zz < 0 || zz >= 60) {
            throw new IllegalArgumentException("Seconds must be values between 0 and 60");
        }
        this.zz = zz;
    }

    // GETTERS
    // xx - hours
    public int getXX() {
        return xx;
    }

    // yy - minutes
    public int getYY() {
        return yy;
    }

    // zz - seconds
    public double getZZ() {
        return zz;
    }

    // didn't use setters in RightAscension/Declination classes bc Star coordinates change in 26000 years
    // due to precession; coordinates changes are insignificant

    // toString()
    @Override
    public String toString() {
        return String.format("%02dh %dm %.2fs", getXX(), getYY(), getZZ());
    }
}
