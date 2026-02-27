package main.session7;

public class Main {
    public static void main(String[] args) {
        try {// cấu trúc xử lý ngoại lệ dùng để bắt lỗi chương trình đang chạy và ngăn chương trình bị crash
            System.out.println("Start...");
            int x = 10;
            int y = 0;
            if (0 < y && y < 5) {
                throw new Exception("Số bé quá không được!");
            } else if (y <= 0) {
                throw new ArithmeticException("Số chưa hợp lệ");
            }
            int z;
            z = x / y;
            System.out.println("z=" + z);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //lúc nào cũng chạy qua;
        }
        try {
            readExcelFile();
        }catch (Exception e){

        }
    }
    public static void readExcelFile() throws Exception{

        try{
            //giả sử hàm này sẽ có thể có exception
        }catch (Exception e){

        }
    }
}
