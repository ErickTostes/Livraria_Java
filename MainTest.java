package br.edu.infnet.ErickdaSilva;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;


class MainTest {

	 @Test
	    public void testMainOutput() {
	        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	        System.setOut(new PrintStream(outContent));
	        
	        Main.main(new String[]{});
	        
	        assertTrue(outContent.toString().contains("Livro 1:"));
	        assertTrue(outContent.toString().contains("Livro 2:"));
	        assertTrue(outContent.toString().contains("Livro 3:"));
	    }
	}
