package wehavecookies56.kk.achievements;

import net.minecraft.stats.Achievement;
import net.minecraft.stats.StatBase;
import net.minecraftforge.common.AchievementPage;
import wehavecookies56.kk.block.AddedBlocks;
import wehavecookies56.kk.item.AddedItems;

public class AddedAchievments {


	public static Achievement bugBlox;
	public static Achievement recipe;
	public static Achievement kingdomKey;
	public static Achievement orichalcum;
	public static Achievement orichalcumPlus;
	public static Achievement munny;
	public static Achievement hp;
	public static Achievement kkpotion;
	public static Achievement dheart;
	public static Achievement heart;
	public static Achievement pheart;
	public static Achievement khearts;
	public static Achievement synthesizer;
	public static Achievement menu;
	public static AchievementPage kingdomKeysAchievement;
	
	public static void initAchievements(){

		menu = (Achievement) new Achievement("achievement.menu","menu",0,0, AddedItems.OrganizationHood, menu).initIndependentStat().registerStat();
		munny = (Achievement) new Achievement("achievement.munny", "munny", 1,2, AddedItems.Munny1, menu).registerStat();
		hp = (Achievement) new Achievement("achievement.hp", "hp", -1,2, AddedItems.HP, menu).registerStat();
		synthesizer = (Achievement) new Achievement("achievement.synthetizer","synthesizer", 3, 2, AddedBlocks.Synthesiser, munny).registerStat();
		kkpotion = (Achievement) new Achievement("achievement.kkpotion", "kkpotion", -3,2, AddedItems.Potion, hp).registerStat();
		dheart = (Achievement) new Achievement("achievement.dheart", "dheart", 0,4, AddedItems.DarkHeart, munny).registerStat();
		heart = (Achievement) new Achievement("achievement.heart", "heart", 0,6, AddedItems.Heart, munny).registerStat();
		pheart = (Achievement) new Achievement("achievement.pheart", "pheart", 2,4, AddedItems.PureHeart, munny).registerStat();
		khearts = (Achievement) new Achievement("achievement.kheart", "kheart", 2,6, AddedItems.KingdomHearts, munny).registerStat();

		bugBlox = (Achievement) new Achievement("achievemnt.bugBlox", "bugBlox", -3, -2, AddedBlocks.NormalBlox, menu).initIndependentStat().registerStat();
		recipe = (Achievement) new Achievement("achievement.recipe", "recipe", 3, -2, AddedItems.K1r, menu).initIndependentStat().registerStat();
		
		kingdomKey = (Achievement) new Achievement("achievement.kingdomKey", "kingdomKey", 5, 0, AddedItems.KingdomKey, recipe).setSpecial().registerStat();
		orichalcum = (Achievement) new Achievement("achievement.orichalcum", "orichalcum", -2, 0, AddedItems.Orichalcum, menu).initIndependentStat().registerStat();
		orichalcumPlus = (Achievement) new Achievement("achievement.orichalcumPlus", "orichalcumPlus", -4, 0, AddedItems.OrichalcumPlus, orichalcum).setSpecial().registerStat();
		
		AchievementPage.registerAchievementPage(kingdomKeysAchievement = new AchievementPage("Kingdom Keys", new Achievement[]{bugBlox, recipe, kingdomKey, orichalcum, orichalcumPlus, munny, hp, kkpotion, dheart, heart, pheart, khearts, synthesizer, menu}));
	}

}
