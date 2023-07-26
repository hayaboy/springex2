package org.zerock.springex2.mapper;

import org.springframework.stereotype.Repository;
import org.zerock.springex2.domain.TodoVO;
import org.zerock.springex2.dto.TodoDTO;

import java.util.List;


public interface TodoMapper {

    String getTime();

    void insert(TodoVO todoVO);

    List<TodoVO> selectAll();

    TodoVO selectOne(Long tno);

    void delete(Long tno);

    void update(TodoVO todoVO);

}
