package kr.soft.shopping.mapper;

import kr.soft.shopping.dto.board.BoardListDTO;
import kr.soft.shopping.dto.board.BoardRegisterDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardListDTO> list();

    void register(BoardRegisterDTO boardRegisterDTO);
}
