package com.springboot.board.answer;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;

import com.springboot.board.question.Question;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(columnDefinition = "TEXT")
	private String content;
	
	@CreatedDate
	private LocalDateTime createDate;
	
	@ManyToOne	//@ManyToOne은 부모 자식 관계를 갖는 구조에서 사용한다. 부모는 Question, 자식은 Answer라고 할 수 있다.
	private Question question;	//답변 엔티티에서 질문 엔티티를 참조하기 위해 추가
}
