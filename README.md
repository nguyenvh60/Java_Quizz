# Java_Quiz
Java Quiz — Bài kiểm tra lập trình dành cho người mới bắt đầu
Một ứng dụng kiểm tra chạy trên giao diện dòng lệnh (console), được xây dựng bằng ngôn ngữ Java nhằm giúp người mới bắt đầu thực hành các kiến ​​thức lập trình cơ bản thông qua các câu hỏi trắc nghiệm.

 Tổng quan
Java Quiz là ứng dụng thân thiện với người mới bắt đầu, được thiết kế để củng cố kiến ​​thức lập trình căn bản thông qua các bài kiểm tra tương tác.Dự án tập trung vào việc thực hành Lập trình hướng đối tượng (OOP), tổ chức mã nguồn Java thành các thành phần dễ bảo trì, đồng thời áp dụng các nguyên tắc kiểm thử phần mềm cơ bản.

   1. Các tính năng

- Hiển thị các câu hỏi trắc nghiệm.
- Tiếp nhận và kiểm tra tính hợp lệ của câu trả lời từ người dùng.
- Tính toán và hiển thị điểm số cuối cùng.
- Cung cấp phản hồi về kết quả bài kiểm tra.
- Tổ chức các câu hỏi và logic của bài kiểm tra vào các lớp (class) riêng biệt.
- Các tính năng cần được cập nhật để khớp với quá trình triển khai thực tế.

  2. Công nghệ
- Ngôn ngữ: Java
- Các khái niệm: Lập trình hướng đối tượng (OOP), Collections (Tập hợp), Xử lý ngoại lệ (Exception Handling)
- Kiểm thử: [JUnit / Kiểm thử thủ công — cập nhật tùy theo thực tế triển khai]
- Quản lý phiên bản: Git và GitHub

  3. Cách chạy
- Cài đặt phiên bản JDK tương thích.
- Sử dụng một môi trường phát triển tích hợp (IDE) như IntelliJ IDEA, hoặc sử dụng terminal đã được cấu hình Java.
- Kiểm tra cài đặt Java của bạn:
    java -version
    javac -version
- Chạy ứng dụng
Sao chép (clone) kho lưu trữ: git clone https://github.com/nguyenvh60/Java_Quiz.git
cd Java_Quiz
Mở dự án trong IDE Java của bạn.
Chạy lớp (class) chính (Main).
Nếu bạn sử dụng hệ thống xây dựng (build system) hoặc cấu trúc gói (package structure) khác, hãy tuân theo các hướng dẫn chạy tương ứng.


4. Các khái niệm Lập trình hướng đối tượng (OOP)
- Dự án này có thể minh họa các khái niệm sau, tùy thuộc vào cách triển khai:
     Đóng gói (Encapsulation): Kiểm soát dữ liệu câu hỏi và trạng thái nội bộ thông qua các phương thức của lớp.
     Trừu tượng hóa (Abstraction): Tách biệt các thao tác của bài kiểm tra khỏi điểm khởi chạy ứng dụng.
     Kế thừa (Inheritance): Áp dụng nếu có các mối quan hệ cha-con hợp lý giữa các lớp.
     Đa hình (Polymorphism): Áp dụng nếu các cách triển khai khác nhau cùng chia sẻ một giao diện (interface) hoặc lớp cha (superclass).

5. Kiểm thử
- Danh sách kiểm tra (checklist) kiểm thử:
     Dữ liệu đầu vào không hợp lệ được xử lý phù hợp.
     Tổng điểm cuối cùng được tính toán chính xác.
     Dữ liệu câu hỏi bị thiếu hoặc trống được xử lý an toàn.
  
6. Mục tiêu học tập
- Củng cố các kiến ​​thức nền tảng về Java.
- Thực hành thiết kế hướng đối tượng.
- Cải thiện cách tổ chức và khả năng đọc hiểu mã nguồn.
- Học cách kiểm thử và gỡ lỗi (debug) một ứng dụng nhỏ.
- Xây dựng nền tảng cho các dự án lập trình mang tính giáo dục.

7. Các cải tiến trong tương lai
- Tải câu hỏi từ tệp tin hoặc cơ sở dữ liệu.
- Thêm các danh mục câu hỏi và cấp độ khó.
- Xáo trộn thứ tự câu hỏi và các phương án trả lời.
- Theo dõi lịch sử làm bài và điểm số cao nhất.
- Thêm giao diện người dùng đồ họa (GUI).
