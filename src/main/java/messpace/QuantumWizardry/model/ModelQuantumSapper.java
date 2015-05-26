// Date: 5/24/2015 5:59:34 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package messpace.QuantumWizardry.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelQuantumSapper extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
  
  public ModelQuantumSapper()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 16, 3, 16);
      Shape1.setRotationPoint(-8F, 21F, -8F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 56, 0);
      Shape2.addBox(0F, 0F, 0F, 2, 12, 2);
      Shape2.setRotationPoint(-1F, 8F, -1F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 40, 25);
      Shape3.addBox(0F, 0F, 0F, 6, 1, 6);
      Shape3.setRotationPoint(-3F, 20F, -3F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 27);
      Shape4.addBox(0F, 0F, 0F, 2, 4, 1);
      Shape4.setRotationPoint(-1F, 7F, 2F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, -0.2792527F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 27);
      Shape5.addBox(0F, 0F, 0F, 2, 4, 1);
      Shape5.setRotationPoint(-1F, 7.2F, -3F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0.2792527F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 0, 26);
      Shape6.addBox(0F, 0F, 0F, 1, 4, 2);
      Shape6.setRotationPoint(2F, 7F, -1F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0.2792527F);
      Shape7 = new ModelRenderer(this, 0, 26);
      Shape7.addBox(0F, 0F, 0F, 1, 4, 2);
      Shape7.setRotationPoint(-3F, 7.2F, -1F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, -0.2792527F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
