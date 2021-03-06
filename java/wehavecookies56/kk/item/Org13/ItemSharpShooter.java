package wehavecookies56.kk.item.org13;

import java.util.List;

import mods.battlegear2.api.weapons.IBattlegearWeapon;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.ConfigBooleans;
import wehavecookies56.kk.lib.Reference;

public class ItemSharpShooter extends ItemSword implements IBattlegearWeapon{
	protected final ToolMaterial material;
	public ItemSharpShooter(ToolMaterial abaddonPlasmaMaterial) {
		super(abaddonPlasmaMaterial);
		this.setCreativeTab(KingdomKeys.KHDAYSTAB);
		this.material = abaddonPlasmaMaterial;
	}
	private int timer = 0;
	
    @Override
    public boolean hasEffect(ItemStack par1ItemStack){
    	if(ConfigBooleans.enableShine == true){
        return true;
    	}
    	return false;
    }

	public ToolMaterial getMaterial() {
		return this.material;
	}
    
    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack){
        return EnumRarity.UNCOMMON;
    }
    
	/*public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if (!player.isSneaking()){

			if (!world.isRemote) 
			{
	    		player.playSound("kk:sharpshooterbullet", 1F, 1F);
				world.spawnEntityInWorld(new EntitySharpshooterBullet(world, player));			
			}
		}
		else
		{
			player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
	        return stack;
		}
		
	return stack;
	}*/
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
		dataList.add("II Xigbar");
	}

	@Override
	public boolean sheatheOnBack(ItemStack item) {
		return true;
	}
	@Override
	public boolean isOffhandHandDual(ItemStack off) {
		return true;
	}
	@Override
	public boolean offhandClickAir(PlayerInteractEvent event,
			ItemStack mainhandItem, ItemStack offhandItem) {
		return true;
	}
	@Override
	public boolean offhandClickBlock(PlayerInteractEvent event,
			ItemStack mainhandItem, ItemStack offhandItem) {
		return true;
	}
	@Override
	public void performPassiveEffects(Side effectiveSide,
			ItemStack mainhandItem, ItemStack offhandItem) {

	}
	@Override
	public boolean allowOffhand(ItemStack mainhand, ItemStack offhand) {
		return true;
	}
	@Override
	public boolean offhandAttackEntity(
			mods.battlegear2.api.PlayerEventChild.OffhandAttackEvent event,
			ItemStack mainhandItem, ItemStack offhandItem) {
		return false;
	}

}
