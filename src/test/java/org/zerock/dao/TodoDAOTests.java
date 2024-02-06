package org.zerock.dao;

import org.zerock.jdbcex.dao.TodoDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
//안녕하세요 네넿
    //제가 좀 제어하겠습니다. ㄷ그럼요
    @Test
    public void testTime() throws Exception {
        System.out.println(todoDAO.getTime());
        //mariaDB Failed to initialize pool: ERROR 1045 (28000): Access denied for user 발생

    }

    /* testTime()을 이용해서 TodoDAO에 작성한 get-Time()이
    정상 동작하는지를 확인하도록 함
    *
    * */
}
