package src.home_work_2p;

public class main {
    static int SIZE = 4;

    public static void main(String[] args) {
        String[][] arr = {
                {"1", "3", "6", "8"},
                {"4", "5", "4ф", "9"},
                {"4", "2", "2", "4"},
                {"4", "5", "1", "9"}
        };
        try {
            System.out.println(sum(arr));

        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println(e.getRow() + " " + e.getCol());
            System.out.println(arr[e.getRow()][e.getCol()]);
        }


        System.out.println("end");
    }

    static int sum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != SIZE) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != SIZE) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("format " + i + " " + j, i, j);
                }
            }
        }
        return sum;
    }
}
