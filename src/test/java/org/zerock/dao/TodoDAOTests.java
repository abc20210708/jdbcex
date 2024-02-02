package org.zerock.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.jdbcex.dao.TodoDAO;

public class TodoDAOTests {

    private TodoDAO todoDAO;

    @BeforeEach
    public void ready() {
        todoDAO = new TodoDAO();
    }

    /* @BeforeEach를 이용하는 ready()를 통해서 모든 테스트 전에
    To-doDAO 타입의 객체를 생성하도록 하고,
    *
    * */

    @Test
    public void testTime() throws Exception {
        System.out.println(todoDAO.getTime());
    }

    /* testTime()을 이용해서 TodoDAO에 작성한 get-Time()이
    정상 동작하는지를 확인하도록 함
    *
    * */
}
