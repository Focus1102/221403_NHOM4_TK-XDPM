package Buoi1;

import java.io.IOException;

public class AddUseCaseControl {
    AddEntity addEntity = null;
    AddUIConsoleOutput uiOutput = null;

    public AddUseCaseControl(AddEntity addEntity, AddUIConsoleOutput uiOutput) {
        this.addEntity = addEntity;
        this.uiOutput = uiOutput;
    }

    public void execute(RequestData requesData) throws IOException {
        while (true) {
            RequestData reqData = AddUIConsoleInput.inputData();

            try {
                // Kiểm tra và chuyển đổi dữ liệu
                Integer number1 = Integer.parseInt(reqData.getNumber1());
                Integer number2 = Integer.parseInt(reqData.getNumber2());

                // Thực hiện tính toán
                String result = addEntity.add(number1, number2);

                ResponseData responseData = new ResponseData(result);

                // Gửi kết quả đến UIConsoleOutput để hiển thị
                uiOutput.outputResult(responseData);
                break; // Thoát vòng lặp khi nhập và tính toán thành công

            } catch (NumberFormatException e) {
                // Yêu cầu người dùng nhập lại nếu có lỗi
                uiOutput.requestInputAgain();
            }
        }
    }
}
