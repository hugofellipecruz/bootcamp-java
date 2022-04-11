package com.meli.obterdiploma;

import com.meli.obterdiploma.repository.IStudentDAO;
import com.meli.obterdiploma.repository.StudentDAO;
import com.meli.obterdiploma.service.ObterDiplomaService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObterDiplomaApplicationTests {

	@Test
	public void contextLoads() {

	}

	@Test
	public void test1(){
		IStudentDAO studentDAOMocked = Mockito.mock(IStudentDAO.class);
		ObterDiplomaService diplomaService = new ObterDiplomaService();
	}
}