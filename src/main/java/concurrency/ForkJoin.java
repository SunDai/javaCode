package concurrency;

import java.util.concurrent.RecursiveAction;

/**
 * Created by xh on 2015/11/17.
 */
public class ForkJoin extends RecursiveAction{

    private int[] mSource;
    private int mStart;
    private int mLength;
    private int[] mDestination;

    private int mBlurWidth = 15;

    public ForkJoin(int[] src, int start, int length, int[] dst) {
        mSource = src;
        mStart = start;
        mLength = length;
        mDestination = dst;
    }

    protected void computeDirectly() {
        int sidePixels = (mBlurWidth - 1) / 2;
        for (int index = mStart; index < mStart + mLength; index++) {
            // Calculate average.
            float rt = 0, gt = 0, bt = 0;
            for (int mi = -sidePixels; mi <= sidePixels; mi++) {
                int mindex = Math.min(Math.max(mi + index, 0),
                        mSource.length - 1);
                int pixel = mSource[mindex];
                rt += (float)((pixel & 0x00ff0000) >> 16)
                        / mBlurWidth;
                gt += (float)((pixel & 0x0000ff00) >>  8)
                        / mBlurWidth;
                bt += (float)((pixel & 0x000000ff) >>  0)
                        / mBlurWidth;
            }

            // Reassemble destination pixel.
            int dpixel = (0xff000000     ) |
                    (((int)rt) << 16) |
                    (((int)gt) <<  8) |
                    (((int)bt) <<  0);
            mDestination[index] = dpixel;
        }
    }

    protected static int sThreshold = 100000;

    @Override
    protected void compute() {
        if (mLength < sThreshold) {
            computeDirectly();
            return;
        }

        int split = mLength / 2;

        invokeAll(new ForkJoin(mSource, mStart, split, mDestination),
                new ForkJoin(mSource, mStart + split, mLength - split,
                        mDestination));
    }

    public static void main(String[] args){
//        ForkJoin fb = new ForkJoin(src, 0, src.length, dst);
    }
}
