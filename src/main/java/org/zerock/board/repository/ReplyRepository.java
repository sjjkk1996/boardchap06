package org.zerock.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.zerock.board.entity.Board;
import org.zerock.board.entity.Member;
import org.zerock.board.entity.Reply;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
    @Modifying
    @Query("delete from Reply r where r.board.bno =:bno")
    //서로 연관된 테이블을 가지고 작업을 하려고 하니까 기존 메서드로는 안돼서 query 어노테이션을 사용함
    void deleteByBno(Long bno);
    List<Reply> getRepliesByBoardOrderByRno(Board board);
}
