package com.dinodim.entitymodel;
// Date: 8/31/2015 4:06:30 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

import org.lwjgl.opengl.GL11;

import com.dinodim.main.DDUtils;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelStego extends ModelBase
{
	//fields
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;
	ModelRenderer tail1;
	ModelRenderer tail2;
	ModelRenderer tail3;
	ModelRenderer tail4;
	ModelRenderer spike13;
	ModelRenderer spike12;
	ModelRenderer spike11;
	ModelRenderer spike10;
	ModelRenderer spike9;
	ModelRenderer spike8;
	ModelRenderer spike7;
	ModelRenderer spike6;
	ModelRenderer spike5;
	ModelRenderer spike4;
	ModelRenderer spike3;
	ModelRenderer spike2;
	ModelRenderer spike1;
	float rad90deg = DDUtils.degToRad(90F); //90 degrees as converted to radians

	public ModelStego()
	{
		textureWidth = 128;
		textureHeight = 64;

		head = new ModelRenderer(this, 47, 50);
		head.addBox(-3F, -3F, -9F, 6, 5, 9);
		head.setRotationPoint(0F, 11F, -13F);
		head.setTextureSize(128, 64);
		head.mirror = true;
		DDUtils.setRotation(head, DDUtils.degToRad(10F), 0F, 0F);
		
		body = new ModelRenderer(this, 0, 32);
		body.addBox(-6F, -11F, -7F, 12, 21, 11);
		body.setRotationPoint(0F, 7F, -5F);
		body.setTextureSize(128, 64);
		body.mirror = true;
		DDUtils.setRotation(body, DDUtils.degToRad(100F), 0F, 0F);
		
		leg1 = new ModelRenderer(this, 72, 16);
		leg1.addBox(-3F, 0F, -2F, 5, 12, 5);
		leg1.setRotationPoint(-3F, 12F, 3F);
		leg1.setTextureSize(128, 64);
		leg1.mirror = true;
		DDUtils.setRotation(leg1, 0F, 0F, 0F);
		
		leg2 = new ModelRenderer(this, 72, 16);
		leg2.addBox(-2F, 0F, -2F, 5, 12, 5);
		leg2.setRotationPoint(3F, 12F, 3F);
		leg2.setTextureSize(128, 64);
		leg2.mirror = true;
		DDUtils.setRotation(leg2, 0F, 0F, 0F);
		
		leg3 = new ModelRenderer(this, 0, 19);
		leg3.addBox(-3F, 0F, -3F, 4, 9, 4);
		leg3.setRotationPoint(-3F, 15F, -11F);
		leg3.setTextureSize(128, 64);
		leg3.mirror = false;
		DDUtils.setRotation(leg3, 0F, 0F, 0F);
		
		leg4 = new ModelRenderer(this, 0, 19);
		leg4.addBox(-1F, 0F, -3F, 4, 9, 4);
		leg4.setRotationPoint(3F, 15F, -11F);
		leg4.setTextureSize(128, 64);
		leg4.mirror = false;
		DDUtils.setRotation(leg4, 0F, 0F, 0F);
		
		tail1 = new ModelRenderer(this, 35, 15);
		tail1.addBox(-5F, -5F, 0F, 10, 9, 8);
		tail1.setRotationPoint(0F, 8F, 4F);
		tail1.setTextureSize(128, 64);
		tail1.mirror = false;
		DDUtils.setRotation(tail1, 0F, 0F, 0F);
		
		tail2 = new ModelRenderer(this, 47, 33);
		tail2.addBox(-4F, -4F, 0F, 8, 7, 9);
		tail2.setRotationPoint(0F, 8F, 11F);
		tail2.setTextureSize(128, 64);
		tail2.mirror = false;
		DDUtils.setRotation(tail2, DDUtils.degToRad(-5F), 0F, 0F);
		
		tail3 = new ModelRenderer(this, 31, 0);
		tail3.addBox(-3F, -3F, 0F, 6, 5, 9);
		tail3.setRotationPoint(0F, 9F, 19F);
		tail3.setTextureSize(128, 64);
		tail3.mirror = false;
		DDUtils.setRotation(tail3, DDUtils.degToRad(-9F), 0F, 0F);
		
		tail4 = new ModelRenderer(this, 0, 0);
		tail4.addBox(-2F, -2F, 0F, 4, 3, 11);
		tail4.setRotationPoint(0F, 10F, 27F); //arg2 was 11F
		tail4.setTextureSize(128, 64);
		tail4.mirror = true;
		DDUtils.setRotation(tail4, DDUtils.degToRad(-12F), 0F, 0F);
		
		spike13 = new ModelRenderer(this, 17, 16);
		spike13.addBox(-4F, -10F, 0F, 8, 10, 0);
		spike13.setRotationPoint(0F, 3F, -6F);
		spike13.setTextureSize(128, 64);
		spike13.mirror = true;
		DDUtils.setRotation(spike13, 0F, rad90deg, 0F);
		
		spike12 = new ModelRenderer(this, 17, 16);
		spike12.addBox(-3F, -10F, 0F, 8, 10, 0);
		spike12.setRotationPoint(5F, 4F, -10F);
		spike12.setTextureSize(128, 64);
		spike12.mirror = true;
		DDUtils.setRotation(spike12, 0F, rad90deg, 0F);
		
		spike11 = new ModelRenderer(this, 17, 16);
		spike11.addBox(-4F, -10F, 0F, 8, 10, 0);
		spike11.setRotationPoint(5F, 2F, 0F);
		spike11.setTextureSize(128, 64);
		spike11.mirror = true;
		DDUtils.setRotation(spike11, 0F, rad90deg, 0F);
		
		spike10 = new ModelRenderer(this, 17, 16);
		spike10.addBox(-4F, -10F, 0F, 8, 10, 0);
		spike10.setRotationPoint(-5F, 2F, 0F);
		spike10.setTextureSize(128, 64);
		spike10.mirror = false;
		DDUtils.setRotation(spike10, 0F, rad90deg, 0F);
		
		spike9 = new ModelRenderer(this, 17, 16);
		spike9.addBox(-4F, -10F, 0F, 8, 10, 0);
		spike9.setRotationPoint(-5F, 4F, -11F);
		spike9.setTextureSize(128, 64);
		spike9.mirror = false;
		DDUtils.setRotation(spike9, 0F, rad90deg, 0F);
		
		spike8 = new ModelRenderer(this, 75, 0);
		spike8.addBox(-3F, -8F, 0F, 6, 8, 0);
		spike8.setRotationPoint(3F, 3F, 8F);
		spike8.setTextureSize(128, 64);
		spike8.mirror = true;
		DDUtils.setRotation(spike8, 0F, -rad90deg, 0F);
		
		spike7 = new ModelRenderer(this, 75, 0);
		spike7.addBox(-3F, -8F, 0F, 6, 8, 0);
		spike7.setRotationPoint(-3F, 3F, 8F);
		spike7.setTextureSize(128, 64);
		spike7.mirror = false;
		DDUtils.setRotation(spike7, 0F, rad90deg, 0F);
		
		spike6 = new ModelRenderer(this, 62, 0);
		spike6.addBox(-3F, -8F, 0F, 6, 8, 0);
		spike6.setRotationPoint(2F, 5F, 17F);
		spike6.setTextureSize(128, 64);
		spike6.mirror = true;
		DDUtils.setRotation(spike6, 0F, -rad90deg, 0F);
		
		spike5 = new ModelRenderer(this, 62, 0);
		spike5.addBox(-3F, -8F, 0F, 6, 8, 0);
		spike5.setRotationPoint(-2F, 5F, 17F);
		spike5.setTextureSize(128, 64);
		spike5.mirror = false;
		DDUtils.setRotation(spike5, 0F, rad90deg, 0F);
		
		spike4 = new ModelRenderer(this, 62, 0);
		spike4.addBox(-3F, -8F, 0F, 6, 8, 0);
		spike4.setRotationPoint(2F, 7F, 25F);
		spike4.setTextureSize(128, 64);
		spike4.mirror = true;
		DDUtils.setRotation(spike4, 0F, -rad90deg, 0F);
		
		spike3 = new ModelRenderer(this, 62, 0);
		spike3.addBox(-3F, -8F, 0F, 6, 8, 0);
		spike3.setRotationPoint(-2F, 7F, 25F);
		spike3.setTextureSize(128, 64);
		spike3.mirror = false;
		DDUtils.setRotation(spike3, 0F, rad90deg, 0F);
		
		spike2 = new ModelRenderer(this, 62, 9);
		spike2.addBox(-4F, -6F, 0F, 8, 6, 0);
		spike2.setRotationPoint(1F, 10F, 33F);
		spike2.setTextureSize(128, 64);
		spike2.mirror = true;
		DDUtils.setRotation(spike2, 0F, -rad90deg, 0F);
		
		spike1 = new ModelRenderer(this, 62, 9);
		spike1.addBox(-4F, -6F, 0F, 8, 6, 0);
		spike1.setRotationPoint(-1F, 10F, 33F);
		spike1.setTextureSize(128, 64);
		spike1.mirror = false;
		DDUtils.setRotation(spike1, 0F, rad90deg, 0F);
		
		//set childs and parents
		DDUtils.convertToChild(tail4, spike1);
		DDUtils.convertToChild(tail4, spike2);
		DDUtils.convertToChild(tail3, spike3);
		DDUtils.convertToChild(tail3, spike4);
		DDUtils.convertToChild(tail2, spike5);
		DDUtils.convertToChild(tail2, spike6);
		DDUtils.convertToChild(tail1, spike7);
		DDUtils.convertToChild(tail1, spike8);
		DDUtils.convertToChild(tail3, tail4);
		DDUtils.convertToChild(tail2, tail3);
		DDUtils.convertToChild(tail1, tail2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if (this.isChild)
	    {
			head.render(f5);
			body.render(f5);
			leg1.render(f5);
			leg2.render(f5);
			leg3.render(f5);
			leg4.render(f5);
			tail1.render(f5); //parent to tail2, tail3, tail4 & spikes 1-8
			spike9.render(f5);
			spike10.render(f5);
			spike11.render(f5);
			spike12.render(f5);
			spike13.render(f5);
	    }
	    else
	    {
	    	float f6 = 2.0F;
	        GL11.glPushMatrix();
	        GL11.glScalef(f6, f6, f6);
	        GL11.glTranslatef(0.0F, -12.0F * f5, 0.0F);
	        head.render(f5);
			body.render(f5);
			leg1.render(f5);
			leg2.render(f5);
			leg3.render(f5);
			leg4.render(f5);
			tail1.render(f5); //parent to tail2, tail3, tail4 & spikes 1-8
			spike9.render(f5);
			spike10.render(f5);
			spike11.render(f5);
			spike12.render(f5);
			spike13.render(f5);
	        GL11.glPopMatrix();
	    	
	    }
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		float tailX = DDUtils.degToRad(MathHelper.cos((e.ticksExisted + e.getEntityId()) * 0.1F) * 5F);
		float legX1 = MathHelper.cos(f * 0.5662F) * 1.4F * f1;;
		float legX2 = MathHelper.cos(f * 0.5662F + (float)Math.PI) * 1.4F * f1;;
		this.leg1.rotateAngleX = this.leg4.rotateAngleX = legX1;
		this.leg2.rotateAngleX = this.leg3.rotateAngleX = legX2;   
        tail1.rotateAngleX = tail2.rotateAngleX = tail3.rotateAngleX = tail4.rotateAngleX = tailX;
	}

}