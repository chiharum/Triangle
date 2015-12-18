	import java.io.*;

	public class Triangle{

		public static void main(String[] args) throws IOException{

			String read, right_angle, unknown = null;
			double known1, known2, answer = 0;
			boolean everyWhile = true;
			
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);

			System.out.println("直角三角形の2つの角から残りの1つを計算します。※途中でやめる場合は「q」か「quit」と打ってください。");

			System.out.println("まず、三角形abcがあり、辺ab,bc,cdがあるとします。直角な角はa,b,cのどれですか？a,b,cのうち一つを選んでタイプしてください");
			right_angle = br.readLine();
			if(!right_angle.equals("a") && !right_angle.equals("b") && !right_angle.equals("c")){

				if (right_angle.equals("q") || right_angle.equals("quit")){
					System.exit(0);
				}

				everyWhile = false;
				while (everyWhile == false){
					System.out.println("直角な角をa,b,cのうち一つを選んで入力してください");
					right_angle = br.readLine();

					if (right_angle.equals("q") || right_angle.equals("quit")){
						System.exit(0);
					}

					if(!right_angle.equals("a") && !right_angle.equals("b") && !right_angle.equals("c")){
						everyWhile = false;
					}else {
						everyWhile = true;
					}
				}
			}

			System.out.println("わからない辺はどれですか？ab,bc,caのように入力してください");
			unknown = br.readLine();
			if(!unknown.equals("ab") && !unknown.equals("ba") && !unknown.equals("bc") && !unknown.equals("cb") && !unknown.equals("ac") && !unknown.equals("ca")){

				if (unknown.equals("q") || unknown.equals("quit")){
					System.exit(0);
				}

				everyWhile = false;
				while (everyWhile == false){
					System.out.println("わからない辺はどれですか？ab,bc,caのように入力してください");
					unknown = br.readLine();

					if (right_angle.equals("q") || right_angle.equals("quit")){
						System.exit(0);
					}

					if(!unknown.equals("ab") && !unknown.equals("ba") && !unknown.equals("bc") && !unknown.equals("cb") && !unknown.equals("ac") && !unknown.equals("ca")){
						everyWhile = false;
					}else{
						everyWhile = true;
					}
				}

			}else{
				everyWhile = true;
			}

			if(unknown.equals("ab") || unknown.equals("ba")){
				known1 = 0;
				known2 = 0;

				System.out.println("bcの長さを入力してください。");
				read = br.readLine();
				try{
					known1 = Double.parseDouble(read);
				}catch(Exception e){

					if (read.equals("q") || read.equals("quit")){
						System.exit(0);
					}

					everyWhile = false;
					while (everyWhile == false){
						System.out.println("数値を入力してください。もういちどbcの長さを入力してください。");

						if (read.equals("q") || read.equals("quit")){
							System.exit(0);
						}

						read = br.readLine();
						everyWhile = true;
						try{
							known1 = Double.parseDouble(read);
						}catch(Exception e2){
							everyWhile = false;
						}
					}
				}

				System.out.println("acの長さを入力してください。");
				read = br.readLine();
				everyWhile = true;
				try{
					known2 = Double.parseDouble(read);
				}catch(Exception e){

					if (read.equals("q") || read.equals("quit")){
						System.exit(0);
					}

					everyWhile = false;
					while (everyWhile == false){
						everyWhile = true;
						System.out.println("数値を入力してください。もういちどbcの長さを入力してください。");
						read = br.readLine();

						if (read.equals("q") || read.equals("quit")){
							System.exit(0);
						}

						try{
							known2 = Double.parseDouble(read);
						}catch(Exception e2){
							everyWhile = false;
						}
					}
				}

				if(right_angle.equals("a")){
					answer = (known1 * known1) - (known2 * known2);
					answer = Math.sqrt(answer);
					System.out.println("abの長さは" + answer + "です。");

				}else if(right_angle.equals("b")){
					answer = (known2 * known2) - (known1 * known1);
					answer = Math.sqrt(answer);
					System.out.println("abの長さは" + answer + "です。");

				}else if(right_angle.equals("c")){
					answer = (known2 * known2) + (known1 * known1);
					answer = Math.sqrt(answer);
					System.out.println("abの長さは" + answer + "です。");
				}

			}else if(unknown.equals("bc") || unknown.equals("cb")){
				known1 = 0;
				known2 = 0;

				System.out.println("abの長さを入力してください。");
				read = br.readLine();
				try{
					known1 = Double.parseDouble(read);
				}catch(Exception e){

					if (read.equals("q") || read.equals("quit")){
						System.exit(0);
					}

					everyWhile = false;
					while (everyWhile == false){
						everyWhile = true;
						System.out.println("数値を入力してください。もういちどabの長さを入力してください。");
						read = br.readLine();

						if (read.equals("q") || read.equals("quit")){
							System.exit(0);
						}

						try{
							known1 = Double.parseDouble(read);
						}catch(Exception e2){
							everyWhile = false;
						}
					}
				}

				System.out.println("acの長さを入力してください。");
				read = br.readLine();
				try{
					known2 = Double.parseDouble(read);
				}catch(Exception e){

					if (read.equals("q") || read.equals("quit")){
						System.exit(0);
					}

					everyWhile = false;
					while (everyWhile == false){
						everyWhile = true;
						System.out.println("数値を入力してください。もういちどacの長さを入力してください。");
						read = br.readLine();

						if (read.equals("q") || read.equals("quit")){
							System.exit(0);
						}

						try{
							known2 = Double.parseDouble(read);
						}catch(Exception e2){
							everyWhile = false;
						}
					}
				}

				if(right_angle.equals("a")){
					answer = (known1 * known1) + (known2 * known2);
					answer = Math.sqrt(answer);
					System.out.println("bcの長さは" + answer + "です。");

				}else if(right_angle.equals("b")){
					answer = (known2 * known2) - (known1 * known1);
					answer = Math.sqrt(answer);
					System.out.println("bcの長さは" + answer + "です。");

				}else if(right_angle.equals("c")){
					answer = (known1 * known1) - (known2 * known2);
					answer = Math.sqrt(answer);
					System.out.println("bcの長さは" + answer + "です。");
				}

			}else if(unknown.equals("ac") || unknown.equals("ca")){
				known1 = 0;
				known2 = 0;

				System.out.println("abの長さを入力してください。");
				read = br.readLine();
				try{
					known1 = Double.parseDouble(read);
				}catch(Exception e){

					if (read.equals("q") || read.equals("quit")){
						System.exit(0);
					}

					everyWhile = false;
					while (everyWhile == false){
						everyWhile = true;
						System.out.println("数値を入力してください。もういちどabの長さを入力してください。");
						read = br.readLine();

						if (read.equals("q") || read.equals("quit")){
							System.exit(0);
						}

						try{
							known1 = Double.parseDouble(read);
						}catch(Exception e2){
							everyWhile = false;
						}
					}
				}

				System.out.println("bcの長さを入力してください。");
				read = br.readLine();
				try{
					known2 = Double.parseDouble(read);
				}catch(Exception e){

					if (read.equals("q") || read.equals("quit")){
						System.exit(0);
					}

					everyWhile = false;
					while (everyWhile == false){
						everyWhile = true;
						System.out.println("数値を入力してください。もういちどbcの長さを入力してください。");
						read = br.readLine();

						if (read.equals("q") || read.equals("quit")){
							System.exit(0);
						}

						try{
							known2 = Double.parseDouble(read);
						}catch(Exception e2){
							everyWhile = false;
						}
					}
				}

				if(right_angle.equals("a")){
					answer = (known2 * known2) - (known1 * known1);
					answer = Math.sqrt(answer);
					System.out.println("acの長さは" + answer + "です。");

				}else if(right_angle.equals("b")){
					answer = (known2 * known2) + (known1 * known1);
					answer = Math.sqrt(answer);
					System.out.println("acの長さは" + answer + "です。");

				}else if(right_angle.equals("c")){
					answer = (known1 * known1) - (known2 * known2);
					answer = Math.sqrt(answer);
					System.out.println("acの長さは" + answer + "です。");
				}
			}
		}
	}