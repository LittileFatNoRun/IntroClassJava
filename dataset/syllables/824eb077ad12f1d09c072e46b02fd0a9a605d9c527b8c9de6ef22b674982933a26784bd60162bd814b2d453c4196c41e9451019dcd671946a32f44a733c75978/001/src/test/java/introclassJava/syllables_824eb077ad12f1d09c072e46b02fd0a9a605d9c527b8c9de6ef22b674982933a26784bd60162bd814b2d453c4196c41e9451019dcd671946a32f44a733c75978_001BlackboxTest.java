package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class syllables_824eb077ad12f1d09c072e46b02fd0a9a605d9c527b8c9de6ef22b674982933a26784bd60162bd814b2d453c4196c41e9451019dcd671946a32f44a733c75978_001BlackboxTest {

	@Test(timeout=1000)
	public void test1() throws Exception {
		syllables_824eb077ad12f1d09c072e46b02fd0a9a605d9c527b8c9de6ef22b674982933a26784bd60162bd814b2d453c4196c41e9451019dcd671946a32f44a733c75978_001 mainClass = new syllables_824eb077ad12f1d09c072e46b02fd0a9a605d9c527b8c9de6ef22b674982933a26784bd60162bd814b2d453c4196c41e9451019dcd671946a32f44a733c75978_001();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("khd");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test2() throws Exception {
		syllables_824eb077ad12f1d09c072e46b02fd0a9a605d9c527b8c9de6ef22b674982933a26784bd60162bd814b2d453c4196c41e9451019dcd671946a32f44a733c75978_001 mainClass = new syllables_824eb077ad12f1d09c072e46b02fd0a9a605d9c527b8c9de6ef22b674982933a26784bd60162bd814b2d453c4196c41e9451019dcd671946a32f44a733c75978_001();
		String expected = "Please enter a string > The number of syllables is 6.";
		mainClass.scanner = new java.util.Scanner("aeiouy");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test3() throws Exception {
		syllables_824eb077ad12f1d09c072e46b02fd0a9a605d9c527b8c9de6ef22b674982933a26784bd60162bd814b2d453c4196c41e9451019dcd671946a32f44a733c75978_001 mainClass = new syllables_824eb077ad12f1d09c072e46b02fd0a9a605d9c527b8c9de6ef22b674982933a26784bd60162bd814b2d453c4196c41e9451019dcd671946a32f44a733c75978_001();
		String expected = "Please enter a string > The number of syllables is 5.";
		mainClass.scanner = new java.util.Scanner("here and there");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test4() throws Exception {
		syllables_824eb077ad12f1d09c072e46b02fd0a9a605d9c527b8c9de6ef22b674982933a26784bd60162bd814b2d453c4196c41e9451019dcd671946a32f44a733c75978_001 mainClass = new syllables_824eb077ad12f1d09c072e46b02fd0a9a605d9c527b8c9de6ef22b674982933a26784bd60162bd814b2d453c4196c41e9451019dcd671946a32f44a733c75978_001();
		String expected = "Please enter a string > The number of syllables is 1.";
		mainClass.scanner = new java.util.Scanner("bbbbbbb a");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test5() throws Exception {
		syllables_824eb077ad12f1d09c072e46b02fd0a9a605d9c527b8c9de6ef22b674982933a26784bd60162bd814b2d453c4196c41e9451019dcd671946a32f44a733c75978_001 mainClass = new syllables_824eb077ad12f1d09c072e46b02fd0a9a605d9c527b8c9de6ef22b674982933a26784bd60162bd814b2d453c4196c41e9451019dcd671946a32f44a733c75978_001();
		String expected = "Please enter a string > The number of syllables is 0.";
		mainClass.scanner = new java.util.Scanner("9876543210");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
	@Test(timeout=1000)
	public void test6() throws Exception {
		syllables_824eb077ad12f1d09c072e46b02fd0a9a605d9c527b8c9de6ef22b674982933a26784bd60162bd814b2d453c4196c41e9451019dcd671946a32f44a733c75978_001 mainClass = new syllables_824eb077ad12f1d09c072e46b02fd0a9a605d9c527b8c9de6ef22b674982933a26784bd60162bd814b2d453c4196c41e9451019dcd671946a32f44a733c75978_001();
		String expected = "Please enter a string > The number of syllables is 3.";
		mainClass.scanner = new java.util.Scanner("1 a 2 e 3 $#@ u");
		mainClass.exec();
		String out = mainClass.output.replace("\n"," ").trim();
		assertEquals(expected.replace(" ",""), out.replace(" ",""));
	}
}