public class Calculator {
	public static void main(String... args) {
		Console c = new Console();
		boolean flag = true;
		System.out.println("Hello!");
		System.out.println();
		while (flag) {
			String b = c.readLine("Enter expression:>");
			if(b.equals("exit")){
				flag=false;
				System.out.println();
				System.out.println("Bye");
			}
			else{
				c.writeLine("Output:>" + eval(b));
			}
		}
	}

	public static double eval(final String str) {
		class Parser {
			int pos = -1, c;

			void eatChar() {
				c = (++pos < str.length()) ? str.charAt(pos) : -1;
			}

			void eatSpace() {
				while (Character.isWhitespace(c))
					eatChar();
			}

			double parse() {
				eatChar();
				double v = parseExpression();
				if (c != -1)
					throw new RuntimeException("Unexpected: " + (char) c);
				return v;
			}

			double parseExpression() {
				double v = parseTerm();
				for (;;) {
					eatSpace();
					if (c == '+') { 
						eatChar();
						v += parseTerm();
					} else if (c == '-') { 
						eatChar();
						v -= parseTerm();
					} else {
						return v;
					}
				}
			}

			double parseTerm() {
				double v = parseFactor();
				for (;;) {
					eatSpace();
					if (c == '/') { 
						eatChar();
						v /= parseFactor();
					} else if (c == '*' || c == '(') { 
						if (c == '*')
							eatChar();
						v *= parseFactor();
					} else {
						return v;
					}
				}
			}

			double parseFactor() {
				double v;
				boolean negate = false;
				eatSpace();
				if (c == '(') { 
					eatChar();
					v = parseExpression();
					if (c == ')')
						eatChar();
				} else { 
					if (c == '+' || c == '-') { 
						negate = c == '-';
						eatChar();
						eatSpace();
					}
					StringBuilder sb = new StringBuilder();
					while ((c >= '0' && c <= '9') || c == '.') {
						sb.append((char) c);
						eatChar();
					}
					if (sb.length() == 0)
						throw new RuntimeException("Unexpected: " + (char) c);
					v = Double.parseDouble(sb.toString());
				}
				eatSpace();
				if (c == '^') { 
					eatChar();
					v = Math.pow(v, parseFactor());
				}
				if (negate)
					v = -v; 
				return v;
			}
		}
		return new Parser().parse();
	}
}
