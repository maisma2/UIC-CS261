int isPower(int num) {
      return ((num) & (num-1) == 0);
}

int diagonalSum(int matrix[][3] , int r, int c) {
      int i;
      int sum = 0;
      for(i=0;i<r;i++) {
            sum = sum + matrix[i][i];
      }
      return isPower(sum);
}

int main() {
      int matrix[3][3] = { {1,2,3}, {4,5,6}, {6,7,8}};
      int result = diagonalSum(matrix, 3,3);
      return 0;
}
