package org.ssglobal.training.codes.enums;

import java.util.Map;
import java.util.EnumMap;

public class TestJollibeeInventory {

	public static void main(String[] args) {

		Map<JollibeeItem, Integer> inventory = new EnumMap<>(JollibeeItem.class);
		inventory.put(JollibeeItem.JOLLY_SPAGHETTI, 10000);
		inventory.put(JollibeeItem.CHICKEN_JOY, 10000);
		inventory.put(JollibeeItem.SHANGHAI_ROLLS, 10000);
		inventory.put(JollibeeItem.PALABOK, 10000);
	}

}
