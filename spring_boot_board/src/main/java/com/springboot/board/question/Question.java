package com.springboot.board.question;

import java.time.LocalDateTime;
import java.util.List;

import com.springboot.board.answer.Answer;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	// 데이터를 저장할 때 해당 속성에 값이 1씩 자동으로 증가하여 저장
	private Integer id;	//고유번호
	
	@Column(length =200)	// 컬럼의 길이를 설정할때 사용
	private String subject;	//제목
	
	@Column(columnDefinition = "TEXT")	//컬럼의 속성을 정의할 때 사용,  "text"-> "내용"처럼 글자 수를 제한할 수 없는 경우에 사용한다.
	private String content;	//내용
	
	private LocalDateTime createDate;	//작성일시
	
	@OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
	private List<Answer> answerList;
}
