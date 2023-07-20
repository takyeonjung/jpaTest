package kr.ezen.jpademo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
public class Bbs {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

    private String title;
//    private String writer;

    @ManyToOne // 여러 개의 게시글에 하나의 Customer
    @JoinColumn(name="customer_id", nullable = false)
    private String content;
    private Long viewCnt;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date regDate;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date upDate;

    @Override
    public String toString() {
        return "Bbs{" +
                "bno=" + bno +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", viewCnt=" + viewCnt +
                ", regDate=" + regDate +
                ", upDate=" + upDate +
                '}';
    }

    //    public void setCustomer(Customer customer) {
//    }
}
