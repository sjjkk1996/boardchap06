package org.zerock.board.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.board.dto.ReplyDTO;

import javax.xml.bind.SchemaOutputResolver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ReplyServiceTests {
    @Autowired
    private ReplyService replyService;

    @Test
    void testGetList() {
        Long bno = 100L;
        List<ReplyDTO> replyDTOList = replyService.getList(bno);
        replyDTOList.forEach(replyDTO -> System.out.println(replyDTO));
    }
}