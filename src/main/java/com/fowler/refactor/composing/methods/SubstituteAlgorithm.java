package com.fowler.refactor.composing.methods;

import java.util.Arrays;
import java.util.List;

/**
 * 想把某个算法替换为另一个更清晰的算法. 
 * 将函数本体替换为另一个算法.
 */
public class SubstituteAlgorithm {
	String foundPerson(String[] people) {
		for (int i = 0; i < people.length; i++) {
			if (people[i].equals("Don")) {
				return "Don";
			}
			if (people[i].equals("John")) {
				return "John";
			}
			if (people[i].equals("Kent")) {
				return "Kent";
			}
		}
		return "";
	}

	// -------------------||-------------------
	// -------------------||-------------------
	// ------------------\||/------------------
	// -------------------\/-------------------

	String foundPerson2(String[] people) {
		List<String> cadidates = Arrays.asList(new String[] { "Don", "John", "Kent" });
		for (int i = 0; i < people.length; i++) {
			if (cadidates.contains(people[i])) {
				return people[i];
			}
		}
		return "";
	}
}
