package wehavecookies56.kk.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.entities.tileentities.TileEntityKKChest;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;

public class BlockKKChest extends BlockContainer 
{
	protected Random rand = new Random();

	public BlockKKChest() {
		super(Material.rock);
		this.setUnlocalizedName(Strings.KKChest);
		this.setStepSound(soundTypeStone);
		this.setHardness(25.0F);
		this.setResistance(5.0F);
		this.setHarvestLevel("pickaxe", 3);
	}

	public static int determineOrientation(World p_150071_0_, int p_150071_1_, int p_150071_2_, int p_150071_3_, EntityLivingBase p_150071_4_)
	{
		int l = MathHelper.floor_double((double)(p_150071_4_.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
		return l;
	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess access,	BlockPos pos) {
		// TODO Auto-generated method stub
		super.setBlockBoundsBasedOnState(access, pos);
		int l = access.getBlockState(pos) & 3;
		if(l != 0 && l != 2){
			this.setBlockBounds(0.2F, 0.0F, 0.1F, 0.9F, 0.75F, 0.9F);
		}
		else{
			this.setBlockBounds(0.1F, 0.0F, 0.25F, 0.9F, 0.75F, 0.9F);
		}
	}
	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
	// TODO Auto-generated method stub
	super.onBlockPlacedBy(world, pos, state, placer, stack);
		TileEntity te = world.getTileEntity(new BlockPos(pos));

		if(te != null && te instanceof TileEntityKKChest){
			int dir = MathHelper.floor_double((double)((placer.rotationYaw * 4F) / 360F) + 0.5D) & 3;
			TileEntityKKChest teKK = (TileEntityKKChest) te;
			teKK.setFacingDirection(dir);
			world.setBlockMetadataWithNotify(pos, dir, 0);
			world.markBlockForUpdate(pos);
		}


	}

	@Override
	public int getRenderType() {
		return -1;
	}

	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
@Override
public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side,	float a, float b, float c) {
	// TODO Auto-generated method stub
	return super.onBlockActivated(world, pos, state, player, side, a, b, c);
	{
		if(		player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.AbaddonPlasma|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.AbyssalTide|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.AllForOne|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Anguis|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Aubade||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.BondOfFlames|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.BrightCrest||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.ChaosRipper|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.CircleOfLife|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Counterpoint|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.CrabClaw|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.CrownOfGuilt|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.CrownUnlimit||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.DarkerThanDark|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Darkgnaw|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.DecisivePumpkin|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.DestinysEmbrace|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.DiamondDust|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.DiveWing|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.DivineRose|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.DreamSword|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.DualDisc||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.EarthShaker|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.EndOfPain||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.FairyHarp|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.FairyStars|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.FatalCrest|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Fenrir|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.FerrisGear|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.FollowTheWind|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.FrolicFlame||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.GlimpseOfDarkness|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.GuardianBell|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.GuardianSoul|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Gullwing||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.HerosCrest|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.HiddenDragon|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Hyperdrive||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.JungleKing||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.KingdomKey|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.KingdomKeyD|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.KnockoutPunch|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Kyeblade|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.KyebladeBroken||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.LadyLuck|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.LeasKeyblade|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Leopardos|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Leviathan|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Lightseeker|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.LionHeart|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.LostMemory|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.LunarEclipse||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.MarkOfAHero|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.MasterKeeper|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.MaverickFlare|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.MetalChocobo|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.MidnightRoar|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.MissingAche|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Monochrome|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.MysteriousAbyss||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.NoName||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Oathkeeper|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Oblivion|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Oceanrage|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Olympia|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.OmegaWeapon|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.OminousBlight|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.OneWingedAngel||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.PainOfSolitude|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.PeoplesHearts|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.PhotonDebugger|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.PixiePetal|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.PumpkinHead||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Rainfell|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.RejectionOfFate|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.RumblingRose||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.SignOfInnocence|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.SilentDirge|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.SkullNoise|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.SleepingLion|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.SoulEater|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.SpellBinder|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.StarLight|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.StarSeeker|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Stormfall|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.StrokeOfMidnight|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.SweetDreams|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.SweetMemories|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.SweetStack||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.ThreeWishes|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.TotalEclipse|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.TreasureTrove|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.TrueLightsFlight|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.TwilightBlaze|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.TwoBecomesOne||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.UltimaWeaopon|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Umbrella|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Unbound|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Unicornis|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Ursus||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.VictoryLine|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.VoidGear|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.Vulpeus||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.WayToDawn|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.WaywardWind|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.WinnersProof|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.WishingLamp|| player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.WishingStar||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.XehanortsKeyblade||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.YoungXehanortsKeyblade||
				player.getHeldItem() != null && player.getHeldItem().getItem() == AddedItems.ZeroOne)
		{
			if(!world.isRemote)
			{
                TileEntity tileEntityKKChest = world.getTileEntity(new BlockPos(pos));

				if (tileEntityKKChest == null)
				{
                    return false;
				}
				if(!player.isSneaking()){
					player.openGui(KingdomKeys.instance, 1, world, pos);
				}
			}
			
			if(world.isRemote){
				if(!player.isSneaking()){
					Minecraft.getMinecraft().thePlayer.playSound("kk:kupo", 0.3F, 1.1F);
				}
			}
		}
		return true;
	}


	@Override
	protected boolean canSilkHarvest()
	{
		return true;
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
		// TODO Auto-generated method stub
		super.breakBlock(world, pos, state);
	
		TileEntityKKChest tileentitykkchest = (TileEntityKKChest)world.getTileEntity(new BlockPos(pos));

		if (tileentitykkchest != null)
		{
			for (int i1 = 0; i1 < tileentitykkchest.getSizeInventory(); ++i1)
			{
				ItemStack itemstack = tileentitykkchest.getStackInSlot(i1);

				if (itemstack != null)
				{
					float f = this.rand.nextFloat() * 0.8F + 0.1F;
					float f1 = this.rand.nextFloat() * 0.8F + 0.1F;
					float f2 = this.rand.nextFloat() * 0.8F + 0.1F;

					while (itemstack.stackSize > 0)
					{
						int j1 = this.rand.nextInt(21) + 10;

						if (j1 > itemstack.stackSize)
						{
							j1 = itemstack.stackSize;
						}

						itemstack.stackSize -= j1;
						EntityItem entityitem = new EntityItem(world, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));

						if (itemstack.hasTagCompound())
						{
							entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
						}

						float f3 = 0.05F;
						entityitem.motionX = (double)((float)this.rand.nextGaussian() * f3);
						entityitem.motionY = (double)((float)this.rand.nextGaussian() * f3 + 0.2F);
						entityitem.motionZ = (double)((float)this.rand.nextGaussian() * f3);
						world.spawnEntityInWorld(entityitem);
					}
				}
			}

			world.func_147453_f(pos, p_149749_5_);
		}
	}

	@Override
	public TileEntity createNewTileEntity(World world, int i) 
	{
		return new TileEntityKKChest();
	}

}
