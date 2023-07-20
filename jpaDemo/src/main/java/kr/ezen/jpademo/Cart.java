package kr.ezen.jpademo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
public class Cart {
    @Id
    @Column(name = "cart_id")
    private Long id;

    @OneToOne
    // nullable = false --> inner Join
    // nullsble = true(기본값( --> outer Join
    // FK가 만들어짐
    @JoinColumn(name="member_id", nullable= false)
    private Member member;

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
//                ", member=" + member +
                '}';
    }
}

