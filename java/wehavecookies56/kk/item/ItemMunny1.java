package wehavecookies56.kk.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.core.packet.MunnyPacket;
import wehavecookies56.kk.lib.Strings;

public class ItemMunny1 extends ItemKingdomKeys{

    public ItemMunny1() {
        super();       
        this.setUnlocalizedName(Strings.Munny1); 
    }
    @Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer entity) {
			IMessage packet = new MunnyPacket(new ItemStack(AddedItems.Munny1), 1);
			KingdomKeys.network.sendToServer(packet);
			entity.playSound("random.orb", 1, 1);
			return super.onItemRightClick(item, world, entity);
	}
}