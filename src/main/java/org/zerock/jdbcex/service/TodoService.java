package org.zerock.jdbcex.service;

import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.zerock.jdbcex.dao.TodoDAO;
import org.zerock.jdbcex.domain.TodoVo;
import org.zerock.jdbcex.dto.TodoDTO;
import org.zerock.jdbcex.util.MapperUtil;

import java.util.List;
import java.util.stream.Collectors;

@Log4j2
public enum TodoService {
    INSTANCE;

    private TodoDAO dao;
    private ModelMapper modelMapper;

    TodoService() {

        dao = new TodoDAO();
        modelMapper = MapperUtil.INSTANCE.get();
    }

    public void register(TodoDTO todoDTO) throws Exception {

        TodoVo todoVo = modelMapper.map(todoDTO, TodoVo.class);

        //System.out.println("todoVO: " + todoVo);
        log.info(todoVo);

        dao.insert(todoVo); //int를 변환하므로 이를 이용해서 예외처리도 가능
    }

    public List<TodoDTO> listAll() throws Exception {

        List<TodoVo> voList = dao.selectAll();

        log.info("voList........");
        log.info(voList);

        List<TodoDTO> dtoList = voList.stream()
                .map(vo -> modelMapper.map(vo, TodoDTO.class))
                .collect(Collectors.toList());

        return dtoList;
    }


}
