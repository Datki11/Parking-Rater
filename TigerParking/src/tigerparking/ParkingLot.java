package tigerparking;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class ParkingLot 
{
    private float radius = 0;
    private float location[] = new float[2];
    private boolean isFull = false;
    private String lotID = "";
    public void parkingLot()
    {
        radius = 0;
        location[0]=0;
        location[1]=1;
        isFull = false;
        lotID = "";
    }
    public void parkingLot(int r, float[] coords, boolean full, String lotName)
    {
        radius = r;
        location[0] = coords[0];
        location[1] = coords[1];
        isFull = full;
        lotID = lotName;
    }
    public int rateLot()
    {
        Scanner in = new Scanner (System.in);
        System.out.print("Did you park here?");
        String park = in.next();
        System.out.print("On a scale of 1-5, 1 being empty and 5 being full, how full would you rate the lot?");
        int rating = in.nextInt();
        return rating;
    }
}
