package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class smallest_97f6b15278788d90f6a0159ac65668f63f182fadf165e78bfecd7750de89f8611759f8d8206b3505407f7de14d124db7b0309a53e222c538c4dedadc6fa24fe6_003 {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		smallest_97f6b15278788d90f6a0159ac65668f63f182fadf165e78bfecd7750de89f8611759f8d8206b3505407f7de14d124db7b0309a53e222c538c4dedadc6fa24fe6_003 mainClass = new smallest_97f6b15278788d90f6a0159ac65668f63f182fadf165e78bfecd7750de89f8611759f8d8206b3505407f7de14d124db7b0309a53e222c538c4dedadc6fa24fe6_003();
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
        IntObj num1 = new IntObj(), num2 = new IntObj(), num3 = new IntObj(), num4 = new IntObj(), small = new IntObj();
        output += (String.format("Please enter 4 numbers separated by spaces > "));
        num1.value = scanner.nextInt();
        num2.value = scanner.nextInt();
        num3.value = scanner.nextInt();
        num4.value = scanner.nextInt();
        if(num1.value < num2.value && num1.value < num3.value && num1.value < num4.value){
            small.value = num1.value;
        } else if(num2.value < num1.value && num2.value < num3.value && num2.value < num4.value){
            small.value = num2.value;
        }         else if(num3.value < num1.value && num3.value < num2.value && num3.value < num4.value){
            small.value = num3.value;
        }         else {
            small.value = num4.value;
        }
        output += (String.format("%d is the smallest\n", small.value));
        if(true)return;;
    }
}