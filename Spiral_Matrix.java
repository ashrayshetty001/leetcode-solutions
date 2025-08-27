class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result=new ArrayList<>();
        if(matrix.length==0){
            return result;
        }
        int start_row=0,end_row=matrix.length-1,start_col=0,end_col=matrix[0].length-1,j=0;
        while(start_row<=end_row && start_col<=end_col){
            //toprow
            for(int i=start_col;i<=end_col;i++){
                result.add(matrix[start_row][i]);
            }
            start_row++;
            //rightcol
            for(int i=start_row;i<=end_row;i++){
                result.add(matrix[i][end_col]);
            }
            end_col--;
            //bottomrow
            if(start_row<=end_row){
            for(int i=end_col;i>=start_col;i--){
                result.add(matrix[end_row][i]);
            }
            end_row--;
            }
            
            //leftcol
            if(start_col<=end_col){
            for(int i=end_row;i>=start_row;i--){
                result.add(matrix[i][start_col]);
            }
            
            start_col++;
            }

        }
        return result;
    }
}
