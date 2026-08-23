class Solution {
    public int[][] flipAndInvertImage(int[][] images) {
        for(int i = 0;i<images.length;i++){
            int left =0;
            int right = images[i].length - 1;
            while(left<=right){
                int temp = images[i][left];
                images[i][left] = images[i][right];
                images[i][right] = temp;
                images[i][left] = 1-images[i][left];
                if(left!=right)
                images[i][right] = 1 - images[i][right];

                left++;
                right--;
            }
        }
        return images;
    }
}