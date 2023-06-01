import java.util.Scanner;

//phím tắt ctrl+alt+l để làm clean code
public class Main { // 1 lớp
    public static void main(String[] args) { // 1 hàm
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String hoTen = scanner.nextLine();
        //
        String[] mangTen = hoTen.split("\\s+"); //lệnh split để tách các chuỗi
        StringBuilder hoTenVietHoa = new StringBuilder(); // tạo một biến mới, dùng StringBuilder để dùng append
        for (String ten : mangTen) { //Sử dụng vòng lặp `for` để lặp qua từng từ trong mảng `mangTen`.
            if (ten.length() > 0) {
                hoTenVietHoa.append(ten.substring(0, 1).toUpperCase());// Lấy ký tự đầu tiên của từ hiện tại(vị trí 0) và chuyển đổi nó thành chữ in hoa sau đó thêm nó vào chuỗi mới bằng phương thức `append`
                hoTenVietHoa.append(ten.substring(1).toLowerCase());//lấy phần còn lại của từ (vị trí 1 đến hết chỗi) và chuyển đổi tất cả các ký tự thành chữ thường
                hoTenVietHoa.append(" ");// thêm khoảng trắng vào cuối chuỗi
            }
        }
////
////        int soKyTuKhongKhoangTrang = 0;
////        for (int i = 0; i < hoTen.length(); i++) {
////            if (hoTen.charAt(i) != ' ') { //charAt là lấy ký tự ở 1 vị trí xác định trong chuỗi
////                soKyTuKhongKhoangTrang++;
////            }
////        }
//
        System.out.println("Tên đầy đủ của bạn là: " + hoTenVietHoa);
//        System.out.println("Số ký tự trong tên của bạn là: " +soKyTuKhongKhoangTrang);
//
//        for (int i = 2; i <= 100; i++)
//            if (i % 2 == 0) {
//                System.out.print("\ni = " + i);
//            }
//        Scanner x = new Scanner(System.in); // x là đối tượng của lớp Scanner
//        System.out.print("Nhập vào số nguyên (x): ");
//        int number = x.nextInt();
//        System.out.print("f(x) = " + number*number);
        String[] sentences = {
                "Đầu lòng hai ả tố nga,",
                "Thúy Kiều là chị, em là Thúy Vân.",
                "Mai cốt cách, tuyết tinh thần,",
                "Mỗi người một vẻ, mười phân vẹn mười.",
                "Vân xem trang trọng khác vời,",
                "Khuôn trăng đầy đặn, nét ngài nở nang.",
                "Hoa cười ngọc thốt đoan trang,",
                "Mây thua nước tóc, tuyết nhường màu da."
        };

        int indentSize = 0;
        for (int i = 0; i < sentences.length; i++) {
            // So sánh độ dài câu thơ hiện tại với câu thơ tiếp theo
            if (i < sentences.length - 1 && sentences[i].length() < sentences[i + 1].length()) {
                indentSize += 4; // Tăng kích thước thụt lề
            } else {
                indentSize = 0; // Không thụt lề
            }
            // Thực hiện thụt lề bằng cách in kí tự space
            for (int j = 0; j < indentSize; j++) {
                System.out.print(" ");
            }
            // In ra câu thơ
            System.out.print(sentences[i] +"\n");
        }
    }
}