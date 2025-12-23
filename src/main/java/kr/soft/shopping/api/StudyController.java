package kr.soft.shopping.api;

import jakarta.servlet.http.HttpServletRequest;
import kr.soft.shopping.dto.CalcDTO;
import kr.soft.shopping.dto.DataDTO;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class StudyController {

    @GetMapping("/test")
    public void test() {
        log.info("test");
    }

    @GetMapping("/test1")
    public String test1() {
        log.info("test");

        return "Hello World";
    }

    @GetMapping("/data1")
    public void data1(HttpServletRequest request) {
        String data = request.getParameter("text");
        log.info("data1:{}", data);
    }

    @GetMapping("/data2")
    public void data2(DataDTO dataDTO) {
        log.info("data2:{}", dataDTO.toString());
    }

    @GetMapping("data3")
    private void data3(CalcDTO calcDTO) {
        log.info("plus : {}", calcDTO.getNum1() + calcDTO.getNum2());
        log.info("minus : {}", calcDTO.getNum1() - calcDTO.getNum2());
    }

    @PostMapping("/post1")
    public void post1(@RequestBody DataDTO dataDTO) {
        log.info("post1:{}", dataDTO.toString());
    }

    @GetMapping("/res1")
    public DataDTO res1(DataDTO dataDTO) {
        log.info("res1:{}", dataDTO);

        return dataDTO;
    }


}
