package com.dp.composite;

public class Main {
	public static void main(String[] args) {
		MenuItem item1 = new MenuItem("卡布奇诺", "一口浓情，一口咖啡", 13);
		MenuItem item2 = new MenuItem("拿铁", "是哥们，就和拿铁", 11);
		MenuItem item3 = new MenuItem("美式咖啡", "山姆大叔的最爱", 10);
		MenuItem item4 = new MenuItem("猫屎咖啡", "大便做的，你懂得", 16);
		MenuItem item5 = new MenuItem("牛栏山咖啡", "喝多了上头", 15);
		
		Menu coffeeMenu = new Menu("咖啡菜单");
		coffeeMenu.add(item1);
		coffeeMenu.add(item2);
		coffeeMenu.add(item3);
		coffeeMenu.add(item4);
		coffeeMenu.add(item5);
		
		MenuItem tea0 = new MenuItem("君山银针", "产于湖南岳阳洞庭湖中的君山，形细如针，故名君山银针", 20);
		MenuItem tea1 = new MenuItem("碧螺春", "碧螺春产于江苏省苏州市吴县太湖的东洞庭山及西洞庭山（今苏州吴中区）一带，所以又称“洞庭碧螺春”", 21);
		MenuItem tea2 = new MenuItem("西湖龙井", "产于浙江省杭州市西湖龙井村周围群山，并因此得名", 22);
		MenuItem tea3 = new MenuItem("黄山毛峰", "产于安徽省黄山（徽州）一带，所以又称徽茶", 23);
		MenuItem tea4 = new MenuItem("都匀毛尖", "又名“白毛尖”、“细毛尖”、“鱼钩茶”、“雀舌茶”，是贵州三大名茶之一", 24);
		MenuItem tea5 = new MenuItem("信阳毛尖", "主要产地在信阳市浉河区（原信阳市）、平桥区（原信阳县）和罗山县", 25);
		MenuItem tea6 = new MenuItem("六安瓜片", "简称瓜片、片茶，产自安徽省六安市大别山一带，唐称“庐州六安茶”，为名茶；明始称“六安瓜片”，为上品、极品茶；清为朝廷贡茶", 26);
		MenuItem tea7 = new MenuItem("安溪铁观音", "铁观音，福建安溪当地茶农发明于1725-1735年间。发源于安溪县西坪镇尧阳山麓（王说）。属于乌龙茶类", 27);
		MenuItem tea8 = new MenuItem("武夷岩茶", "武夷岩茶是中国传统名茶，是具有岩韵（岩骨花香）品质特征的乌龙茶。产于福建闽北“秀甲东南”的武夷山一带，茶树生长在岩缝之中", 28);
		MenuItem tea9 = new MenuItem("祁门红茶", "祁门红茶简称祁红，茶叶原料选用当地的中叶、中生种茶树“槠叶种”（又名祁门种）制作，是中国历史名茶，著名红茶精品", 29);
		
		Menu teaMenu = new Menu("茶品菜单");
		teaMenu.add(tea0);
		teaMenu.add(tea1);
		teaMenu.add(tea2);
		teaMenu.add(tea3);
		teaMenu.add(tea4);
		teaMenu.add(tea5);
		teaMenu.add(tea6);
		teaMenu.add(tea7);
		teaMenu.add(tea8);
		teaMenu.add(tea9);
		
		Menu all = new Menu("所有菜单");
		all.add(teaMenu);
		all.add(coffeeMenu);
		
		Waitress waiter = new Waitress(all);
		waiter.printMenu();
		System.out.println("==================");
		waiter.printExpensiveItems();
		
	}
}
