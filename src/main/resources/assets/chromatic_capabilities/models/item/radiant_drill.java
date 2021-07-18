// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class custom_model extends EntityModel<Entity> {
	private final ModelRenderer DrillBit;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer bb_main;

	public custom_model() {
		textureWidth = 28;
		textureHeight = 37;

		DrillBit = new ModelRenderer(this);
		DrillBit.setRotationPoint(0.0F, 24.0F, -5.0F);
		DrillBit.setTextureOffset(0, 15).addBox(-2.5F, -10.5F, -1.0F, 5.0F, 5.0F, 1.0F, 0.0F, false);
		DrillBit.setTextureOffset(6, 0).addBox(-1.5F, -11.5F, -1.5F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		DrillBit.setTextureOffset(0, 9).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		DrillBit.setTextureOffset(0, 2).addBox(-1.0F, -9.0F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		DrillBit.setTextureOffset(0, 0).addBox(-0.5F, -8.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		DrillBit.setTextureOffset(0, 5).addBox(-1.5F, -9.5F, -3.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		DrillBit.setTextureOffset(4, 0).addBox(-0.5F, -8.5F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		DrillBit.setTextureOffset(10, 9).addBox(-1.0F, -9.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		DrillBit.setTextureOffset(11, 12).addBox(-1.5F, -9.5F, -2.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -8.0F, 5.0F);
		DrillBit.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
		cube_r1.setTextureOffset(6, 0).addBox(-1.5F, -3.5F, -6.5F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -8.0F, 5.0F);
		DrillBit.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -3.1416F);
		cube_r2.setTextureOffset(6, 0).addBox(-1.5F, -3.5F, -6.5F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -8.0F, 5.0F);
		DrillBit.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
		cube_r3.setTextureOffset(6, 0).addBox(-1.5F, -3.5F, -6.5F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(16, 2).addBox(1.0F, -8.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(16, 2).addBox(-2.0F, -8.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(14, 0).addBox(-2.0F, -8.0F, 4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(16, 2).addBox(-2.0F, -11.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(16, 2).addBox(1.0F, -11.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(14, 0).addBox(-2.0F, -12.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 21).addBox(-3.0F, -10.5F, 2.0F, 6.0F, 5.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 27).addBox(-2.0F, -10.0F, -4.0F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(14, 21).addBox(-3.0F, -11.0F, -5.0F, 6.0F, 6.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(13, 12).addBox(-1.5F, -9.5F, -4.0F, 3.0F, 3.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		DrillBit.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}