package org.zerock.board.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "writer")
public class Board extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

    private String title;
    private String content;

    @ManyToOne (fetch = FetchType.LAZY)
//    manytoone 다른테이블과연결시키는 어노테이션이다 lazy는 필요한거만 가져다 씀  eager는 다가져옴 시간이걸린다는 단점
    private Member writer;

    public void changeTitle(String title) {
        this.title = title;
    }
    public void changeContent(String content) {
        this.content = content;
    }
}
