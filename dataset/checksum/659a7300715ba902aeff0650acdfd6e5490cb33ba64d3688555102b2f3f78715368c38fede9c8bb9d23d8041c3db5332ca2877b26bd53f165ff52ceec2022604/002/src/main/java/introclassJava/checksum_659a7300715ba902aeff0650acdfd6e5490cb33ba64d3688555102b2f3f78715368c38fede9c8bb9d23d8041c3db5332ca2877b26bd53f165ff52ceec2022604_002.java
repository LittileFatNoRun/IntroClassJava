package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class checksum_659a7300715ba902aeff0650acdfd6e5490cb33ba64d3688555102b2f3f78715368c38fede9c8bb9d23d8041c3db5332ca2877b26bd53f165ff52ceec2022604_002 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		checksum_659a7300715ba902aeff0650acdfd6e5490cb33ba64d3688555102b2f3f78715368c38fede9c8bb9d23d8041c3db5332ca2877b26bd53f165ff52ceec2022604_002 mainClass = new checksum_659a7300715ba902aeff0650acdfd6e5490cb33ba64d3688555102b2f3f78715368c38fede9c8bb9d23d8041c3db5332ca2877b26bd53f165ff52ceec2022604_002();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public static int length = 1000000;
    public void exec () throws Exception {
        char[] string = new char[length];
        IntObj count = new IntObj(), i = new IntObj(), count2 = new IntObj();
        output += (String.format("Enter an abitrarily long string, ending with carriage return > "));
        string = scanner.next().toCharArray();
        count.value = 0;
        count2.value = 0;
        for(i.value = 0; i.value < length; ++i.value) {
            count.value+=(int)string[i.value];
            if(count2.value == count.value){
                break;
            }
            count2.value = count.value;
        }
        count.value = count.value % 64 + ' ';
        output += (String.format("Check sum is %c\n", count.value));
        if(true)return;;
    }
}