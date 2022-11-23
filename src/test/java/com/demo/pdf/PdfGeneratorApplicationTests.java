package com.demo.pdf;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.pdf.utility.PdfGenerator;

@SpringBootTest
class PdfGeneratorApplicationTests {

	@Test
	void contextLoads() {
		PdfGenerator pdf = new PdfGenerator();
		pdf.writeUsingIText();
	}

}
