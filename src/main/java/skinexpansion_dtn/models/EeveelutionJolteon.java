package skinexpansion_dtn.models;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class EeveelutionJolteon {
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create().texOffs(9, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone5 = real_tail.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(44, 10).addBox(2.0F, 5.0F, -9.75F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.5F))
		.texOffs(44, 9).addBox(2.75F, 5.25F, -9.75F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.6F))
		.texOffs(46, 11).addBox(3.85F, 5.85F, -8.2F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.5F))
		.texOffs(42, 9).addBox(3.2F, 6.75F, -10.55F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.5F))
		.texOffs(42, 9).addBox(2.7F, 7.75F, -10.55F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.6F))
		.texOffs(42, 9).addBox(0.65F, 7.2F, -9.95F, 3.0F, 3.0F, 8.0F, new CubeDeformation(-1.0F))
		.texOffs(42, 9).addBox(1.15F, 8.2F, -9.95F, 3.0F, 3.0F, 8.0F, new CubeDeformation(-1.0F))
		.texOffs(47, 12).addBox(2.35F, 8.0F, -9.3F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.5F))
		.texOffs(47, 12).addBox(3.2F, 8.5F, -7.05F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.5F))
		.texOffs(44, 10).mirror().addBox(1.0F, 5.75F, -9.75F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(42, 8).mirror().addBox(-0.1F, 5.95F, -10.3F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(44, 9).mirror().addBox(0.25F, 5.25F, -9.75F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.6F)).mirror(false)
		.texOffs(46, 11).mirror().addBox(-0.85F, 5.85F, -8.2F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(43, 9).mirror().addBox(0.3F, 7.25F, -10.55F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(47, 12).mirror().addBox(-0.1F, 8.0F, -9.3F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(47, 12).mirror().addBox(-0.2F, 8.5F, -8.05F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 10.25F, 7.5F, -1.5708F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-1.0F, -0.25F, -2.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(0, 18).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.5F, 16.0F, 7.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(-1.0F, -0.25F, -2.3F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offset(1.5F, 16.0F, 7.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 16.0F, -4.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.5F, 16.0F, -4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(18, 14).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 9.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone3 = body.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(47, 11).addBox(-2.2412F, -3.4971F, -3.7912F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.2F))
		.texOffs(47, 11).addBox(-2.2412F, -0.4971F, -3.7912F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.2F))
		.texOffs(47, 11).addBox(-3.5912F, -4.2471F, -2.2912F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.3F))
		.texOffs(47, 11).addBox(-2.5912F, -3.9471F, -3.2912F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.3F))
		.texOffs(45, 11).addBox(-1.5912F, -3.5971F, -2.7912F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.2F))
		.texOffs(45, 10).addBox(-0.8412F, -4.2471F, -0.7912F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.3F))
		.texOffs(47, 12).addBox(-0.0412F, -2.8971F, -1.2412F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.2F))
		.texOffs(44, 9).addBox(-0.4912F, -2.7971F, -3.3412F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.2F))
		.texOffs(42, 10).addBox(-1.3912F, -1.9971F, -3.5912F, 3.0F, 2.0F, 7.0F, new CubeDeformation(-0.2F))
		.texOffs(46, 12).addBox(-1.6912F, -1.5471F, -2.9912F, 3.0F, 3.0F, 5.0F, new CubeDeformation(-0.5F))
		.texOffs(48, 13).addBox(-0.4912F, -0.7471F, -2.3412F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(48, 13).addBox(-0.3912F, -0.2471F, -1.0912F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(48, 13).addBox(-0.5912F, 0.7529F, -1.0912F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.4F))
		.texOffs(48, 13).addBox(-0.5912F, 0.2529F, -2.3412F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F))
		.texOffs(46, 13).addBox(-2.5912F, -0.2471F, -3.7912F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(46, 13).addBox(-2.1912F, 0.7529F, -3.3412F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(47, 13).addBox(-1.5912F, 1.2029F, -2.7412F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(48, 13).addBox(-0.5912F, 1.7529F, -2.3412F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F))
		.texOffs(48, 13).addBox(-0.5912F, 2.7529F, -1.0912F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.4F))
		.texOffs(47, 11).addBox(-2.3412F, -3.2471F, -2.7912F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.5912F, 6.7471F, 0.0412F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone4 = body.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(47, 11).mirror().addBox(0.8412F, -3.4971F, -3.7912F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.5F)).mirror(false)
		.texOffs(45, 11).mirror().addBox(-0.4088F, -3.4971F, -2.7912F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(45, 10).mirror().addBox(-1.1588F, -3.4971F, -0.7912F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(47, 12).mirror().addBox(-2.2588F, -1.7971F, -1.2412F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(44, 9).mirror().addBox(-1.5088F, -2.7971F, -3.3412F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(42, 10).mirror().addBox(-1.1088F, -1.9971F, -3.5912F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(46, 12).mirror().addBox(-1.3088F, -1.5471F, -2.9912F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(48, 13).mirror().addBox(-1.5088F, -0.7471F, -2.3412F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(48, 13).mirror().addBox(-1.6088F, -0.2471F, -1.0912F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(48, 13).mirror().addBox(-1.4088F, 0.7529F, -1.0912F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(48, 13).mirror().addBox(-1.4088F, 0.2529F, -2.3412F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(46, 13).mirror().addBox(-1.4088F, -0.2471F, -3.7912F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(46, 13).mirror().addBox(-2.5088F, 0.7529F, -3.3412F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(47, 13).mirror().addBox(-1.4088F, 1.2029F, -2.7412F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(48, 13).mirror().addBox(-1.4088F, 1.7529F, -2.3412F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(48, 13).mirror().addBox(-1.4088F, 2.7529F, -1.0912F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(46, 11).mirror().addBox(-0.4088F, -3.4971F, -2.7912F, 3.0F, 2.0F, 6.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.5912F, 6.7471F, 0.0412F, -1.5708F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(21, 0).addBox(-4.0F, -2.75F, -3.5F, 8.0F, 6.0F, 7.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 14.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone = upper_body.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(44, 21).addBox(2.6F, -5.55F, -5.3F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.5F))
		.texOffs(42, 22).addBox(0.7F, -4.75F, -5.55F, 4.0F, 2.0F, 7.0F, new CubeDeformation(-0.5F))
		.texOffs(48, 24).addBox(1.45F, -5.0F, -3.05F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.5F))
		.texOffs(44, 21).addBox(2.25F, -6.25F, -4.75F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.6F))
		.texOffs(46, 23).addBox(1.5F, -6.25F, -4.75F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.5F))
		.texOffs(46, 23).addBox(0.5F, -6.45F, -4.75F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.5F))
		.texOffs(44, 21).addBox(0.5F, -6.25F, -4.75F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.6F))
		.texOffs(46, 23).addBox(-0.25F, -6.25F, -5.5F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.4F))
		.texOffs(46, 23).addBox(-1.0F, -6.25F, -4.5F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.5F))
		.texOffs(46, 23).addBox(-2.0F, -6.25F, -5.75F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.4F))
		.texOffs(48, 23).addBox(-2.25F, -6.25F, -6.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.1F))
		.texOffs(47, 22).addBox(2.25F, -6.25F, -3.25F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F))
		.texOffs(48, 23).addBox(-4.0F, -6.75F, -1.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F))
		.texOffs(46, 21).addBox(2.0F, -7.05F, -3.55F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.1F))
		.texOffs(48, 23).addBox(-0.75F, -6.25F, -5.75F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.1F))
		.texOffs(46, 23).mirror().addBox(-2.25F, -7.7F, -3.25F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(46, 23).mirror().addBox(-1.5F, -7.5F, -4.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(51, 26).mirror().addBox(0.0F, -7.75F, -1.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(50, 25).mirror().addBox(0.0F, -6.85F, -1.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(46, 23).mirror().addBox(-1.35F, -7.85F, -4.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(50, 26).mirror().addBox(0.5F, -7.5F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(45, 22).addBox(-3.0F, -6.25F, -4.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.5F))
		.texOffs(44, 21).addBox(-4.0F, -6.25F, -4.5F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.4F))
		.texOffs(45, 24).addBox(0.4F, -4.3F, -4.95F, 4.0F, 3.0F, 5.0F, new CubeDeformation(-0.5F))
		.texOffs(48, 24).addBox(3.35F, -5.65F, -3.2F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.5F))
		.texOffs(47, 22).mirror().addBox(-3.0F, -7.0F, -3.55F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(47, 22).mirror().addBox(-2.25F, -7.5F, -2.55F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(47, 22).mirror().addBox(-3.85F, -6.5F, -3.25F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(44, 21).mirror().addBox(-4.75F, -6.25F, -4.75F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.6F)).mirror(false)
		.texOffs(49, 25).addBox(2.6F, -3.5F, -4.3F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.5F))
		.texOffs(45, 22).addBox(3.1F, -3.5F, -4.3F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.5F))
		.texOffs(45, 22).addBox(3.6F, -3.0F, -3.55F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.7F))
		.texOffs(49, 25).addBox(2.7F, -3.0F, -3.05F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.5F))
		.texOffs(46, 25).addBox(0.5F, -3.0F, -5.75F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.5F))
		.texOffs(46, 25).addBox(0.7F, -2.0F, -5.3F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.5F))
		.texOffs(49, 25).addBox(2.5F, -2.5F, -4.3F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.6F))
		.texOffs(49, 25).addBox(2.5F, -1.0F, -4.3F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.6F))
		.texOffs(46, 25).addBox(0.5F, -1.55F, -4.7F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.5F))
		.texOffs(46, 25).addBox(0.0F, -1.4F, -5.05F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.5F))
		.texOffs(46, 25).addBox(-1.0F, -2.3F, -4.55F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(49, 25).addBox(2.5F, -2.0F, -3.05F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.7F))
		.texOffs(49, 25).addBox(2.5F, 0.0F, -3.05F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(0.25F, 1.5F, -2.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition bone2 = upper_body.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(45, 24).mirror().addBox(-4.6F, -5.55F, -5.3F, 4.0F, 2.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(44, 22).mirror().addBox(-4.7F, -4.75F, -5.55F, 3.0F, 2.0F, 7.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(48, 24).mirror().addBox(-3.45F, -5.0F, -3.05F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(43, 21).mirror().addBox(-4.25F, -6.25F, -4.75F, 2.0F, 2.0F, 8.0F, new CubeDeformation(-0.6F)).mirror(false)
		.texOffs(45, 24).mirror().addBox(-4.4F, -4.3F, -4.95F, 4.0F, 3.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(48, 24).mirror().addBox(-4.85F, -5.65F, -3.2F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(45, 22).mirror().addBox(-4.6F, -3.5F, -4.3F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(45, 22).mirror().addBox(-5.1F, -3.5F, -4.3F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(45, 22).mirror().addBox(-5.35F, -4.3F, -3.3F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(49, 25).mirror().addBox(-4.7F, -3.0F, -3.05F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(46, 25).mirror().addBox(-4.5F, -3.0F, -5.75F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(46, 25).mirror().addBox(-4.7F, -2.0F, -5.3F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(49, 25).mirror().addBox(-4.5F, -2.5F, -4.3F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.6F)).mirror(false)
		.texOffs(49, 25).mirror().addBox(-4.5F, -1.0F, -4.3F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.6F)).mirror(false)
		.texOffs(46, 25).mirror().addBox(-4.5F, -1.55F, -4.7F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(46, 25).mirror().addBox(-4.0F, -1.4F, -5.05F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(47, 24).mirror().addBox(-2.0F, -2.9F, -6.05F, 2.0F, 3.0F, 5.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(48, 25).mirror().addBox(0.0F, -2.15F, -5.05F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false)
		.texOffs(48, 25).mirror().addBox(-0.25F, -2.15F, -5.55F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.05F)).mirror(false)
		.texOffs(46, 25).mirror().addBox(-2.25F, -2.3F, -4.55F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(49, 25).mirror().addBox(-4.5F, -2.0F, -3.05F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.7F)).mirror(false)
		.texOffs(48, 24).mirror().addBox(-4.5F, 0.0F, -3.05F, 2.0F, 1.0F, 5.0F, new CubeDeformation(-0.7F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 1.5F, -2.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 11.5F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -2.55F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition snout = real_head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, -2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition snout_upper = snout.addOrReplaceChild("snout_upper", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -0.7565F, -2.7996F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, -0.52F, 0.0F));

		PartDefinition snout_lower = snout.addOrReplaceChild("snout_lower", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, -0.6392F, -2.5474F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(0, 10).addBox(-1.5F, -0.498F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.201F)), PartPose.offset(0.0F, 0.93F, 0.65F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, -3.25F, 0.25F, 0.0F, 0.2182F, 0.2618F));

		PartDefinition head_r1 = left_ear.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(58, 6).mirror().addBox(-0.9203F, -2.2553F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.192F, -1.0202F, 1.6285F, -1.5627F, 0.7855F, -1.6084F));

		PartDefinition head_r2 = left_ear.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(58, 6).addBox(-0.9203F, -2.2553F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.192F, -0.2202F, 0.3785F, -1.5642F, 0.5237F, -1.6108F));

		PartDefinition head_r3 = left_ear.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(16, 14).addBox(-0.9203F, -3.2553F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.192F, -0.9702F, 2.1285F, -1.5573F, 1.1346F, -1.6018F));

		PartDefinition head_r4 = left_ear.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(-0.5F, -3.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.2588F, 0.4177F, 0.3008F, -1.5646F, 0.3928F, -1.6117F));

		PartDefinition head_r5 = left_ear.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(16, 14).addBox(-1.0F, -4.6382F, 0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.1F, -0.793F, -0.3395F, -1.5708F, -0.4363F, 1.5708F));

		PartDefinition head_r6 = left_ear.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(-1.0F, -2.6382F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.1F, 2.3882F, -1.0F, -1.5708F, -1.0908F, 1.5708F));

		PartDefinition head_r7 = left_ear.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(16, 14).addBox(-1.0F, -3.6382F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.0882F, -0.7F, -1.5708F, -0.9163F, 1.5708F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, -3.25F, 0.25F, 0.0F, -0.2182F, -0.2618F));

		PartDefinition head_r8 = right_ear.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(58, 6).mirror().addBox(-1.0797F, -2.2553F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.192F, -0.2202F, 0.3785F, -1.5642F, -0.5237F, 1.6108F));

		PartDefinition head_r9 = right_ear.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(-0.0797F, -3.2553F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.192F, -0.9702F, 2.1285F, -1.5573F, -1.1346F, 1.6018F));

		PartDefinition head_r10 = right_ear.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(0.0F, -3.6382F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 1.0882F, -0.7F, -1.5708F, 0.9163F, -1.5708F));

		PartDefinition head_r11 = right_ear.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(16, 14).addBox(0.0F, -2.6382F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.1F, 2.3882F, -1.0F, -1.5708F, 1.0908F, -1.5708F));

		PartDefinition head_r12 = right_ear.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(0.0F, -4.6382F, 0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.793F, -0.3395F, -1.5708F, 0.4363F, -1.5708F));

		PartDefinition head_r13 = right_ear.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(16, 14).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.2588F, 0.4177F, 0.3008F, -1.5646F, -0.3928F, 1.6117F));

		PartDefinition head_r14 = right_ear.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(58, 6).addBox(-1.0797F, -2.2553F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.192F, -1.0202F, 1.6285F, -1.5627F, -0.7855F, 1.6084F));

		PartDefinition bone6 = real_head.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(49, 14).addBox(2.4F, -8.75F, -10.45F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F))
		.texOffs(49, 14).addBox(2.6F, -7.75F, -10.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F))
		.texOffs(49, 14).addBox(2.4F, -8.25F, -9.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F))
		.texOffs(49, 14).addBox(2.4F, -7.75F, -7.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.7F))
		.texOffs(49, 14).addBox(2.4F, -7.3F, -9.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F))
		.texOffs(49, 14).addBox(2.4F, -7.0F, -7.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.7F))
		.texOffs(48, 13).addBox(0.4F, -7.25F, -9.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.6F))
		.texOffs(49, 14).addBox(0.15F, -6.75F, -9.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F))
		.texOffs(49, 14).mirror().addBox(-2.6F, -5.75F, -7.75F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.7F)).mirror(false)
		.texOffs(49, 14).mirror().addBox(-2.8F, -7.75F, -10.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(49, 14).mirror().addBox(-2.6F, -6.75F, -8.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)).mirror(false)
		.texOffs(49, 14).mirror().addBox(-0.6F, -6.75F, -10.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(48, 13).mirror().addBox(-0.6F, -7.25F, -8.5F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.6F)).mirror(false)
		.texOffs(48, 13).mirror().addBox(-0.1F, -7.4F, -9.3F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.6F)).mirror(false)
		.texOffs(49, 14).mirror().addBox(-1.6F, -7.25F, -7.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.6F)).mirror(false)
		.texOffs(49, 14).mirror().addBox(-1.6F, -6.75F, -9.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(49, 14).mirror().addBox(-2.6F, -8.75F, -10.45F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(49, 14).mirror().addBox(-2.6F, -7.75F, -7.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.7F)).mirror(false)
		.texOffs(49, 14).mirror().addBox(-2.6F, -8.25F, -9.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)).mirror(false)
		.texOffs(49, 14).mirror().addBox(-2.45F, -10.05F, -8.65F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(49, 14).mirror().addBox(-2.8F, -10.75F, -8.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(49, 14).addBox(1.75F, -12.0F, -8.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F))
		.texOffs(47, 12).addBox(1.0F, -12.0F, -9.25F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.3F))
		.texOffs(47, 12).addBox(0.5F, -12.0F, -8.25F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.6F))
		.texOffs(48, 13).addBox(-0.75F, -11.5F, -8.75F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.6F))
		.texOffs(48, 13).addBox(0.0F, -12.5F, -9.25F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.4F))
		.texOffs(48, 13).addBox(0.9F, -12.3F, -10.25F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.5F))
		.texOffs(49, 14).addBox(2.5F, -10.05F, -8.65F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F))
		.texOffs(49, 14).addBox(2.6F, -8.75F, -7.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F))
		.texOffs(48, 13).addBox(1.35F, -10.75F, -7.75F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.5F))
		.texOffs(49, 14).mirror().addBox(-2.6F, -7.3F, -9.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(49, 14).mirror().addBox(-2.6F, -7.0F, -7.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.7F)).mirror(false)
		.texOffs(49, 14).addBox(2.4F, -5.75F, -7.75F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.7F))
		.texOffs(49, 14).addBox(2.4F, -6.75F, -9.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F))
		.texOffs(49, 14).addBox(1.4F, -6.75F, -9.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F))
		.texOffs(49, 14).addBox(0.9F, -6.55F, -9.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F))
		.texOffs(49, 14).addBox(1.4F, -7.25F, -7.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.6F))
		.texOffs(49, 14).mirror().addBox(-2.7F, -9.25F, -9.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(49, 14).mirror().addBox(-2.2F, -11.85F, -9.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(49, 14).mirror().addBox(-0.95F, -10.75F, -9.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(49, 14).mirror().addBox(-1.2F, -11.75F, -8.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)).mirror(false)
		.texOffs(48, 13).mirror().addBox(-0.7F, -12.25F, -8.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.6F)).mirror(false)
		.texOffs(48, 12).addBox(-1.45F, -12.25F, -9.7F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.5F))
		.texOffs(48, 12).mirror().addBox(-0.65F, -12.45F, -10.2F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(46, 11).mirror().addBox(0.3F, -13.25F, -9.2F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(47, 12).mirror().addBox(0.25F, -12.1F, -9.95F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(49, 14).mirror().addBox(-0.2F, -11.25F, -8.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(49, 14).mirror().addBox(-2.7F, -11.5F, -8.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)).mirror(false)
		.texOffs(49, 14).mirror().addBox(-2.8F, -8.75F, -7.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false)
		.texOffs(49, 14).addBox(2.5F, -9.25F, -9.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F))
		.texOffs(49, 14).addBox(2.5F, -11.5F, -9.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F))
		.texOffs(49, 14).addBox(0.25F, -12.25F, -8.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.7F))
		.texOffs(49, 14).addBox(-0.75F, -11.5F, -8.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F))
		.texOffs(49, 14).addBox(0.25F, -10.55F, -8.65F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F))
		.texOffs(49, 14).addBox(1.0F, -11.5F, -9.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F)), PartPose.offset(-0.9F, 8.5F, 8.2F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

}
