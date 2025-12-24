package kr.soft.shopping.api;

import kr.soft.shopping.dto.board.BoardListDTO;
import kr.soft.shopping.dto.board.BoardRegisterDTO;
import kr.soft.shopping.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/list")
    public List<BoardListDTO> list(){
        return boardService.list();
    }

    @PostMapping("/register")
    public void register(@RequestBody BoardRegisterDTO boardRegisterDTO){

        log.info("data : {}" , boardRegisterDTO.toString());

        boardService.Register(boardRegisterDTO);
    }
}
