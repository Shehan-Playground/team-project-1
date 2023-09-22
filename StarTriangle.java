class StarTriangle {
    public static void main(String[] args) {
        for (int i = 0, j=4; j >=0; i++) {
            System.out.print("* ");
            if (i==j) {
                System.out.println();
                j--;
                i=-1;
            }
        }
    }
}