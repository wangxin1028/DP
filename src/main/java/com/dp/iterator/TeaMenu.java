package com.dp.iterator;

public class TeaMenu implements Menu<MenuItem> {
	private MenuItem[] items;
	private int present = 0;
	private static final int MAX=10;
	public TeaMenu() {
		items = new MenuItem[MAX];
		addItem(new MenuItem("君山银针", "产于湖南岳阳洞庭湖中的君山，形细如针，故名君山银针", 20));
		addItem(new MenuItem("碧螺春", "碧螺春产于江苏省苏州市吴县太湖的东洞庭山及西洞庭山（今苏州吴中区）一带，所以又称“洞庭碧螺春”", 21));
		addItem(new MenuItem("西湖龙井", "产于浙江省杭州市西湖龙井村周围群山，并因此得名", 22));
		addItem(new MenuItem("黄山毛峰", "产于安徽省黄山（徽州）一带，所以又称徽茶", 23));
		addItem(new MenuItem("都匀毛尖", "又名“白毛尖”、“细毛尖”、“鱼钩茶”、“雀舌茶”，是贵州三大名茶之一", 24));
		addItem(new MenuItem("信阳毛尖", "主要产地在信阳市浉河区（原信阳市）、平桥区（原信阳县）和罗山县", 25));
		addItem(new MenuItem("六安瓜片", "简称瓜片、片茶，产自安徽省六安市大别山一带，唐称“庐州六安茶”，为名茶；明始称“六安瓜片”，为上品、极品茶；清为朝廷贡茶", 26));
		addItem(new MenuItem("安溪铁观音", "铁观音，福建安溪当地茶农发明于1725-1735年间。发源于安溪县西坪镇尧阳山麓（王说）。属于乌龙茶类", 27));
		addItem(new MenuItem("武夷岩茶", "武夷岩茶是中国传统名茶，是具有岩韵（岩骨花香）品质特征的乌龙茶。产于福建闽北“秀甲东南”的武夷山一带，茶树生长在岩缝之中", 28));
		addItem(new MenuItem("祁门红茶", "祁门红茶简称祁红，茶叶原料选用当地的中叶、中生种茶树“槠叶种”（又名祁门种）制作，是中国历史名茶，著名红茶精品", 29));
	}
	
	@Override
	public Iterator<MenuItem> iterator() {
		return new TeaMenuIterator();
	}

	private void addItem(MenuItem item) {
		if(present<MAX) {
			items[present++]=item;
		}else {
			throw new RuntimeException("菜单已满");
		}
	}
	
	public class TeaMenuIterator implements Iterator<MenuItem>{
		private int present = 0;
		@Override
		public boolean hasNext() {
			if(present<MAX && items[present]!=null) {
				return true;
			}
			return false;
		}

		@Override
		public MenuItem next() {
			return items[present++];
		}
		
	}
}
