import java.util.*;

public class kakao1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		char tem;
		
		for(int i=0; i<in.length(); i++) {
			if (in.charAt(i) > 'A' & in.charAt(i) < 'Z') {
				tem = (char) (in.charAt(i) - 'A' + 'a');
				sb.append(tem);
			} else if (in.charAt(i) >= 'a' & in.charAt(i) <= 'z')
				sb.append(in.charAt(i));
			else if (in.charAt(i) == '.' | in.charAt(i) == '_' | in.charAt(i) == '-')
				sb.append(in.charAt(i));
			else if (in.charAt(i) >= '0' & in.charAt(i) <= '9')
				sb.append(in.charAt(i));
		}

		for (int i = 0; i < sb.length(); i++) {
			if (i + 1 < sb.length())
				if (sb.charAt(i) == '.' & sb.charAt(i + 1) == '.')
					continue;
				else
					sb1.append(sb.charAt(i));
			else
				sb1.append(sb.charAt(i));
		}
		
		int count = 0;
		for (int i = 0; i < sb1.length(); i++) {
			if (i == 0 & sb.charAt(i) == '.')
				continue;
			else {
				if(count >= 14) {
					if(count == 14 & sb1.charAt(i) == '.')
						break;
					else
						sb2.append(sb1.charAt(i));
					break;
				}
				if(i == sb1.length()-1 & sb1.charAt(i) =='.')
					break;
				sb2.append(sb1.charAt(i));
				count ++;
			}
		}		
		
		if (sb2.length() == 0)
			sb2.append('a');

		if (sb2.length() == 1) {
			sb2.append(sb2.charAt(0));
			sb2.append(sb2.charAt(0));
		}
		
		if (sb2.length() == 2)
			sb2.append(sb2.charAt(1));
		
		System.out.println(sb2);

	}
}
