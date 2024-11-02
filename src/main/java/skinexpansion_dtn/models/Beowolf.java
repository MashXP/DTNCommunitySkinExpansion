package skinexpansion_dtn.models;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class Beowolf {
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition glowing_eyes = partdefinition.addOrReplaceChild("glowing_eyes", CubeListBuilder.create(), PartPose.offset(0.0F, 7.5F, -6.0F));

		PartDefinition real_glowing_eyes = glowing_eyes.addOrReplaceChild("real_glowing_eyes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_r1 = real_glowing_eyes.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(50, 57).mirror().addBox(0.0F, -1.5F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.7807F, -1.9075F, 0.8599F, 0.2332F, 0.2622F));

		PartDefinition head_r2 = real_glowing_eyes.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(50, 57).addBox(-2.0F, -1.5F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.4F, -0.7807F, -1.9075F, 0.8599F, -0.2332F, -0.2622F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 12.0F, 8.0F, 1.6144F, 0.0F, 0.0F));

		PartDefinition real_tail = tail.addOrReplaceChild("real_tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail_r1 = real_tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(38, 51).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 6.5F, 1.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail_r2 = real_tail.addOrReplaceChild("tail_r2", CubeListBuilder.create().texOffs(46, 53).addBox(0.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.0F, 2.25F, -0.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition tail_r3 = real_tail.addOrReplaceChild("tail_r3", CubeListBuilder.create().texOffs(38, 51).addBox(0.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.0F, 4.25F, -0.5F, -0.7418F, 0.0F, 0.0F));

		PartDefinition tail_r4 = real_tail.addOrReplaceChild("tail_r4", CubeListBuilder.create().texOffs(50, 9).addBox(0.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(-1.0F, 6.5F, 1.75F, -0.7418F, 0.0F, 0.0F));

		PartDefinition tail_r5 = real_tail.addOrReplaceChild("tail_r5", CubeListBuilder.create().texOffs(30, 45).addBox(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.65F)), PartPose.offsetAndRotation(-1.0F, 5.05F, 1.0F, -0.7245F, -0.1758F, -0.195F));

		PartDefinition tail_r6 = real_tail.addOrReplaceChild("tail_r6", CubeListBuilder.create().texOffs(48, 21).addBox(0.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.65F)), PartPose.offsetAndRotation(-1.0F, 5.05F, 1.0F, -0.4055F, 0.2332F, 0.2622F));

		PartDefinition tail_r7 = real_tail.addOrReplaceChild("tail_r7", CubeListBuilder.create().texOffs(30, 45).addBox(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.0F, 5.05F, 1.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition tail_r8 = real_tail.addOrReplaceChild("tail_r8", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(-2.0F, 1.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.2182F));

		PartDefinition tail_r9 = real_tail.addOrReplaceChild("tail_r9", CubeListBuilder.create().texOffs(38, 51).addBox(0.0F, 3.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.2618F, 0.0F, -0.2182F));

		PartDefinition tail_r10 = real_tail.addOrReplaceChild("tail_r10", CubeListBuilder.create().texOffs(38, 51).addBox(0.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.0F, 6.25F, 0.0F, 0.2921F, 0.0905F, -0.2921F));

		PartDefinition tail_r11 = real_tail.addOrReplaceChild("tail_r11", CubeListBuilder.create().texOffs(50, 9).addBox(0.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition right_hind_leg = partdefinition.addOrReplaceChild("right_hind_leg", CubeListBuilder.create().texOffs(14, 48).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 16.0F, 7.0F));

		PartDefinition leg5_r1 = right_hind_leg.addOrReplaceChild("leg5_r1", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-1.025F, -0.7967F, -0.7248F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.75F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 3.7885F, -1.227F, -2.618F, -0.0873F, 3.1416F));

		PartDefinition leg4_r1 = right_hind_leg.addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-0.975F, -0.8566F, -2.2884F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(-0.025F, 3.7885F, -1.727F, -3.0543F, -0.0873F, 3.1416F));

		PartDefinition leg4_r2 = right_hind_leg.addOrReplaceChild("leg4_r2", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 4.5769F, 2.2959F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leg3_r1 = right_hind_leg.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.0F, 0.75F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leg3_r2 = right_hind_leg.addOrReplaceChild("leg3_r2", CubeListBuilder.create().texOffs(48, 36).mirror().addBox(-1.0F, -5.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 3.5F, 0.5F, 0.6109F, 0.0F, 0.0F));

		PartDefinition leg4_r3 = right_hind_leg.addOrReplaceChild("leg4_r3", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.55F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.5F, 0.55F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leg5_r2 = right_hind_leg.addOrReplaceChild("leg5_r2", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.8F)).mirror(false), PartPose.offsetAndRotation(-0.05F, 6.3269F, 1.5959F, 0.5236F, 0.0F, 0.0F));

		PartDefinition left_hind_leg = partdefinition.addOrReplaceChild("left_hind_leg", CubeListBuilder.create().texOffs(14, 48).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 16.0F, 7.0F));

		PartDefinition leg5_r3 = left_hind_leg.addOrReplaceChild("leg5_r3", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.8F)), PartPose.offsetAndRotation(0.05F, 6.3269F, 1.5959F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leg4_r4 = left_hind_leg.addOrReplaceChild("leg4_r4", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.55F)), PartPose.offsetAndRotation(0.0F, 6.5F, 0.55F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leg4_r5 = left_hind_leg.addOrReplaceChild("leg4_r5", CubeListBuilder.create().texOffs(32, 0).addBox(-1.025F, -0.8566F, -2.2884F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(0.025F, 3.7885F, -1.727F, -3.0543F, 0.0873F, -3.1416F));

		PartDefinition leg5_r4 = left_hind_leg.addOrReplaceChild("leg5_r4", CubeListBuilder.create().texOffs(32, 0).addBox(-0.975F, -0.7967F, -0.7248F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(0.025F, 3.7885F, -1.227F, -2.618F, 0.0873F, -3.1416F));

		PartDefinition leg4_r6 = left_hind_leg.addOrReplaceChild("leg4_r6", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(0.05F, 4.5769F, 2.2959F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leg3_r3 = left_hind_leg.addOrReplaceChild("leg3_r3", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 5.0F, 0.75F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leg3_r4 = left_hind_leg.addOrReplaceChild("leg3_r4", CubeListBuilder.create().texOffs(48, 36).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.5F, 0.5F, 0.6109F, 0.0F, 0.0F));

		PartDefinition right_front_leg = partdefinition.addOrReplaceChild("right_front_leg", CubeListBuilder.create().texOffs(22, 48).addBox(-1.75F, 2.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.25F))
		.texOffs(54, 19).addBox(-1.75F, 1.5F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.85F))
		.texOffs(51, 0).addBox(-1.75F, 8.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.5F)), PartPose.offset(-1.5F, 12.0F, -4.0F));

		PartDefinition leg5_r5 = right_front_leg.addOrReplaceChild("leg5_r5", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-3.5F, -9.0F, -5.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.15F)).mirror(false), PartPose.offsetAndRotation(1.7F, 10.0F, 1.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition leg4_r7 = right_front_leg.addOrReplaceChild("leg4_r7", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-1.025F, -2.154F, 0.1743F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)).mirror(false)
		.texOffs(32, 0).mirror().addBox(-1.025F, -0.6385F, -0.7007F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.7F)).mirror(false)
		.texOffs(32, 0).mirror().addBox(-1.025F, 0.3106F, -2.057F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.8F)).mirror(false), PartPose.offsetAndRotation(-1.825F, 7.9135F, 1.923F, 0.5236F, -0.3927F, 0.0F));

		PartDefinition leg3_r5 = right_front_leg.addOrReplaceChild("leg3_r5", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-0.975F, -2.4667F, -2.0472F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.35F)).mirror(false)
		.texOffs(32, 0).mirror().addBox(-0.975F, -0.7234F, -2.1997F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.45F)).mirror(false)
		.texOffs(32, 0).mirror().addBox(-0.975F, 0.7535F, -2.5297F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.55F)).mirror(false), PartPose.offsetAndRotation(-1.825F, 7.9135F, 1.923F, 0.0873F, -0.3927F, 0.0F));

		PartDefinition mane_rotation_r1 = right_front_leg.addOrReplaceChild("mane_rotation_r1", CubeListBuilder.create().texOffs(10, 41).addBox(-2.25F, -0.875F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F))
		.texOffs(10, 41).addBox(-1.25F, -0.975F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)), PartPose.offsetAndRotation(-2.5F, 3.125F, -0.75F, -0.0285F, 0.1278F, -0.22F));

		PartDefinition left_front_leg = partdefinition.addOrReplaceChild("left_front_leg", CubeListBuilder.create().texOffs(22, 48).addBox(-0.25F, 2.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.25F))
		.texOffs(54, 19).mirror().addBox(-0.25F, 1.5F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.85F)).mirror(false)
		.texOffs(51, 0).addBox(-0.25F, 8.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.5F)), PartPose.offset(1.5F, 12.0F, -4.0F));

		PartDefinition leg4_r8 = left_front_leg.addOrReplaceChild("leg4_r8", CubeListBuilder.create().texOffs(32, 0).addBox(-1.025F, -0.7234F, -2.1997F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.45F))
		.texOffs(32, 0).addBox(-1.025F, 0.7535F, -2.5297F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.55F))
		.texOffs(32, 0).addBox(-1.025F, -2.4667F, -2.0472F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.825F, 7.9135F, 1.923F, 0.0873F, 0.3927F, 0.0F));

		PartDefinition leg5_r6 = left_front_leg.addOrReplaceChild("leg5_r6", CubeListBuilder.create().texOffs(32, 0).addBox(-0.975F, 0.3106F, -2.057F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.8F))
		.texOffs(32, 0).addBox(-0.975F, -0.6385F, -0.7007F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.7F))
		.texOffs(32, 0).addBox(-0.975F, -2.154F, 0.1743F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(1.825F, 7.9135F, 1.923F, 0.5236F, 0.3927F, 0.0F));

		PartDefinition leg5_r7 = left_front_leg.addOrReplaceChild("leg5_r7", CubeListBuilder.create().texOffs(0, 49).addBox(1.5F, -9.0F, -5.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-1.7F, 10.0F, 1.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r2 = left_front_leg.addOrReplaceChild("mane_rotation_r2", CubeListBuilder.create().texOffs(10, 41).mirror().addBox(-0.75F, -0.875F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F)).mirror(false)
		.texOffs(10, 41).mirror().addBox(-1.75F, -0.975F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)).mirror(false), PartPose.offsetAndRotation(2.5F, 3.125F, -0.75F, -0.0285F, -0.1278F, 0.22F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(18, 22).addBox(-3.0F, 3.0F, -3.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r3 = body.addOrReplaceChild("mane_rotation_r3", CubeListBuilder.create().texOffs(11, 28).addBox(-0.5F, -1.5642F, 0.4484F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4597F, 3.1036F, -0.2618F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r4 = body.addOrReplaceChild("mane_rotation_r4", CubeListBuilder.create().texOffs(11, 28).addBox(-0.5F, -1.5642F, 0.4484F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0403F, 2.3536F, -0.5236F, 0.0F, 0.0F));

		PartDefinition body_rotation_r1 = body.addOrReplaceChild("body_rotation_r1", CubeListBuilder.create().texOffs(36, 26).mirror().addBox(-4.0F, -1.7903F, -5.1036F, 3.0F, 4.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false)
		.texOffs(36, 26).addBox(1.0F, -1.7903F, -5.1036F, 3.0F, 4.0F, 6.0F, new CubeDeformation(-0.2F))
		.texOffs(0, 13).addBox(-3.0F, -3.7903F, -5.1036F, 6.0F, 9.0F, 6.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 0.0403F, 3.3536F, -0.3491F, 0.0F, 0.0F));

		PartDefinition upper_body = partdefinition.addOrReplaceChild("upper_body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -2.75F, -3.0F, 8.0F, 6.0F, 7.0F, new CubeDeformation(-0.1F))
		.texOffs(0, 28).addBox(-5.0F, -2.75F, -3.0F, 2.0F, 6.0F, 7.0F, new CubeDeformation(-0.35F))
		.texOffs(0, 28).mirror().addBox(3.0F, -2.75F, -3.0F, 2.0F, 6.0F, 7.0F, new CubeDeformation(-0.35F)).mirror(false)
		.texOffs(51, 43).mirror().addBox(4.0F, -1.75F, -2.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false)
		.texOffs(10, 41).mirror().addBox(4.25F, -1.6F, -2.75F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.55F)).mirror(false)
		.texOffs(10, 41).mirror().addBox(5.25F, -1.5F, -2.75F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F)).mirror(false)
		.texOffs(10, 41).addBox(-7.25F, -1.6F, -2.75F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.55F))
		.texOffs(10, 41).addBox(-8.25F, -1.5F, -2.75F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F))
		.texOffs(51, 43).addBox(-6.0F, -1.75F, -2.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 12.0F, -3.0F, 1.309F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r5 = upper_body.addOrReplaceChild("mane_rotation_r5", CubeListBuilder.create().texOffs(38, 45).addBox(1.0F, -3.0F, 2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.0F, 3.25F, 0.8F, -0.1745F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r6 = upper_body.addOrReplaceChild("mane_rotation_r6", CubeListBuilder.create().texOffs(53, 27).addBox(1.0F, -2.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-1.5F, -1.45F, 1.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r7 = upper_body.addOrReplaceChild("mane_rotation_r7", CubeListBuilder.create().texOffs(53, 27).addBox(1.0F, -2.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(-1.5F, 0.55F, 1.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r8 = upper_body.addOrReplaceChild("mane_rotation_r8", CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -2.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -1.3F, 1.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r9 = upper_body.addOrReplaceChild("mane_rotation_r9", CubeListBuilder.create().texOffs(24, 7).addBox(0.0F, -3.0F, -2.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.0F, -3.0F, 2.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition mane_rotation_r10 = upper_body.addOrReplaceChild("mane_rotation_r10", CubeListBuilder.create().texOffs(10, 41).addBox(-2.25F, -0.875F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F))
		.texOffs(10, 41).addBox(-1.25F, -0.975F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)), PartPose.offsetAndRotation(-5.0F, -0.375F, -0.25F, -0.0285F, 0.1278F, -0.22F));

		PartDefinition mane_rotation_r11 = upper_body.addOrReplaceChild("mane_rotation_r11", CubeListBuilder.create().texOffs(51, 43).addBox(-0.25F, -1.125F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.55F)), PartPose.offsetAndRotation(-5.5F, -0.375F, -0.25F, -0.0285F, 0.1278F, -0.22F));

		PartDefinition mane_rotation_r12 = upper_body.addOrReplaceChild("mane_rotation_r12", CubeListBuilder.create().texOffs(10, 41).mirror().addBox(-0.75F, -0.875F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F)).mirror(false)
		.texOffs(10, 41).mirror().addBox(-1.75F, -0.975F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.65F)).mirror(false), PartPose.offsetAndRotation(5.0F, -0.375F, -0.25F, -0.0285F, -0.1278F, 0.22F));

		PartDefinition mane_rotation_r13 = upper_body.addOrReplaceChild("mane_rotation_r13", CubeListBuilder.create().texOffs(51, 43).mirror().addBox(-1.75F, -1.125F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.55F)).mirror(false), PartPose.offsetAndRotation(5.5F, -0.375F, -0.25F, -0.0285F, -0.1278F, 0.22F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 7.5F, -6.0F));

		PartDefinition real_head = head.addOrReplaceChild("real_head", CubeListBuilder.create().texOffs(18, 32).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.2F))
		.texOffs(16, 42).addBox(-3.0F, -4.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.6F))
		.texOffs(16, 42).mirror().addBox(0.0F, -4.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.6F)).mirror(false)
		.texOffs(16, 42).mirror().addBox(0.0F, -3.25F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.05F)).mirror(false)
		.texOffs(16, 42).addBox(-3.0F, -3.25F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.05F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_r3 = real_head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(16, 42).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.0F, -0.75F, 1.25F, -0.6981F, 0.0F, 0.0F));

		PartDefinition head_r4 = real_head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(23, 0).mirror().addBox(0.0F, -1.5F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.7807F, -1.9075F, 0.8599F, 0.2332F, 0.2622F));

		PartDefinition head_r5 = real_head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(23, 0).addBox(-2.0F, -1.5F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4F, -0.7807F, -1.9075F, 0.8599F, -0.2332F, -0.2622F));

		PartDefinition head_r6 = real_head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(46, 47).mirror().addBox(0.0F, -1.5F, -2.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.1001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8807F, -1.9075F, 0.8367F, 0.1176F, 0.1293F));

		PartDefinition head_r7 = real_head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(46, 47).addBox(-2.0F, -1.5F, -2.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, -0.8807F, -1.9075F, 0.8367F, -0.1176F, -0.1293F));

		PartDefinition head_r8 = real_head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(33, 37).addBox(-1.7F, -1.5F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.45F, 0.1F, -0.5F, 0.22F, 0.1278F, 0.0285F));

		PartDefinition head_r9 = real_head.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(33, 37).mirror().addBox(-3.3F, -1.5F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 0.1F, -0.5F, 0.22F, -0.1278F, -0.0285F));

		PartDefinition snout = real_head.addOrReplaceChild("snout", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5F, -2.0F));

		PartDefinition snout_upper = snout.addOrReplaceChild("snout_upper", CubeListBuilder.create(), PartPose.offset(0.0F, -0.52F, 0.0F));

		PartDefinition head_r10 = snout_upper.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(36, 21).mirror().addBox(-2.439F, -1.0F, -0.7145F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.3F, -1.1484F, 0.4812F, -0.5973F, -0.2856F));

		PartDefinition head_r11 = snout_upper.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(36, 21).addBox(-0.561F, -1.0F, -0.7145F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -1.1484F, 0.4812F, 0.5973F, 0.2856F));

		PartDefinition head_r12 = snout_upper.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, -1.0F, -3.0516F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3F, -3.0984F, 0.3054F, 0.0F, 0.0F));

		PartDefinition head_r13 = snout_upper.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(18, 13).addBox(-1.5F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
		.texOffs(18, 13).mirror().addBox(0.8F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 2.0332F, -5.3612F, 0.3054F, 0.0F, 0.0F));

		PartDefinition head_r14 = snout_upper.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(38, 14).addBox(-1.5F, -1.0F, -3.0516F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.7F, -3.3984F, 0.2182F, 0.0F, 0.0F));

		PartDefinition snout_lower = snout.addOrReplaceChild("snout_lower", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.98F, -0.75F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head_r15 = snout_lower.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(18, 13).addBox(-1.5F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F))
		.texOffs(18, 13).mirror().addBox(-0.2F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.35F, 0.5332F, -4.3112F, -0.0436F, 0.0F, 0.0F));

		PartDefinition head_r16 = snout_lower.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(24, 19).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.15F, -1.4F, 0.3491F, 0.0F, 0.0F));

		PartDefinition head_r17 = snout_lower.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(38, 9).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.3832F, -4.1112F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head_r18 = snout_lower.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(38, 9).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.7332F, -4.1112F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head_r19 = snout_lower.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(24, 19).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.25F, 0.3491F, 0.0F, 0.0F));

		PartDefinition left_ear = real_head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(1.5F, -2.25F, 0.5F));

		PartDefinition head_r20 = left_ear.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(0, 15).addBox(-0.0962F, -2.731F, -0.6243F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2016F, -0.9651F, 0.6961F, -0.2983F, -0.223F, 0.2665F));

		PartDefinition head_r21 = left_ear.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(0, 15).addBox(-0.0962F, -2.731F, -0.6243F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.0516F, 0.7849F, 0.4461F, 0.2454F, -0.2804F, -1.4164F));

		PartDefinition head_r22 = left_ear.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(0, 15).addBox(-0.0962F, -2.731F, -0.6243F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(2.3016F, 1.5349F, -0.0539F, 0.0849F, -0.361F, -0.9171F));

		PartDefinition head_r23 = left_ear.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(0, 15).addBox(-0.0962F, -2.731F, -0.6243F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
		.texOffs(0, 3).addBox(-0.9999F, -1.7763F, -0.7334F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.8016F, -1.4651F, 0.6961F, -0.2983F, -0.223F, 0.2665F));

		PartDefinition head_r24 = left_ear.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(0, 13).addBox(-0.8592F, -0.4299F, -0.611F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.8016F, -1.4651F, 0.6961F, 0.0071F, -0.223F, 0.2665F));

		PartDefinition head_r25 = left_ear.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(0, 3).addBox(-0.854F, 0.2685F, -0.7516F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(1.8016F, -1.4651F, 0.6961F, -0.0892F, -0.2048F, 0.7128F));

		PartDefinition right_ear = real_head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-1.5F, -2.25F, 0.5F));

		PartDefinition head_r26 = right_ear.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-0.9038F, -2.731F, -0.6243F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2016F, -0.9651F, 0.6961F, -0.2983F, 0.223F, -0.2665F));

		PartDefinition head_r27 = right_ear.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-0.9038F, -2.731F, -0.6243F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
		.texOffs(0, 3).mirror().addBox(-1.0001F, -1.7763F, -0.7334F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.8016F, -1.4651F, 0.6961F, -0.2983F, 0.223F, -0.2665F));

		PartDefinition head_r28 = right_ear.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-1.1408F, -0.4299F, -0.611F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-1.8016F, -1.4651F, 0.6961F, 0.0071F, 0.223F, -0.2665F));

		PartDefinition head_r29 = right_ear.addOrReplaceChild("head_r29", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-0.9038F, -2.731F, -0.6243F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-2.3016F, 1.5349F, -0.0539F, 0.0849F, 0.361F, 0.9171F));

		PartDefinition head_r30 = right_ear.addOrReplaceChild("head_r30", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-0.9038F, -2.731F, -0.6243F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-3.0516F, 0.7849F, 0.4461F, 0.2454F, 0.2804F, 1.4164F));

		PartDefinition head_r31 = right_ear.addOrReplaceChild("head_r31", CubeListBuilder.create().texOffs(0, 3).mirror().addBox(-1.146F, 0.2685F, -0.7516F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(-1.8016F, -1.4651F, 0.6961F, -0.0892F, 0.2048F, -0.7128F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

}
