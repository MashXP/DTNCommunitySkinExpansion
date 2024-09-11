package skinexpansion_dtn.models;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class EeveelutionVaporeon {
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 8.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create().texOffs(9, 18).addBox(-1.0F, -0.0327F, -1.7493F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.05F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail_r1 = real_tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(9, 18).mirror().addBox(-1.75F, 2.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
		.texOffs(9, 18).mirror().addBox(-0.75F, 1.65F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
		.texOffs(9, 18).mirror().addBox(0.0F, 1.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
		.texOffs(9, 18).mirror().addBox(-1.65F, 2.75F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.0F, 10.577F, 4.385F, 0.9098F, -0.5049F, 0.3598F));

		PartDefinition tail_r2 = real_tail.addOrReplaceChild("tail_r2", CubeListBuilder.create().texOffs(9, 18).addBox(-0.35F, 2.75F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.35F))
		.texOffs(9, 18).addBox(-0.25F, 2.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F))
		.texOffs(9, 18).addBox(-2.0F, 1.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.45F))
		.texOffs(9, 18).addBox(-1.25F, 1.65F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 10.577F, 4.385F, 0.9098F, 0.5049F, -0.3598F));

		PartDefinition tail_r3 = real_tail.addOrReplaceChild("tail_r3", CubeListBuilder.create().texOffs(9, 18).addBox(-1.0F, 6.7368F, -5.0369F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.0F, 2.2671F, -0.6801F, 1.0036F, 0.0F, 0.0F));

		PartDefinition tail_r4 = real_tail.addOrReplaceChild("tail_r4", CubeListBuilder.create().texOffs(9, 18).addBox(-1.0F, 3.6761F, -1.8496F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, 2.2671F, -0.6801F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail_r5 = real_tail.addOrReplaceChild("tail_r5", CubeListBuilder.create().texOffs(9, 18).addBox(-1.0F, -0.0411F, -0.9176F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(0.0F, 2.2671F, -0.6801F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone2 = real_tail.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, 8.1371F, -5.2104F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
		.texOffs(45, 28).addBox(-1.0F, 8.1371F, -5.2104F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.8F)), PartPose.offsetAndRotation(0.0F, 1.377F, 0.5988F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -1.4129F, -1.0604F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
		.texOffs(45, 28).addBox(-1.0F, 0.3371F, -1.0604F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(0.0F, 6.8F, -3.5F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, 0.8371F, -1.4104F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(0.0F, 6.8F, -3.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -0.61F, -0.8517F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 6.8F, -3.5F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -1.4129F, -1.0604F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(0.0F, 5.2F, -3.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -0.61F, -0.8517F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 5.2F, -3.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -1.4129F, -1.0604F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(0.0F, 3.95F, -2.25F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -0.61F, -0.8517F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 3.95F, -2.25F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -1.4129F, -1.0604F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(0.0F, 2.45F, -1.5F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -0.61F, -0.8517F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 2.45F, -1.5F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -1.4129F, -1.0604F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(0.0F, 1.0F, -0.5F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -0.61F, -0.8517F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 1.0F, -0.5F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -1.25F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.4145F, 0.0485F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, 4.7475F, 0.9056F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -5.5635F, 0.9151F, -0.48F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.5F, 16.0F, 8.0F));

		PartDefinition leg1_r1 = right_hind_leg.addOrReplaceChild("leg1_r1", CubeListBuilder.create().texOffs(-1, 17).mirror().addBox(-1.0F, -2.0F, -1.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.0F, -0.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 16.0F, 8.0F));

		PartDefinition leg3_r1 = left_hind_leg.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(-1, 17).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.0F, 2.0F, -0.5F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false)
		.texOffs(0, 18).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.5F, 16.0F, -4.0F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(1.5F, 16.0F, -4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body_rotation_r1 = body.addOrReplaceChild("body_rotation_r1", CubeListBuilder.create().texOffs(18, 14).addBox(-3.0F, -1.5F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -1.75F, -0.75F, -0.1309F, 0.0F, 0.0F));

		PartDefinition body_rotation_r2 = body.addOrReplaceChild("body_rotation_r2", CubeListBuilder.create().texOffs(18, 14).addBox(-3.0F, -4.5174F, -3.1992F, 6.0F, 10.0F, 6.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 2.5F, -0.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, 5.0F, -0.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
		.texOffs(45, 28).addBox(-1.0F, 3.25F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
		.texOffs(45, 28).addBox(-1.0F, 1.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
		.texOffs(45, 28).addBox(-1.0F, -0.25F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
		.texOffs(45, 28).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -1.75F, -2.8F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, 4.9975F, 0.6556F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
		.texOffs(45, 28).addBox(-1.0F, -0.2915F, -0.6212F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
		.texOffs(45, 28).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -1.0F, -3.1F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, 3.1841F, -3.9971F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, 1.417F, -0.2425F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -1.0F, -3.1F, -0.4451F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(21, 0).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 6.0F, 7.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 14.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r18 = upper_body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 1.9F, 2.2F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r19 = upper_body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -1.4F, 3.45F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r20 = upper_body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -1.95F, 4.15F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r21 = upper_body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.25F, 2.7F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r22 = upper_body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, 2.9F, 1.9F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r23 = upper_body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, 0.9F, 2.4F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r24 = upper_body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(45, 28).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -0.8F, 3.4F, -0.3491F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r1 = upper_body.addOrReplaceChild("mane_rotation_r1", CubeListBuilder.create().texOffs(23, 1).addBox(-2.0F, -4.0F, -2.75F, 6.0F, 4.0F, 6.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(-1.0F, -1.5F, 1.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r2 = upper_body.addOrReplaceChild("mane_rotation_r2", CubeListBuilder.create().texOffs(23, 1).addBox(-2.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-1.0F, -1.5F, 1.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 12.25F, -7.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(44, 25).addBox(-3.0F, -3.75F, -2.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_r1 = real_head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(42, 14).mirror().addBox(-4.0F, -4.0F, -0.5F, 9.0F, 8.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, 1.4F, -0.0387F, -0.0201F, -0.4796F));

		PartDefinition head_r2 = real_head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(42, 14).addBox(-5.0F, -4.0F, -0.3F, 9.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.0F, 1.4F, -0.0387F, 0.0201F, 0.4796F));

		PartDefinition head_r3 = real_head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(42, 14).addBox(-5.0F, -4.0F, -0.5F, 9.0F, 8.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5F, 0.0F, 1.4F, -0.0436F, 0.0F, 0.0F));

		PartDefinition snout = real_head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, -0.25F, 0.2182F, 0.0F, 0.0F));

		PartDefinition snout_upper = snout.addOrReplaceChild("snout_upper", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -1.0F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.52F, 0.0F));

		PartDefinition snout_lower = snout.addOrReplaceChild("snout_lower", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(-1.5F, -0.498F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offset(0.0F, 0.98F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(1.75F, -1.0F, 1.5F));

		PartDefinition head_r4 = left_ear.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(50, 2).addBox(-1.0F, -1.6382F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(3.7F, -2.8118F, -1.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition head_r5 = left_ear.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(49, 2).addBox(-2.0F, -1.6382F, -0.5F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.27F)), PartPose.offsetAndRotation(3.8F, 0.1882F, -0.9F, 0.0F, 0.0F, -1.2479F));

		PartDefinition head_r6 = left_ear.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(49, 2).addBox(-2.0F, -0.6382F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.27F)), PartPose.offsetAndRotation(1.8F, -0.6118F, -1.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition head_r7 = left_ear.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(49, 2).addBox(-2.0F, -0.6382F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.26F)), PartPose.offsetAndRotation(1.8F, 0.3882F, -1.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition head_r8 = left_ear.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(50, 2).addBox(-1.0F, -1.6382F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.5F, -1.3618F, -1.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition head_r9 = left_ear.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(50, 27).addBox(-1.0F, -1.6382F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(3.5F, -0.3118F, -1.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition head_r10 = left_ear.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(50, 27).addBox(-1.0F, -1.6382F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.0F, 3.0882F, -1.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition head_r11 = left_ear.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(50, 27).addBox(-1.0F, -1.6382F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.0F, 2.2882F, -1.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition head_r12 = left_ear.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(50, 27).addBox(-1.0F, -1.6382F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.5F, 1.2882F, -1.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition head_r13 = left_ear.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(50, 27).addBox(-1.0F, -1.6382F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.5F, 0.7882F, -1.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition head_r14 = left_ear.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(52, 27).addBox(-2.0F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.9361F, -3.0614F, -1.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition head_r15 = left_ear.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(54, 27).addBox(-0.4102F, -0.6772F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(5.4035F, -1.2456F, -1.0F, 0.0F, 0.0F, -0.9599F));

		PartDefinition head_r16 = left_ear.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(53, 27).addBox(-2.5994F, -0.6414F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(5.2035F, 0.5044F, -1.0F, 0.0F, 0.0F, -1.2217F));

		PartDefinition head_r17 = left_ear.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(53, 27).addBox(-2.5994F, -0.6414F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(5.4035F, -1.2456F, -1.0F, 0.0F, 0.0F, -1.4835F));

		PartDefinition head_r18 = left_ear.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(54, 27).addBox(-1.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(5.6739F, -5.3421F, -1.0F, 0.0F, 0.0F, -1.5272F));

		PartDefinition head_r19 = left_ear.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(54, 27).addBox(-1.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(5.7239F, -4.0921F, -1.0F, 0.0F, 0.0F, -2.0508F));

		PartDefinition head_r20 = left_ear.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(54, 27).addBox(3.0F, -1.6382F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.052F, -2.2185F, -1.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-1.75F, -1.0F, 1.5F));

		PartDefinition head_r21 = right_ear.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(49, 2).mirror().addBox(-3.0F, -0.6382F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.27F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.6118F, -1.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition head_r22 = right_ear.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(49, 2).mirror().addBox(-3.0F, -0.6382F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.26F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 0.3882F, -1.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition head_r23 = right_ear.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(50, 2).mirror().addBox(-3.0F, -1.6382F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.3618F, -1.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition head_r24 = right_ear.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(53, 27).mirror().addBox(-0.4006F, -0.6414F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-5.4035F, -1.2456F, -1.0F, 0.0F, 0.0F, 1.4835F));

		PartDefinition head_r25 = right_ear.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(50, 27).mirror().addBox(-2.0F, -1.6382F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.2882F, -1.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition head_r26 = right_ear.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(50, 27).mirror().addBox(-4.0F, -1.6382F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.2882F, -1.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition head_r27 = right_ear.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(54, 27).mirror().addBox(-0.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-5.7239F, -4.0921F, -1.0F, 0.0F, 0.0F, 2.0508F));

		PartDefinition head_r28 = right_ear.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(54, 27).mirror().addBox(-0.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-5.6739F, -5.3421F, -1.0F, 0.0F, 0.0F, 1.5272F));

		PartDefinition head_r29 = right_ear.addOrReplaceChild("head_r29", CubeListBuilder.create().texOffs(50, 27).mirror().addBox(-2.0F, -1.6382F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.7882F, -1.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition head_r30 = right_ear.addOrReplaceChild("head_r30", CubeListBuilder.create().texOffs(50, 27).mirror().addBox(-1.0F, -1.6382F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 3.0882F, -1.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition head_r31 = right_ear.addOrReplaceChild("head_r31", CubeListBuilder.create().texOffs(53, 27).mirror().addBox(-0.4006F, -0.6414F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-5.2035F, 0.5044F, -1.0F, 0.0F, 0.0F, 1.2217F));

		PartDefinition head_r32 = right_ear.addOrReplaceChild("head_r32", CubeListBuilder.create().texOffs(54, 27).mirror().addBox(-6.0F, -1.6382F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.052F, -2.2185F, -1.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition head_r33 = right_ear.addOrReplaceChild("head_r33", CubeListBuilder.create().texOffs(54, 27).mirror().addBox(-1.5898F, -0.6772F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-5.4035F, -1.2456F, -1.0F, 0.0F, 0.0F, 0.9599F));

		PartDefinition head_r34 = right_ear.addOrReplaceChild("head_r34", CubeListBuilder.create().texOffs(52, 27).mirror().addBox(-3.0F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.9361F, -3.0614F, -1.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition head_r35 = right_ear.addOrReplaceChild("head_r35", CubeListBuilder.create().texOffs(49, 2).mirror().addBox(-3.0F, -1.6382F, -0.5F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.27F)).mirror(false), PartPose.offsetAndRotation(-3.8F, 0.1882F, -0.9F, 0.0F, 0.0F, 1.2479F));

		PartDefinition head_r36 = right_ear.addOrReplaceChild("head_r36", CubeListBuilder.create().texOffs(50, 27).mirror().addBox(-4.0F, -1.6382F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -0.3118F, -1.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition head_r37 = right_ear.addOrReplaceChild("head_r37", CubeListBuilder.create().texOffs(50, 2).mirror().addBox(-3.0F, -1.6382F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-3.7F, -2.8118F, -1.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition left_ear2 = real_head.addOrReplaceChild("left_ear2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -6.05F, 1.5F, 0.0F, -1.7453F, 0.0F));

		PartDefinition head_r38 = left_ear2.addOrReplaceChild("head_r38", CubeListBuilder.create().texOffs(50, 2).addBox(-0.7685F, -2.0382F, -0.4088F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F))
		.texOffs(50, 2).addBox(-3.3009F, -1.7212F, -0.408F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.41F))
		.texOffs(50, 27).addBox(-4.3822F, 0.1392F, -0.4088F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1766F, 0.1499F, -0.4049F, -0.0859F, 0.1619F, -0.4918F));

		PartDefinition head_r39 = left_ear2.addOrReplaceChild("head_r39", CubeListBuilder.create().texOffs(50, 2).addBox(-3.3261F, -0.6151F, -0.4088F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.28F)), PartPose.offsetAndRotation(-0.1766F, 0.1499F, -0.4049F, -0.1714F, 0.0646F, -1.2147F));

		PartDefinition head_r40 = left_ear2.addOrReplaceChild("head_r40", CubeListBuilder.create().texOffs(49, 2).addBox(-4.1526F, -0.2526F, -0.4088F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.27F)), PartPose.offsetAndRotation(-0.1766F, 0.1499F, -0.4049F, -0.0329F, 0.1801F, -0.1824F));

		PartDefinition head_r41 = left_ear2.addOrReplaceChild("head_r41", CubeListBuilder.create().texOffs(50, 27).addBox(-1.9457F, 0.1763F, -0.4088F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.1766F, 0.1499F, -0.4049F, -0.0714F, 0.1687F, -0.4036F));

		PartDefinition head_r42 = left_ear2.addOrReplaceChild("head_r42", CubeListBuilder.create().texOffs(50, 27).addBox(-3.1793F, 2.0001F, -0.4088F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1766F, 0.1499F, -0.4049F, -0.0007F, 0.1831F, -0.0049F));

		PartDefinition head_r43 = left_ear2.addOrReplaceChild("head_r43", CubeListBuilder.create().texOffs(52, 27).addBox(-2.95F, -2.1255F, -0.4088F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.7766F, 0.6499F, -0.4049F, -0.1128F, 0.1445F, -0.6676F));

		PartDefinition head_r44 = left_ear2.addOrReplaceChild("head_r44", CubeListBuilder.create().texOffs(53, 27).addBox(-1.0856F, 1.5621F, -0.4067F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1766F, 0.1499F, -0.4049F, -0.1463F, 0.1105F, -0.9293F));

		PartDefinition head_r45 = left_ear2.addOrReplaceChild("head_r45", CubeListBuilder.create().texOffs(53, 27).addBox(-3.4695F, 1.2121F, -0.4088F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1766F, 0.1499F, -0.4049F, -0.1816F, 0.0231F, -1.4469F));

		PartDefinition head_r46 = left_ear2.addOrReplaceChild("head_r46", CubeListBuilder.create().texOffs(54, 27).addBox(1.6544F, 1.2263F, -0.4088F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0266F, 0.4499F, -0.4049F, -0.1825F, 0.0152F, -1.4898F));

		PartDefinition head_r47 = left_ear2.addOrReplaceChild("head_r47", CubeListBuilder.create().texOffs(54, 27).addBox(-0.7853F, 2.0892F, -0.4088F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1766F, 0.1499F, -0.4049F, -0.166F, -0.0777F, -2.0055F));

		PartDefinition head_r48 = left_ear2.addOrReplaceChild("head_r48", CubeListBuilder.create().texOffs(54, 27).addBox(0.4861F, -2.4131F, -0.4088F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1766F, 0.1499F, -0.4049F, -0.0639F, 0.1717F, -0.3595F));

		PartDefinition right_ear2 = real_head.addOrReplaceChild("right_ear2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -6.05F, 1.5F, 0.0F, 1.7453F, 0.0F));

		PartDefinition head_r49 = right_ear2.addOrReplaceChild("head_r49", CubeListBuilder.create().texOffs(50, 2).mirror().addBox(-3.2331F, -2.0374F, -0.6088F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
		.texOffs(50, 2).mirror().addBox(-0.6121F, -1.7671F, -0.6088F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.41F)).mirror(false)
		.texOffs(50, 27).mirror().addBox(1.3807F, 0.14F, -0.6088F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.1766F, 0.1499F, -0.4049F, -0.0859F, -0.1619F, 0.4918F));

		PartDefinition head_r50 = right_ear2.addOrReplaceChild("head_r50", CubeListBuilder.create().texOffs(50, 2).mirror().addBox(-0.6742F, -0.6143F, -0.5088F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.27F)).mirror(false), PartPose.offsetAndRotation(0.1766F, 0.1499F, -0.4049F, -0.1714F, -0.0646F, 1.2147F));

		PartDefinition head_r51 = right_ear2.addOrReplaceChild("head_r51", CubeListBuilder.create().texOffs(49, 2).mirror().addBox(-0.8491F, -0.2524F, -0.6088F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.27F)).mirror(false), PartPose.offsetAndRotation(0.1766F, 0.1499F, -0.4049F, -0.0329F, -0.1801F, 0.1824F));

		PartDefinition head_r52 = right_ear2.addOrReplaceChild("head_r52", CubeListBuilder.create().texOffs(50, 27).mirror().addBox(-3.0559F, 0.177F, -0.6088F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.1766F, 0.1499F, -0.4049F, -0.0714F, -0.1687F, 0.4036F));

		PartDefinition head_r53 = right_ear2.addOrReplaceChild("head_r53", CubeListBuilder.create().texOffs(50, 27).mirror().addBox(-1.8224F, 2.0001F, -0.6088F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.1766F, 0.1499F, -0.4049F, -0.0007F, -0.1831F, 0.0049F));

		PartDefinition head_r54 = right_ear2.addOrReplaceChild("head_r54", CubeListBuilder.create().texOffs(52, 27).mirror().addBox(-3.1126F, -2.2035F, -0.6088F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.7766F, 0.6499F, -0.4049F, -0.1128F, -0.1445F, 0.6676F));

		PartDefinition head_r55 = right_ear2.addOrReplaceChild("head_r55", CubeListBuilder.create().texOffs(54, 27).mirror().addBox(-1.8247F, 1.444F, -0.608F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1766F, 0.1499F, -0.4049F, -0.1463F, -0.1105F, 0.9293F));

		PartDefinition head_r56 = right_ear2.addOrReplaceChild("head_r56", CubeListBuilder.create().texOffs(53, 27).mirror().addBox(0.4566F, 1.313F, -0.608F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1766F, 0.1499F, -0.4049F, -0.1816F, -0.0231F, 1.4469F));

		PartDefinition head_r57 = right_ear2.addOrReplaceChild("head_r57", CubeListBuilder.create().texOffs(54, 27).mirror().addBox(-3.6546F, 1.228F, -0.6088F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0266F, 0.4499F, -0.4049F, -0.1825F, -0.0152F, 1.4898F));

		PartDefinition head_r58 = right_ear2.addOrReplaceChild("head_r58", CubeListBuilder.create().texOffs(54, 27).mirror().addBox(-1.1713F, 2.1812F, -0.608F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.1766F, 0.1499F, -0.4049F, -0.166F, 0.0777F, 2.0055F));

		PartDefinition head_r59 = right_ear2.addOrReplaceChild("head_r59", CubeListBuilder.create().texOffs(54, 27).mirror().addBox(-3.4878F, -2.4125F, -0.6088F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1766F, 0.1499F, -0.4049F, -0.0639F, -0.1717F, 0.3595F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}
