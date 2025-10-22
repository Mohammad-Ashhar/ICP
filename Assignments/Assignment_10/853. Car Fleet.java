class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        double[][] cars=new double[n][2];
        for(int i=0;i<n;i++)
        {
            cars[i][0]=position[i];
            cars[i][1]=speed[i];
        }
        Arrays.sort(cars,(a,b)->Double.compare(b[0],a[0]));
        int c=0;
        double min=0.0;
        for(int i=0;i<n;i++)
        {
            double t=(target-cars[i][0])/cars[i][1];
            if(t>min)
            {
                min=t;
                c++;
            }
        }
        return c;
        
    }
}