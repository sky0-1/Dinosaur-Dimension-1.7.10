package com.dinodim.entitymodel;

import org.lwjgl.opengl.GL11;

import com.dinodim.main.DDUtils;

//Date: 8/31/2015 8:02:26 PM
//Template version 1.1
//Java generated by Techne
//Keep in mind that you still need to fill in some blanks
//- ZeuX

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.util.MathHelper;

public class ModelSauropod extends ModelBase
{
	//fields
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;
	ModelRenderer neck;
	ModelRenderer tail1;
	ModelRenderer tail2;

	public ModelSauropod()
	{
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this, 0, 0);
		head.addBox(-3F, -8F, 0F, 6, 10, 5);
		head.setRotationPoint(0F, -16F, -6F);
		head.setTextureSize(64, 64);
		head.mirror = true;
		DDUtils.setRotation(head, 1.570796F, 0F, 0F);
		
		body = new ModelRenderer(this, 0, 36);
		body.addBox(-6F, -10F, -7F, 12, 18, 10);
		body.setRotationPoint(0F, 5F, 2F);
		body.setTextureSize(64, 64);
		body.mirror = true;
		DDUtils.setRotation(body, 1.570796F, 0F, 0F);
		
		leg1 = new ModelRenderer(this, 0, 18);
		leg1.addBox(-3F, 0F, -2F, 4, 12, 4);
		leg1.setRotationPoint(-3F, 12F, 8F);
		leg1.setTextureSize(64, 64);
		leg1.mirror = false;
		DDUtils.setRotation(leg1, 0F, 0F, 0F);
		
		leg2 = new ModelRenderer(this, 0, 18);
		leg2.addBox(-1F, 0F, -2F, 4, 12, 4);
		leg2.setRotationPoint(3F, 12F, 8F);
		leg2.setTextureSize(64, 64);
		leg2.mirror = false;
		DDUtils.setRotation(leg2, 0F, 0F, 0F);
		
		leg3 = new ModelRenderer(this, 0, 18);
		leg3.addBox(-3F, 0F, -3F, 4, 12, 4);
		leg3.setRotationPoint(-3F, 12F, -5F);
		leg3.setTextureSize(64, 64);
		leg3.mirror = true;
		DDUtils.setRotation(leg3, 0F, 0F, 0F);
		
		leg4 = new ModelRenderer(this, 0, 18);
		leg4.addBox(-1F, 0F, -3F, 4, 12, 4);
		leg4.setRotationPoint(3F, 12F, -5F);
		leg4.setTextureSize(64, 64);
		leg4.mirror = true;
		DDUtils.setRotation(leg4, 0F, 0F, 0F);
		
		neck = new ModelRenderer(this, 34, 0);
		neck.addBox(-2F, -18F, -3F, 4, 18, 4);
		neck.setRotationPoint(0F, 2F, -5F);
		neck.setTextureSize(64, 64);
		neck.mirror = true;
		DDUtils.setRotation(neck, 0F, 0F, 0F);

		tail1 = new ModelRenderer(this, 17, 17);
	    tail1.addBox(-2F, 0F, -2F, 4, 9, 4);
	    tail1.setRotationPoint(0F, 4F, 9F);
	    tail1.setTextureSize(64, 32);
	    tail1.mirror = true;
	    DDUtils.setRotation(tail1, DDUtils.degToRad(60F), 0F, 0F);
	    tail2 = new ModelRenderer(this, 23, 0);
	    tail2.addBox(-1F, 0F, -1F, 2, 12, 2);
	    tail2.setRotationPoint(0F, 11F, 10F); //arg2 was 4F, arg3 is y-axis
	    tail2.setTextureSize(64, 32);
	    tail2.mirror = true;
	    DDUtils.setRotation(tail2, DDUtils.degToRad(30F), 0F, 0F);
		
		//childs
		DDUtils.convertToChild(this.neck, this.head);
		DDUtils.convertToChild(this.tail1, this.tail2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		float f6 = this.isChild ? 2.0F : 4.0F;
		float f7 = this.isChild ? -12F : -18F;
		
		GL11.glPushMatrix();
		GL11.glScalef(f6, f6, f6);
		GL11.glTranslatef(0.0F, f7 * f5, 0.0F);
		body.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		leg4.render(f5);
		neck.render(f5); //parent
		tail1.render(f5); //parent
		GL11.glPopMatrix();
		
	
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.leg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.leg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;	
    }
}