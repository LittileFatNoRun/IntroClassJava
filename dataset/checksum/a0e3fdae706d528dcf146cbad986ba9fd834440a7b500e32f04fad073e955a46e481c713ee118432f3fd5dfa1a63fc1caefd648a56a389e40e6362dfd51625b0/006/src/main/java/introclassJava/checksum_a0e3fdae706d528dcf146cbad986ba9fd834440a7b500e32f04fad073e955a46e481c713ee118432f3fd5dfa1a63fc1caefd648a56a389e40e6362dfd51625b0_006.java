package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class checksum_a0e3fdae706d528dcf146cbad986ba9fd834440a7b500e32f04fad073e955a46e481c713ee118432f3fd5dfa1a63fc1caefd648a56a389e40e6362dfd51625b0_006 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		checksum_a0e3fdae706d528dcf146cbad986ba9fd834440a7b500e32f04fad073e955a46e481c713ee118432f3fd5dfa1a63fc1caefd648a56a389e40e6362dfd51625b0_006 mainClass = new checksum_a0e3fdae706d528dcf146cbad986ba9fd834440a7b500e32f04fad073e955a46e481c713ee118432f3fd5dfa1a63fc1caefd648a56a389e40e6362dfd51625b0_006();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public void exec () throws Exception {
        IntObj checksum = new IntObj(), integer_value = new IntObj(), sum = new IntObj(0);
        char[] value = new char[1000];
        output += (String.format("Enter an abitrarily long string, ending with carriage return > "));
        value = (scanner.nextLine() + "\n").toCharArray();
        IntObj i = new IntObj();
        IntObj stringlength = new IntObj(value.length - 1);
        for(i.value = 0; i.value < stringlength.value; i.value++) {
            integer_value.value = value[i.value];
            sum.value = sum.value + integer_value.value;
        }
        checksum.value = (sum.value % 64) + ' ';
        output += (String.format("Check sum is %c\n", checksum.value));
        if(true)return;;
    }
}