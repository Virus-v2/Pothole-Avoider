package com.oscarsc.potholeavoider.artificial_intelligence;

/**
 * Created by oscar on 02/03/2016.
 */
public interface RollingWindowChangesListener {
    void newRollingWindowRawData(float[][][] snapshotOfAccelGyroMagnetoInRawWindows,
                                 int[] snapshotOfSpeedWindow);
    void newRollingWindowTransformedToRealWorld(float[][][] snapshotAccelGyroMagnetoRealWorldWindows,
                                                int[] snapshotOfSpeedWindow);

    /* Matrix format:
                        AccelX|AccelY|AccelZ|GyroX|GyroY|GyroZ|MagnetoX|MagnetoY|MagnetoZ|Speed
            mean
            variance
            svm
            */
    void newRollingWindowDeviceWorldCalculus(float[][] calculusMatrix);
    void newRollingWindowRealWorldCalculus(float[][] calculusMatrix);
}
