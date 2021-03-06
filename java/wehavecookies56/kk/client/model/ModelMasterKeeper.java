package wehavecookies56.kk.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMasterKeeper extends ModelBase
{
	ModelRenderer Handle1;
	ModelRenderer handle2;
	ModelRenderer handle3;
	ModelRenderer handle4;
	ModelRenderer handle5;
	ModelRenderer handle6;
	ModelRenderer Handle7;
	ModelRenderer Handle8;
	ModelRenderer Handle9;
	ModelRenderer Handle10;
	ModelRenderer Handle12;
	ModelRenderer Handle11;
	ModelRenderer blade1;
	ModelRenderer blade2;
	ModelRenderer blade3;
	ModelRenderer blade4;
	ModelRenderer blade5;
	ModelRenderer blade6;
	ModelRenderer blade7;
	ModelRenderer blade8;

	public ModelMasterKeeper()
	{
		textureWidth = 64;
		textureHeight = 32;

		Handle1 = new ModelRenderer(this, 30, 1);
		Handle1.addBox(0F, 0F, 0F, 1, 4, 1);
		Handle1.setRotationPoint(0F, 0F, 0F);
		Handle1.setTextureSize(64, 32);
		Handle1.mirror = true;
		setRotation(Handle1, 0F, 0F, 0F);
		handle2 = new ModelRenderer(this, 35, 0);
		handle2.addBox(0F, 0F, 0F, 13, 1, 1);
		handle2.setRotationPoint(-6F, -2F, 0F);
		handle2.setTextureSize(64, 32);
		handle2.mirror = true;
		setRotation(handle2, 0F, 0F, 0F);
		handle3 = new ModelRenderer(this, 34, 18);
		handle3.addBox(0F, 0F, 0F, 3, 4, 3);
		handle3.setRotationPoint(-1F, -4F, -1F);
		handle3.setTextureSize(64, 32);
		handle3.mirror = true;
		setRotation(handle3, 0F, 0F, 0F);
		handle4 = new ModelRenderer(this, 8, 0);
		handle4.addBox(0F, 0F, 0F, 3, 3, 3);
		handle4.setRotationPoint(-5F, -3F, -1F);
		handle4.setTextureSize(64, 32);
		handle4.mirror = true;
		setRotation(handle4, 0F, 0F, 0F);
		handle5 = new ModelRenderer(this, 12, 7);
		handle5.addBox(0F, 0F, 0F, 3, 3, 3);
		handle5.setRotationPoint(3F, -3F, -1F);
		handle5.setTextureSize(64, 32);
		handle5.mirror = true;
		setRotation(handle5, 0F, 0F, 0F);
		handle6 = new ModelRenderer(this, 38, 10);
		handle6.addBox(0F, 0F, 0F, 7, 2, 3);
		handle6.setRotationPoint(-3F, 4F, -1F);
		handle6.setTextureSize(64, 32);
		handle6.mirror = true;
		setRotation(handle6, 0F, 0F, 0F);
		Handle7 = new ModelRenderer(this, 38, 3);
		Handle7.addBox(-1F, 0F, 0F, 1, 4, 1);
		Handle7.setRotationPoint(-3F, 0F, 0F);
		Handle7.setTextureSize(64, 32);
		Handle7.mirror = true;
		setRotation(Handle7, 0F, 0F, 0F);
		Handle8 = new ModelRenderer(this, 30, 10);
		Handle8.addBox(0F, 0F, 0F, 1, 4, 1);
		Handle8.setRotationPoint(4F, 0F, 0F);
		Handle8.setTextureSize(64, 32);
		Handle8.mirror = true;
		setRotation(Handle8, 0F, 0F, 0F);
		Handle9 = new ModelRenderer(this, 30, 7);
		Handle9.addBox(0F, 0F, 0F, 1, 1, 1);
		Handle9.setRotationPoint(0F, 6F, 0F);
		Handle9.setTextureSize(64, 32);
		Handle9.mirror = true;
		setRotation(Handle9, 0F, 0F, 0F);
		Handle10 = new ModelRenderer(this, 16, 14);
		Handle10.addBox(0F, 0F, 0F, 1, 2, 3);
		Handle10.setRotationPoint(-2F, 5F, -1F);
		Handle10.setTextureSize(64, 32);
		Handle10.mirror = true;
		setRotation(Handle10, 0F, 0F, 2.513274F);
		Handle12 = new ModelRenderer(this, 16, 20);
		Handle12.addBox(0F, 0F, 0F, 1, 2, 3);
		Handle12.setRotationPoint(3F, 5F, 2F);
		Handle12.setTextureSize(64, 32);
		Handle12.mirror = true;
		setRotation(Handle12, 0F, -3.141593F, -2.513274F);
		Handle11 = new ModelRenderer(this, 31, 26);
		Handle11.addBox(0F, 0F, 0F, 9, 2, 1);
		Handle11.setRotationPoint(-4F, 4F, 0F);
		Handle11.setTextureSize(64, 32);
		Handle11.mirror = true;
		setRotation(Handle11, 0F, 0F, 0F);
		blade1 = new ModelRenderer(this, 25, 0);
		blade1.addBox(0F, 0F, 0F, 1, 27, 1);
		blade1.setRotationPoint(0F, -31F, 0F);
		blade1.setTextureSize(64, 32);
		blade1.mirror = true;
		setRotation(blade1, 0F, 0F, 0F);
		blade2 = new ModelRenderer(this, 0, 11);
		blade2.addBox(0F, 0F, 0F, 1, 1, 1);
		blade2.setRotationPoint(1F, -28F, 0F);
		blade2.setTextureSize(64, 32);
		blade2.mirror = true;
		setRotation(blade2, 0F, 0F, 0F);
		blade3 = new ModelRenderer(this, 0, 24);
		blade3.addBox(0F, 0F, 0F, 1, 2, 1);
		blade3.setRotationPoint(4F, -26F, 0F);
		blade3.setTextureSize(64, 32);
		blade3.mirror = true;
		setRotation(blade3, 0F, 0F, 0F);
		blade4 = new ModelRenderer(this, 0, 28);
		blade4.addBox(0F, 0F, 0F, 2, 1, 1);
		blade4.setRotationPoint(2F, -25F, 0F);
		blade4.setTextureSize(64, 32);
		blade4.mirror = true;
		setRotation(blade4, 0F, 0F, 0F);
		blade5 = new ModelRenderer(this, 0, 17);
		blade5.addBox(0F, 0F, 0F, 1, 5, 1);
		blade5.setRotationPoint(2F, -30F, 0F);
		blade5.setTextureSize(64, 32);
		blade5.mirror = true;
		setRotation(blade5, 0F, 0F, 0F);
		blade6 = new ModelRenderer(this, 0, 8);
		blade6.addBox(0F, 0F, 0F, 2, 1, 1);
		blade6.setRotationPoint(3F, -30F, 0F);
		blade6.setTextureSize(64, 32);
		blade6.mirror = true;
		setRotation(blade6, 0F, 0F, 0F);
		blade7 = new ModelRenderer(this, 0, 14);
		blade7.addBox(0F, 0F, 0F, 1, 1, 1);
		blade7.setRotationPoint(3F, -27F, 0F);
		blade7.setTextureSize(64, 32);
		blade7.mirror = true;
		setRotation(blade7, 0F, 0F, 0F);
		blade8 = new ModelRenderer(this, 0, 5);
		blade8.addBox(0F, 0F, 0F, 1, 1, 1);
		blade8.setRotationPoint(4F, -29F, 0F);
		blade8.setTextureSize(64, 32);
		blade8.mirror = true;
		setRotation(blade8, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Handle1.render(f5);
		handle2.render(f5);
		handle3.render(f5);
		handle4.render(f5);
		handle5.render(f5);
		handle6.render(f5);
		Handle7.render(f5);
		Handle8.render(f5);
		Handle9.render(f5);
		Handle10.render(f5);
		Handle12.render(f5);
		Handle11.render(f5);
		blade1.render(f5);
		blade2.render(f5);
		blade3.render(f5);
		blade4.render(f5);
		blade5.render(f5);
		blade6.render(f5);
		blade7.render(f5);
		blade8.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
	}

}
