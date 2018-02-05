package com.dp.adapter;

import java.util.ArrayList;
import java.util.List;
/**
 * 兵营只接受士兵
 * 没有士兵拿城管来凑，将城管适配成士兵
 * @author wangxin
 *
 */
public class Barracks {
	private List<Soldier> soldier;
	public Barracks() {
		this.soldier = new ArrayList<>();
	}
	public void addSoldier(Soldier soldier) {
		this.soldier.add(soldier);
	}
	
	public void war() {
		for (Soldier s : soldier) {
			s.combat();
		}
	}
	
	public void training() {
		for (Soldier s : soldier) {
			s.train();
		}
	}
}
