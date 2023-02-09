package com.springboot.board;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.board.answer.Answer;
import com.springboot.board.answer.AnswerRepository;
import com.springboot.board.question.QuestionRepository;

@SpringBootTest
class SpringBootBoardApplicationTests {
	
	@Autowired	// 스프링의 DI 기능으로 questionRepository 객체를 스프링이 자동으로 생성해 준다.
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@Test
	void testJpa() {
		Optional<Answer> oa = this.answerRepository.findById(1);
        assertTrue(oa.isPresent());
        Answer a = oa.get();
        assertEquals(2, a.getQuestion().getId());
	}

}
