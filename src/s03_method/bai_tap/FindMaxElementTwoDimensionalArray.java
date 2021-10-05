package s03_method.bai_tap;

public class FindMaxElementTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] twoDimensionalArray={{1,2,3},{1,5,8,7}};
        int max= twoDimensionalArray[0][0];
        int indexX=0;
        int indexY=0;

        for(int i=0;i<twoDimensionalArray.length;i++){
            for(int j=0;j<twoDimensionalArray[i].length;j++){
                if (twoDimensionalArray[i][j]>=max){
                    max=twoDimensionalArray[i][j];
                    indexX=i;
                    indexY=j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất của mảng 2 chiều là: "+max+" ,tại vị trí ["+indexX+"]["+indexY+"]");
    }
}
