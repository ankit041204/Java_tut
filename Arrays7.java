public class rainwaterharvestingArrays{
    public static int trappedRainwater (int height[]){

        int n=height.length;
        int leftMax[] = newint[height.length];
        leftMax[0] = height[0];

        for (int i=1; i<height.length;i++){

            leftmax[i] = Math.max(height[i], leftmax[i-1]);

            int rightMax [] = new int[n];
            rightMax [n-1] = height[n-1];

            for (int i=n-2;i>=0;i--){
                rightMax[i] = Math.max(height[i],rightMax[i+1]);
            }
            int trappedRainwater =0;

            for (int i=0;i<n;i++){
                int waterlevel = Math.min(leftmax[i],rightmax[i]);
            }
            return trappedRainwater;
        }
        public static void main(String args[]){
            int height[] = {4,2,0,6,3,2,5};

            System.out.println(trappedRainwater(height));
        }
    }

}