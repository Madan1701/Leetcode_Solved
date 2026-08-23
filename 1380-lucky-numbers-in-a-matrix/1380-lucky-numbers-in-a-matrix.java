class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<matrix.length;i++ ){
            int min = matrix[i][0];
            int col = 0;
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    col = j;
                }
            }
            boolean isl = true;

            for(int k = 0;k<matrix.length;k++){
                if(matrix[k][col]>min){
                isl = false;
                break;
                }
            }
            if(isl) list.add(min);
        }
        return list;
    }
}