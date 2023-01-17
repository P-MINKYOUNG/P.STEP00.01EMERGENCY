package step00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Emergency {

	public static void main(String[] args) {

		int[] emergency = { 37, 3, 26 };
		int[] answer = new int[emergency.length];

		int[] copyArr = Arrays.copyOf(emergency, emergency.length);
		Integer copyArr2[] = Arrays.stream(copyArr).boxed().toArray(Integer[]::new); 
		
		Arrays.sort(copyArr2, Collections.reverseOrder());

		for (int i = 0; i < copyArr.length; i++) {
			for (int j = 0; j < emergency.length; j++) {
				if (copyArr2[i] == emergency[j]) {
					answer[i] = j + 1;
					System.out.print(answer[i]);
				}
			}
		}

	}

}
