package tigerparking;

/**
 *
 * @author 
 */
public class ParkingLot 
{
    private float radius = 0;
    private float location[] = new float[2];
    private boolean isFull = false;
    public void parkingLot()
    {
        radius = 0;
        location[0]=0;
        location[1]=1;
        isFull = false;
    }
    public void parkingLot(int r, float[] coords, boolean full)
    {
        radius = r;
        location[0] = coords[0];
        location[1] = coords[1];
        isFull = full;
    }
}
